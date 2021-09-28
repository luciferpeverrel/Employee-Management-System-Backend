package sprintOne.EmpManSys.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import sprintOne.EmpManSys.Entities.StatusReport;

public interface IStatusReportRepository extends JpaRepository<StatusReport, Integer> {
}