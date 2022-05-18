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

@RestController
public class UserController {
    
    @Autowired
    private IUserService userServ;    
    
    @PostMapping("/new/user")
    public void addUser (@RequestBody User usr){
        userServ.newUser(usr);
    }
    @GetMapping("/list/users")
    @ResponseBody
    public List<User> listUsers(){
        return userServ.listUsers();
    }
   
    @GetMapping("/finduser/{id}")
    @ResponseBody
    public User findUser(@PathVariable Integer id){
        return userServ.findUser(id);
    }
    
    @DeleteMapping("/deleteuser/{id}")
    public void deleteUser (@PathVariable Integer id){
        userServ.deleteUser(id);
    }
    
    @PutMapping("/edit/user")
    public void editUser (@RequestBody User usr){
        userServ.editUser(usr);
    }
    
    @PutMapping("/edituser/{id}")
    public void editUser(@PathVariable Integer id) {
        User usr= findUser(id);
        userServ.editUser(usr);
    }  
    
}
