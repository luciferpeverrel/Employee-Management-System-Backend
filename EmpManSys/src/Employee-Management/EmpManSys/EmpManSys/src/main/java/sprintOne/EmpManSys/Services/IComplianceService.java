package sprintOne.EmpManSys.Services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import sprintOne.EmpManSys.Entities.Compliance;
import sprintOne.EmpManSys.Entities.Employee;
import sprintOne.EmpManSys.Entities.StatusReport;
import sprintOne.EmpManSys.Repositories.IComplianceRepository;
import sprintOne.EmpManSys.Repositories.IStatusReportRepository;

import java.util.List;

@Service
public class IComplianceService {
    @Autowired
    private IComplianceRepository complianceRepository;

    @Autowired
    private IStatusReportRepository statusReportRepository;

    public void createRL(Compliance co){
        complianceRepository.save(co);
    }

    public List<Compliance> getAllRL(){
        List<Compliance> co = complianceRepository.findAll();
        return co;
    }

//    public void createStatusReport(StatusReport statusReport){
//
//
//    }
    public List<StatusReport> getAllStatusReport(String userId, int compId){
        List<StatusReport> srt = statusReportRepository.findAll();
        return srt;

    }

}
