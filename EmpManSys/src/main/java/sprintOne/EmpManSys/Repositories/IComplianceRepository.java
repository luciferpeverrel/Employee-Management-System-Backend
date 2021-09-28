package sprintOne.EmpManSys.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import sprintOne.EmpManSys.Entities.Compliance;

@Repository
public interface IComplianceRepository extends JpaRepository<Compliance, Integer> {
}