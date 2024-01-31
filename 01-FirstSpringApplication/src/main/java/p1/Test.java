package p1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("Spring-Beans.xml");
		
		Billcollector bc=context.getBean("BillCollector", Billcollector.class);
		bc.billCollector(23.45);
	}

}
