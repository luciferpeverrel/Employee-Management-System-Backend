package sprintOne.EmpManSys.Services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import sprintOne.EmpManSys.Entities.Compliance;
import sprintOne.EmpManSys.Entities.Employee;
import sprintOne.EmpManSys.Entities.StatusReport;
import sprintOne.EmpManSys.Repositories.IComplianceRepository;
import sprintOne.EmpManSys.Repositories.IStatusReportRepository;

import java.util.List;
import java.util.Optional;

@Service
public class IComplianceService {
    @Autowired
    private IComplianceRepository complianceRepository;


    public Compliance createRL(Compliance co){
        complianceRepository.save(co);
        return co;
    }

    public List<Compliance> getAllRL(){
        List<Compliance> co = complianceRepository.findAll();
        return co;
    }


}
