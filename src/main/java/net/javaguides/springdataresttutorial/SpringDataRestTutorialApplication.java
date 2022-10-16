package net.javaguides.springdataresttutorial;

import net.javaguides.springdataresttutorial.entity.User;
import net.javaguides.springdataresttutorial.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringDataRestTutorialApplication implements CommandLineRunner {

	@Autowired
	UserRepository userRepository;
	public static void main(String[] args) {
		SpringApplication.run(SpringDataRestTutorialApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		User user= User.builder().firstName("Minh").lastName("Pham").email("hadtnt71@gmail.com").build();
		User user1= User.builder().firstName("Minh1").lastName("Pham1").email("hadtnt71@gmail.com").build();
		userRepository.save(user);
		userRepository.save(user1);
	}
}
