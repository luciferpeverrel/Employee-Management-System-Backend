package sprintOne.EmpManSys.Services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import sprintOne.EmpManSys.Entities.Compliance;
import sprintOne.EmpManSys.Entities.StatusReport;
import sprintOne.EmpManSys.Repositories.IStatusReportRepository;

import java.util.List;

@Service
public class IStatusReportService {

    @Autowired
    private IStatusReportRepository statusReportRepository;

    public List<StatusReport> getAllStatusReport() {
        List<StatusReport> srt = statusReportRepository.findAll();
        return srt;
    }
    public StatusReport createStatusReport(StatusReport statusReport){
        statusReportRepository.save(statusReport);
        return statusReport;
    }
}
