package in.ankit.service;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.ankit.entity.User;
import in.ankit.repository.UserRepository;

@Service
public class UserService {

	@Autowired
	private UserRepository UserRepository;
	
	public void saveUser() throws Exception {
		User user =new User();
		user.setUserName("Aman");
		user.setUserEmail("Aman@gmail.com");
		
		//file to byte Array
		String imagePath="E:\\testingc\\a.jpg";
		FileInputStream fis=new FileInputStream(new File(imagePath));
		byte[] arr=new byte[1024];
		fis.read(arr);
		user.setUserImage(arr);
		//saving user
		UserRepository.save(user);
		
	}
}
