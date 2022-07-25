package com.portfolio.beportfolio.Controller;

import com.portfolio.beportfolio.model.Person;
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
import com.portfolio.beportfolio.service.IPersonService;
import javax.annotation.security.PermitAll;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;


@RestController
@RequestMapping("/api/person")
@CrossOrigin
public class PersonController {
    
    @Autowired
    private IPersonService personServ;    
    
    @PreAuthorize("isAuthenticated()")
    @PostMapping
    public void addPerson (@RequestBody Person usr){
        personServ.newPerson(usr);
    }
    
    @GetMapping
    @ResponseBody
    public List<Person> listPersons(){
        return personServ.listPersons();
    }
   
    @GetMapping("/{id}")
    @ResponseBody
    public Person findPerson(@PathVariable Long id){
        return personServ.findPerson(id);
    }
    
    @PreAuthorize("isAuthenticated()")
    @DeleteMapping("/{id}")
    public void deletePerson (@PathVariable Long id){
        Person usr= findPerson(id);
        personServ.deletePerson(usr);
    }
    
    @PreAuthorize("isAuthenticated()")
    @DeleteMapping
    public void deletePerson (@RequestBody Person usr){
        personServ.deletePerson(usr);
    }
    
    @PreAuthorize("isAuthenticated()")
    @PutMapping
    public void editPerson (@RequestBody Person usr){
        personServ.editPerson(usr);
    }
    
    @PreAuthorize("isAuthenticated()")
    @PutMapping("/{id}")
    public void editPerson(@PathVariable Long id) {
        Person usr= findPerson(id);
        personServ.editPerson(usr);
    }  
    
}
