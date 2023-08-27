package QuizWiz.service.ServiceProvider;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.transaction.Transactional;

import QuizWiz.entity.exam.Exam;
import QuizWiz.DAO.ExamRepository;
import QuizWiz.service.ExamService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
@Transactional
public class ExamServiceProvider implements ExamService {
	
	@Autowired
	private ExamRepository examRepository;

	@Override
	public Exam addExam(Exam exam) {
		return this.examRepository.save(exam);
	}

	@Override
	public Exam updateExam(Exam exam) {
		return this.examRepository.save(exam);
	}

	@Override
	public Set<Exam> getExams() {
		return new HashSet<>(this.examRepository.findAll());
	}

	@Override
	public Exam getExam(Long examId) {
		return this.examRepository.findById(examId).get();
	}

	@Override
	public void deleteExam(Long examId) {
		this.examRepository.deleteById(examId);
	}

	@Override
	public List<Exam> getActiveExams() {
		return this.examRepository.findByActive(true);
	}

}
