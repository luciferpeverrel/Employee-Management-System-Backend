package sprintOne.EmpManSys.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import sprintOne.EmpManSys.Entities.Employee;
import org.springframework.data.repository.CrudRepository;

@Repository
public interface IEmployeeRepository extends JpaRepository<Employee, Integer> {

}