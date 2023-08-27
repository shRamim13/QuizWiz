package QuizWiz.service;

import java.util.List;
import java.util.Set;

import QuizWiz.entity.exam.Exam;

public interface ExamService {
	
	public Exam addExam(Exam exam);

	public Exam updateExam(Exam exam);

	public Set<Exam> getExams();

	public Exam getExam(Long examId);

	public void deleteExam(Long examId);


	public List<Exam> getActiveExams();

}
