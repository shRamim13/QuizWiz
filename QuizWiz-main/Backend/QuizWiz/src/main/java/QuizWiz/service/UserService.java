package QuizWiz.service;

import java.util.Set;

import QuizWiz.entity.User;
import QuizWiz.entity.UserRole;
import QuizWiz.entity.exam.Exam;

public interface UserService {

	/* creating user */
	public User createUser(User user, Set<UserRole> userRoles) throws Exception;
	

	/* update user */
	public User updateUser(User user);
	

	/* get user by username */
	public User getUser(String username);
	
	/* get user by exam Id */
	public Set<User> getUserOfExam(Exam exam);
	

	/* delete user by userId */
	public void deleteUser(Long userId);
	
	
}
