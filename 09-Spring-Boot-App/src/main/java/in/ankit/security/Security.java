package in.ankit.security;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Security {

	public Security() {
		super();
		// TODO Auto-generated constructor stub
		System.out.println("Security class Constructor");
	}
	
    @Bean
    public Security createAppSecurity() {
        return new Security();
    }

}
