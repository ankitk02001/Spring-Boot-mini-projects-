package in.ankit;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import org.hibernate.internal.build.AllowSysOut;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

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

//		Optional<User> findById = repository.findById(101);
//		if (findById.isPresent()) {
//			System.out.println(findById);
//		}

//		Iterable<User> findAllById = repository.findAllById(Arrays.asList(102, 103, 104, 103, 109));
//		findAllById.forEach(num -> System.out.println(num));

//		Iterable<User> findAll = repository.findAll();
//		findAll.forEach(num->System.out.println(num));

//		long count = repository.count();
//		System.out.println(count);

//		boolean existsById = repository.existsById(143);
//		System.out.println(existsById);

//		repository.deleteById(103);

//		repository.deleteAll();

//		List<User> findByCountry = repository.findByCountry("India");
//		findByCountry.forEach(num->System.out.println(num));

//		List<User> findByAge = repository.findByAge(23);
//		findByAge.forEach(num->System.out.println(num));

//		List<User> findByAgeGreaterThanEqual = repository.findByAgeGreaterThanEqual(23);
//		findByAgeGreaterThanEqual.forEach(sum->System.out.println(sum));

//		List<User> findByCountryIn = repository.findByCountryIn(Arrays.asList("India", "France"));
//		findByCountryIn.forEach(num->System.out.println(num));
		
		List<User> findByCountryAndAge = repository.findByCountryAndAge("India", 23);
		findByCountryAndAge.forEach(num->System.out.println(num));
		
		List<User> findByCountryAndAgeAndGender = repository.findByCountryAndAgeAndGender("India", 23, "Male");
		findByCountryAndAgeAndGender.forEach(num->System.out.println(num));
		
		////coustom Query///
//		List<User> allUserHql = repository.getAllUserHql();
//		allUserHql.forEach(num->System.out.println(num));
		
//		List<User> allUserSql = repository.getAllUserSql();
//		allUserSql.forEach(num->System.out.println(num));
		
		List<User> allUserByCountry = repository.getAllUserByCountry("india");
		allUserByCountry.forEach(num->System.out.println(num));
	}

}