package az.developia.spring_project_14aprel.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import az.developia.spring_project_14aprel.entity.Computer;

@Repository
public interface ComputerRepository extends JpaRepository<Computer, Integer> {

    @Query(value =
            "SELECT * FROM computer " +
            "WHERE price BETWEEN :a AND :b",
            nativeQuery = true)
    List<Computer> findBooksByPriceRange(@Param("a") Double a,
                                         @Param("b") Double b);

}