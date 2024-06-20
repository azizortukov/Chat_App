package uz.anas.web_socket.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import uz.anas.web_socket.entity.User;
import uz.anas.web_socket.repo.UserRepository;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/user")
public class UserController {

    private final UserRepository userRepository;

    @GetMapping
    public List<User> findAllUsers() {
        return userRepository.findAll();
    }

}
