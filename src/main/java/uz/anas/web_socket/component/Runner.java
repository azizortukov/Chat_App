package uz.anas.web_socket.component;

import lombok.RequiredArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import uz.anas.web_socket.entity.User;
import uz.anas.web_socket.repo.UserRepository;

@Component
@RequiredArgsConstructor
public class Runner implements CommandLineRunner {

    private final UserRepository userRepository;

    @Override
    public void run(String... args) throws Exception {
        if (userRepository.findAll().isEmpty()) {
            userRepository.save(User.builder().fullName("John").build());
            userRepository.save(User.builder().fullName("Ethan").build());
            userRepository.save(User.builder().fullName("Mia").build());
        }
    }
}
