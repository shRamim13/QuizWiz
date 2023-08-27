package QuizWiz.DAO;

import java.util.Set;

import QuizWiz.entity.exam.Exam;
import QuizWiz.entity.exam.Question;
import QuizWiz.entity.exam.Quiz;
import org.springframework.data.jpa.repository.JpaRepository;

public interface QuestionRepository extends JpaRepository<Question, Long> {

	Set<Question> findByQuiz(Quiz quiz);
	
	Set<Question> findByExam(Exam exam);
}
