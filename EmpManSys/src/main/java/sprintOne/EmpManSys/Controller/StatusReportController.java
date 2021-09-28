package sprintOne.EmpManSys.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import sprintOne.EmpManSys.Entities.StatusReport;
import sprintOne.EmpManSys.Services.IStatusReportService;

import java.util.List;

@RestController
public class StatusReportController {
    @Autowired
    private IStatusReportService statusReportService;

    @GetMapping("/statusReport")
    public List<StatusReport> getAllStatusReports(){
        return statusReportService.getAllStatusReport();
    }

    @PostMapping("/statusReport")
    public void createStatusReport(@RequestBody StatusReport statusReport){
        statusReportService.createStatusReport(statusReport);
    }


}
