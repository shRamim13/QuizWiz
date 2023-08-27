package QuizWiz.DAO;

import java.util.Set;

import QuizWiz.entity.exam.Exam;
import org.springframework.data.jpa.repository.JpaRepository;

import QuizWiz.entity.User;

public interface UserRepository extends JpaRepository<User, Long> {

	User findByUsername(String username);
	
	Set<User> findByExam(Exam exam);

}
