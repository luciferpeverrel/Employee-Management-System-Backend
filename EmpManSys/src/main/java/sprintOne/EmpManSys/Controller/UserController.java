package sprintOne.EmpManSys.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import sprintOne.EmpManSys.Entities.User;
import sprintOne.EmpManSys.Services.IUserservice;

import java.util.List;

@RestController
public class UserController {

    @Autowired
    private IUserservice userservice;

    @PostMapping("/User")
    public void createUser(@RequestBody User user){
        userservice.createUser(user);
        System.out.println(user);
    }
    @GetMapping("/User")
    public List<User> getAllUser(){
        return userservice.getAllUser();
    }
}
