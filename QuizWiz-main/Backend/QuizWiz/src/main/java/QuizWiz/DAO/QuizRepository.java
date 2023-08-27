package QuizWiz.DAO;

import java.util.List;

import QuizWiz.entity.exam.Category;
import QuizWiz.entity.exam.Quiz;
import org.springframework.data.jpa.repository.JpaRepository;

public interface QuizRepository extends JpaRepository<Quiz, Long> {

	public List<Quiz> findBycategory(Category category);

	public List<Quiz> findByActive(Boolean b);

	public List<Quiz> findByCategoryAndActive(Category c, Boolean b);
}
