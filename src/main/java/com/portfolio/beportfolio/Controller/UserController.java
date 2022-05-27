package com.portfolio.beportfolio.Controller;

import com.portfolio.beportfolio.model.User;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import com.portfolio.beportfolio.service.IUserService;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
@CrossOrigin
@RequestMapping("/api/user")
public class UserController {
    
    @Autowired
    private IUserService userServ;    
    
    @PostMapping
    public void addUser (@RequestBody User usr){
        userServ.newUser(usr);
    }
    @GetMapping
    @ResponseBody
    public List<User> listUsers(){
        return userServ.listUsers();
    }
   
    @GetMapping("/{id}")
    @ResponseBody
    public User findUser(@PathVariable Long id){
        return userServ.findUser(id);
    }
    
    @DeleteMapping("/{id}")
    public void deleteUser (@PathVariable Long id){
        User usr= findUser(id);
        userServ.deleteUser(usr);
    }
    
    @DeleteMapping
    public void deleteUser (@RequestBody User usr){
        userServ.deleteUser(usr);
    }
    
    @PutMapping
    public void editUser (@RequestBody User usr){
        userServ.editUser(usr);
    }
    
    @PutMapping("/{id}")
    public void editUser(@PathVariable Long id) {
        User usr= findUser(id);
        userServ.editUser(usr);
    }  
    
}
