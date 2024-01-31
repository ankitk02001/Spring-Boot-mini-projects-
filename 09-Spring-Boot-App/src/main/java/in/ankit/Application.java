package in.ankit;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import in.ankit.security.Security; // Assuming AppSecurity is in this package

@SpringBootApplication
@ComponentScan(basePackages = {"in.amit", "in.ankit"})
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
    

}
