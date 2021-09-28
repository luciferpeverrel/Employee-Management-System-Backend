package sprintOne.EmpManSys.Services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import sprintOne.EmpManSys.Entities.StatusReport;
import sprintOne.EmpManSys.Entities.User;
import sprintOne.EmpManSys.Repositories.IStatusReportRepository;
import sprintOne.EmpManSys.Repositories.IUserRepository;

import java.util.List;

@Service
public class IUserservice {

    @Autowired
    private IUserRepository userRepository;

    public List<User> getAllUser() {
        return userRepository.findAll();

    }
    public User createUser(User user){
        userRepository.save(user);
        return user;
    }
}
