package uz.anas.web_socket.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class MessageDTO {

    private String content;
    private Integer fromId;
    private Integer toId;

}
