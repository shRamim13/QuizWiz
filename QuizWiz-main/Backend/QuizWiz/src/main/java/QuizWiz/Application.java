package QuizWiz;

import java.util.HashSet;
import java.util.Set;

import QuizWiz.entity.Role;
import QuizWiz.entity.User;
import QuizWiz.entity.UserRole;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import QuizWiz.assistant.UserFoundException;
import QuizWiz.service.UserService;

@SpringBootApplication
public class Application implements CommandLineRunner {

	@Autowired
	private UserService userService;


	@Autowired
    private BCryptPasswordEncoder bCryptPasswordEncoder;

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
	    try {
		System.out.println("starting code..");

		
		  User user = new User(); user.setFirstName("Sabbir");
		  user.setLastName("Hossen"); user.setEmail("shramim13@gmail.com");
		  user.setPhone("01626016869"); user.setUsername("admin");
		  user.setPassword(this.bCryptPasswordEncoder.encode("123"));
		  user.setProfile("default.png");
		  
		  Role role1 = new Role(); role1.setRoleId(44L); role1.setRoleName("ADMIN");
		  
		  Set<UserRole> userRoleSet = new HashSet<>();
		  
		  UserRole userRole = new UserRole(); userRole.setRole(role1);
		  userRole.setUser(user);
		  
		  userRoleSet.add(userRole);
		  
		  User user1 = this.userService.createUser(user, userRoleSet);
		  System.out.println(user1.getUsername());
		 
		
	    } catch (UserFoundException e) {
            //e.printStackTrace();
            System.out.println("User is found !!");
        }

	}

}
