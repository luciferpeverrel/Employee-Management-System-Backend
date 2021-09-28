package sprintOne.EmpManSys.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import sprintOne.EmpManSys.Entities.User;

@Repository
public interface IUserRepository extends JpaRepository<User, Integer> {

}
