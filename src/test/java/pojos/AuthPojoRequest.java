package pojos;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
@Builder //что бы не писать сетторы и гетторы
@NoArgsConstructor
@AllArgsConstructor
public class AuthPojoRequest {
    private String password;
    private String email;
}
