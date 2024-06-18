package uz.anas.web_socket.component;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import uz.anas.web_socket.entity.User;
import uz.anas.web_socket.repo.UserRepository;

@Component
@RequiredArgsConstructor
public class Runner implements CommandLineRunner {

    @Value("${spring.jpa.hibernate.ddl-auto}")
    private String ddl;
    private final UserRepository userRepository;


    @Override
    public void run(String... args) throws Exception {
        if (ddl.equals("create")) {
            userRepository.save(User.builder().fullName("Eshmat").build());
            userRepository.save(User.builder().fullName("Toshmat").build());
            userRepository.save(User.builder().fullName("Hikmat").build());
        }
    }
}
