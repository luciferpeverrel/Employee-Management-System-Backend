package sprintOne.EmpManSys.Controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import sprintOne.EmpManSys.Entities.Department;
import sprintOne.EmpManSys.Services.IDepartmentService;

import java.util.List;
import java.util.Optional;

@RestController
public class DepartmentController {

    @Autowired
    private IDepartmentService departmentService;

    @GetMapping("/departments")
    public ResponseEntity<List<Department>> getAllDepartment(){
        List<Department> departmentList= departmentService.getAllDepartments();
        if (departmentList.size()<=0){
            return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
        }
        return ResponseEntity.of(Optional.of(departmentList));
    }

    @PostMapping("/departments")
    public void addDepartment(@RequestBody Department department){
        departmentService.addDepartment(department);
    }

    @DeleteMapping("departments/delete/{departId}")
    public void deleteDepartmentByID(@PathVariable int departId){
        departmentService.deleteDepartmentByID(departId);
    }
}