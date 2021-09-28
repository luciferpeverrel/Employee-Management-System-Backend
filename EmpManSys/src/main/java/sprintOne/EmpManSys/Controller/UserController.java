package sprintOne.EmpManSys.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import sprintOne.EmpManSys.Entities.User;
import sprintOne.EmpManSys.Services.IUserservice;

import java.util.List;
import java.util.Optional;

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
    public ResponseEntity<List<User>> getAllUser(){
        List<User> userList = userservice.getAllUser();
        if (userList.size()<=0){
            return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
        }
        return ResponseEntity.of(Optional.of(userList));
    }
}
