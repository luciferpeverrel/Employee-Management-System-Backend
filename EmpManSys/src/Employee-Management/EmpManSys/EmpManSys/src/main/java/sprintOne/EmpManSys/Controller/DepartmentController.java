package sprintOne.EmpManSys.Controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import sprintOne.EmpManSys.Entities.Department;
import sprintOne.EmpManSys.Services.IDepartmentService;

import java.util.List;

@RestController
public class DepartmentController {

    @Autowired
    private IDepartmentService departmentService;

    @GetMapping("/departments")
    public List<Department> getAllDepartment(){
        return departmentService.getAllDepartments();
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