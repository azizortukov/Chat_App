package uz.anas.web_socket.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.messaging.simp.SimpMessagingTemplate;
import org.springframework.web.bind.annotation.*;
import uz.anas.web_socket.dto.MessageDTO;
import uz.anas.web_socket.entity.Message;
import uz.anas.web_socket.repo.MessageRepository;
import uz.anas.web_socket.repo.UserRepository;

@RequestMapping("/api/message")
@RestController
@RequiredArgsConstructor
public class MessageController {

    private final MessageRepository messageRepository;
    private final UserRepository userRepository;
    private final SimpMessagingTemplate simpMessagingTemplate;


    @GetMapping
    public HttpEntity<?> getAllMessages(@RequestParam Integer fromId, @RequestParam Integer toId) {
        return ResponseEntity.ok(
                messageRepository.findAllByFromAndTo(fromId, toId)
        );
    }

    @PostMapping
    public HttpEntity<?> save(@RequestBody MessageDTO messageDTO) {
        Message message = messageRepository.save(
                Message.builder()
                .content(messageDTO.getContent())
                .from(userRepository.findById(messageDTO.getFromId()).orElseThrow(RuntimeException::new))
                .to(userRepository.findById(messageDTO.getToId()).orElseThrow(RuntimeException::new))
                .build());
        simpMessagingTemplate.convertAndSend("/topic/" + messageDTO.getToId(), message);
        return ResponseEntity.status(201).body(message);
    }



}
