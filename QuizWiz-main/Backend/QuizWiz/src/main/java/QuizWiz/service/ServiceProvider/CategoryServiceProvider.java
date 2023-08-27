package QuizWiz.service.ServiceProvider;

import java.util.LinkedHashSet;
import java.util.Set;

import QuizWiz.entity.exam.Category;
import QuizWiz.DAO.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import QuizWiz.service.CategoryService;

@Service
public class CategoryServiceProvider implements CategoryService {

	@Autowired
	private CategoryRepository categoryRepository;

	@Override
	public Category addCategory(Category category) {
		return this.categoryRepository.save(category);
	}

	@Override
	public Category updateCategory(Category category) {
		return this.categoryRepository.save(category);
	}

	@Override
	public Set<Category> getCategories() {
		return new LinkedHashSet<>(this.categoryRepository.findAll());
	}

	@Override
	public Category getCategory(Long categoryId) {
		return this.categoryRepository.findById(categoryId).get();
	}

	@Override
	public void deleteCategory(Long categoryId) {
		Category category = new Category();
		category.setCid(categoryId);
		this.categoryRepository.delete(category);
	}

}
