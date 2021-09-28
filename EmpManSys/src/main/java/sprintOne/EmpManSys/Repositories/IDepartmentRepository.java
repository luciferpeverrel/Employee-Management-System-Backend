package sprintOne.EmpManSys.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import sprintOne.EmpManSys.Entities.Department;

@Repository
public interface IDepartmentRepository extends JpaRepository<Department, Integer> {
}