package sprintOne.EmpManSys.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import sprintOne.EmpManSys.Entities.Employee;
import sprintOne.EmpManSys.Services.IEmployeeService;

import java.util.List;

@RestController
public class EmployeeController {

    @Autowired
    private IEmployeeService employeeService;

    @GetMapping("/employees")
    public List<Employee> getAllEmployee(){
        return employeeService.getAllEmployees();
    }

    @GetMapping("/employees/{userId}")
    public Employee getEmployee(@PathVariable int userId){
        return employeeService.getEmployeeById(userId);
    }

    @PostMapping("/employees")
    public void addEmployees(@RequestBody Employee emp){
        employeeService.addEmployee(emp);
        System.out.println(emp);
    }

    @PutMapping("/employees/update/{userId}")
    public void updateEmployee(@RequestBody Employee emp, @PathVariable int userId){
        employeeService.updateEmployee(emp,userId);
    }
    @DeleteMapping("/employees/delete/{userId}")
    public void deleteEmployee(@PathVariable int userId){
        employeeService.deleteEmployee(userId);
    }

    @GetMapping("/employees/count")
    public int getEmployeeCount(){
        return employeeService.getEmployeeCount();
    }

}