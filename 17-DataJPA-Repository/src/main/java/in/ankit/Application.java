package in.ankit;

import java.util.Arrays;
import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;

import in.ankit.entity.User;
import in.ankit.repository.UserRepository;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(Application.class, args);
		UserRepository repository = context.getBean(UserRepository.class);
		User u1 = new User(101, "Raju", "Male", 23, "India");
		User u2 = new User(102, "Sara", "Female", 25, "USA");
		User u3 = new User(103, "John", "Male", 30, "UK");
		User u4 = new User(104, "Emily", "Female", 28, "Canada");
		User u5 = new User(105, "David", "Male", 35, "Australia");
		User u6 = new User(106, "Sophia", "Female", 22, "France");
		User u7 = new User(107, "Michael", "Male", 27, "Germany");
		User u8 = new User(108, "Emma", "Female", 29, "Spain");
		User u9 = new User(109, "Ryan", "Male", 31, "Italy");
		User u10 = new User(110, "Olivia", "Female", 26, "Japan");
		repository.saveAll(Arrays.asList(u1, u2, u3, u4, u5, u6, u7, u8, u9, u10));
		//Sorting
//		List<User> findAll = repository.findAll(Sort.by("userName").descending());
//		findAll.forEach(num->System.out.println(num));
		
//		//Pagination
//		PageRequest pageRequest = PageRequest.of(2, 3);
//		Page<User> findAll1 = repository.findAll(pageRequest);
//		findAll1.forEach(num->System.out.println(num));
		
		User user=new User();
		user.setCountry("India");
		Example<User> example = Example.of(user);
       List<User> findAll = repository.findAll(example);
       findAll.forEach(num->System.out.println(num));
	}
	
	

}
