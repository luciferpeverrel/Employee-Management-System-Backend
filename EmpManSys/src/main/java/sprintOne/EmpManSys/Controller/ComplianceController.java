package sprintOne.EmpManSys.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import sprintOne.EmpManSys.Entities.Compliance;
import sprintOne.EmpManSys.Entities.StatusReport;
import sprintOne.EmpManSys.Services.IComplianceService;
import sprintOne.EmpManSys.Services.IStatusReportService;

import java.util.List;

@RestController
public class ComplianceController {
    @Autowired
    private IComplianceService complianceService;


    @GetMapping("/compliance")
    public List<Compliance> getAllRL(){
        return complianceService.getAllRL();
    }

    @PostMapping("/compliance")
    public void createRL(@RequestBody Compliance co){
        complianceService.createRL(co);
        System.out.println(co);
    }

}
