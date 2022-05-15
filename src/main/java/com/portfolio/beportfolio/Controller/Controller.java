package com.portfolio.beportfolio.Controller;

import com.portfolio.beportfolio.model.City;
import com.portfolio.beportfolio.model.Civil;
import com.portfolio.beportfolio.model.State;
import com.portfolio.beportfolio.model.User;
import com.portfolio.beportfolio.service.ICityService;
import com.portfolio.beportfolio.service.ICivilService;
import com.portfolio.beportfolio.service.IStateService;
import com.portfolio.beportfolio.service.IUsersService;
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

@RestController
public class Controller {
    
    @Autowired
    private IUsersService userServ;
    
    @Autowired
    private ICivilService civilServ;
    
    @Autowired
    private ICityService cityServ;
    
    @Autowired
    private IStateService stateServ;
    
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
    
    @GetMapping("/list/civil")
    @ResponseBody
    public List<Civil> listCivil(){
        return civilServ.listCivil();
    }
   
    @GetMapping("/findcivil/{id}")
    @ResponseBody
    public Civil findCivil(@PathVariable Integer id){
        return civilServ.findCivil(id);
    }
    
    @GetMapping("/list/city")
    @ResponseBody
    public List<City> listCity(){
        return cityServ.listCity();
    }
   
    @GetMapping("/findcity/{id}")
    @ResponseBody
    public City findCity(@PathVariable Integer id){
        return cityServ.findCity(id);
    }
    
    @GetMapping("/list/state")
    @ResponseBody
    public List<State> listState(){
        return stateServ.listState();
    }
   
    @GetMapping("/findstate/{id}")
    @ResponseBody
    public State findState(@PathVariable Integer id){
        return stateServ.findState(id);
    }
}
