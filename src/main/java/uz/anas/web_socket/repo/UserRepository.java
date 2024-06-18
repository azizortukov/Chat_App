package uz.anas.web_socket.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import uz.anas.web_socket.entity.User;

public interface UserRepository extends JpaRepository<User, Integer> {
}