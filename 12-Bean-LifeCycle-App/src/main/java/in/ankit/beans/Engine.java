package in.ankit.beans;

import org.springframework.stereotype.Component;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;

@Component
public class Engine {

	@PostConstruct
	public void init() {
		System.err.println("Engine Started");
	}
	
	@PreDestroy
	public void destory() {
		System.out.println("Engine Destory");
	}
}
