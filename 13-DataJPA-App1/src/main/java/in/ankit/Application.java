package in.ankit;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import in.ankit.entity.Player;
import in.ankit.repository.PlayerRepository;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(Application.class, args);
		
         PlayerRepository playerRepository=context.getBean(PlayerRepository.class);
         System.out.println(playerRepository.getClass().getName());
         Player player=new Player();
         player.setPlayerId(103);
         player.setPlayerName("Ram");
         player.setPlayerAge(23);
         player.setAddress("Mumbai");
         playerRepository.save(player);
         Player player1=new Player();
         player1.setPlayerId(104);
         player1.setPlayerName("Anuj");
         player1.setPlayerAge(24);
         player1.setAddress("Delhi");
         playerRepository.save(player1);
         
	}

}
