package sprintOne.EmpManSys.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import sprintOne.EmpManSys.Entities.Employee;
import sprintOne.EmpManSys.Services.IEmployeeService;

import java.util.List;
import java.util.Optional;

@RestController
public class EmployeeController {

    @Autowired
    private IEmployeeService employeeService;

    @GetMapping("/employees")
    public ResponseEntity<List<Employee>> getAllEmployee(){
        List<Employee> employeeList = employeeService.getAllEmployees();
        if (employeeList.size()<=0){
            return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
        }
        return ResponseEntity.of(Optional.of(employeeList));
    }

    @GetMapping("/employees/{userId}")
    public ResponseEntity<Employee> getEmployee(@PathVariable int userId){
        Employee employee = employeeService.getEmployeeById(userId);
        if (employee == null){
            return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
        }
        return ResponseEntity.of(Optional.of(employee));
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