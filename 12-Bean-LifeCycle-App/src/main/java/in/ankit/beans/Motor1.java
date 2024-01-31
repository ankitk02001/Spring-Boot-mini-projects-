package in.ankit.beans;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.stereotype.Component;

@Component
public class Motor1 implements DisposableBean {

	
	public Motor1() {
		System.out.println("Motor1 constructor");
	}

	@Override
	public void destroy() throws Exception {
		System.out.println("destory() method is called");
		
	}

}
