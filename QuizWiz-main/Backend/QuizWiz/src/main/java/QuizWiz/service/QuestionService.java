package QuizWiz.service;

import java.util.Set;

import QuizWiz.entity.exam.Exam;
import QuizWiz.entity.exam.Question;
import QuizWiz.entity.exam.Quiz;

public interface QuestionService {

	public Question addQuestion(Question question);

	public Question updateQuestion(Question question);

	public Set<Question> getQuestions();

	public Question getQuestion(Long questionId);

	public Set<Question> getQuestionsOfQuiz(Quiz quiz);
	
	public Set<Question> getQuestionsOfExam(Exam exam);

	public void deleteQuestion(Long quesId);
}
