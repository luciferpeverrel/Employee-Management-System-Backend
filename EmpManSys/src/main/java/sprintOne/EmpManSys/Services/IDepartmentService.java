package sprintOne.EmpManSys.Services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import sprintOne.EmpManSys.Entities.Department;
import sprintOne.EmpManSys.Repositories.IDepartmentRepository;

import java.util.List;


@Service
public class IDepartmentService {

    @Autowired
    private IDepartmentRepository departmentRepository;


    public List<Department> getAllDepartments(){
        List<Department> depts = (List<Department>)departmentRepository.findAll();
        return depts;
    }
    public Department addDepartment(Department department) {
        departmentRepository.save(department);
        return department;
    }

    public int getAllDepartCount(){
        return (int) departmentRepository.count();
    }

    public boolean deleteDepartmentByID(int deptId){
        departmentRepository.deleteById(deptId);
        return departmentRepository.existsById(deptId);
    }

}
