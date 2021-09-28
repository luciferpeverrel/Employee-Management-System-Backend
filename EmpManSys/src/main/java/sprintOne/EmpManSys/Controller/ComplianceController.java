package sprintOne.EmpManSys.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import sprintOne.EmpManSys.Entities.Compliance;
import sprintOne.EmpManSys.Entities.StatusReport;
import sprintOne.EmpManSys.Services.IComplianceService;
import sprintOne.EmpManSys.Services.IStatusReportService;

import java.util.List;
import java.util.Optional;

@RestController
public class ComplianceController {
    @Autowired
    private IComplianceService complianceService;


    @GetMapping("/compliance")
    public ResponseEntity<List<Compliance>> getAllRL(){
        List<Compliance> complianceList= complianceService.getAllRL();
        if (complianceList.size()<=0){
            return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
        }
        return ResponseEntity.of(Optional.of(complianceList));
    }

    @PostMapping("/compliance")
    public void createRL(@RequestBody Compliance co){
        complianceService.createRL(co);
        System.out.println(co);
    }

}
