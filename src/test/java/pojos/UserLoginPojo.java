package pojos;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder //что бы не писать сетторы и гетторы
@AllArgsConstructor
public class UserLoginPojo {
    private String password;
    private String email;
}
