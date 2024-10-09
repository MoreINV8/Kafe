package ku.cs.cafe.request;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import ku.cs.cafe.validation.ValidPassword;
import lombok.Data;

@Data
public class SignupRequest {

    @NotBlank
    @Size(min=4, message = "Username must have at least 4 characters")
    private String name;

    @NotBlank
    @Size(min=4, max=128, message = "Password must have at least 8 characters")
    private String username;

    @ValidPassword
    private String password;
}
