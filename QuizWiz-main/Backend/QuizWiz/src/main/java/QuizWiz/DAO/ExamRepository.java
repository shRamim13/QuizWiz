package QuizWiz.DAO;

import java.util.List;

import QuizWiz.entity.exam.Exam;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ExamRepository extends JpaRepository<Exam, Long> {

	public List<Exam> findByActive(Boolean b);
}
