package az.developia.spring_project_14aprel.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import az.developia.spring_project_14aprel.User;

public interface UserRepository extends JpaRepository<User, Integer> {

}