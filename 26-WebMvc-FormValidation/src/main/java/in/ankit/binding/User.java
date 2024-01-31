package in.ankit.binding;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;
import lombok.Data;

@Data
public class User {

    @NotEmpty(message="User name is mandatory")
    @Size(min = 3, max = 50, message = "User name must be between 3 and 50 characters")
    private String uname;
    
    @NotEmpty(message="Password is mandatory")
    @Size(min = 8, message = "Password must be at least 8 characters long")
    private String pwd;

    @NotEmpty(message="Email is required")
    @Email(message = "Email should be valid")
    private String email;

    @NotNull(message="Phone number can not be null")
    @Pattern(regexp="\\d{10}", message="Phone number must be 10 digits")
    private String phno;

    @NotNull(message="Age cannot be null")
    @Min(value = 18, message = "Age must be equal to or greater than 18")
    @Max(value = 150, message = "Age must be less than 150")
    private Integer age;

}


