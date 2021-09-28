package sprintOne.EmpManSys.Services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import sprintOne.EmpManSys.Entities.Employee;
import sprintOne.EmpManSys.Repositories.IEmployeeRepository;

import java.util.List;
import java.util.Optional;

@Service
public class IEmployeeService {
    @Autowired
    private IEmployeeRepository employeeRepository;

    public List<Employee> getAllEmployees(){
        List<Employee> emps = employeeRepository.findAll();
        return emps;
    }

    public Employee addEmployee(Employee emp) {
        employeeRepository.save(emp);
        return emp;
    }
    public void deleteEmployee(int userId){
        employeeRepository.deleteById(userId);

    }
    public Employee updateEmployee(Employee emp) {
        employeeRepository.save(emp);
        return emp;
    }
    public Employee getEmployeeById(int userId) {
        Optional<Employee> optional = employeeRepository.findById(userId);
        Employee emp = null;
        if (optional.isPresent()) {
            emp = optional.get();
        } else {
            throw new RuntimeException(" Employee not found for userId :: " + userId);
        }
        return emp;
    }
    public int getEmployeeCount() {
        int count = (int) employeeRepository.count();
        return count;
    }

}
