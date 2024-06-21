package uz.anas.web_socket.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import uz.anas.web_socket.entity.Message;

import java.util.List;

public interface MessageRepository extends JpaRepository<Message, Integer> {

    @Query(nativeQuery = true, value = """
            select * from message
            where (from_id = :fromId and to_id = :toId)
            or (to_id = :fromId and from_id = :toId)
            order by created_at
            """)
    List<Message> findAllByFromAndTo(Integer fromId, Integer toId);
}