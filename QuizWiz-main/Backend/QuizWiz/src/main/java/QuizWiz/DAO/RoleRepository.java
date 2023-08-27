package QuizWiz.DAO;

import org.springframework.data.jpa.repository.JpaRepository;

import QuizWiz.entity.Role;

public interface RoleRepository extends JpaRepository<Role, Long> {

}
