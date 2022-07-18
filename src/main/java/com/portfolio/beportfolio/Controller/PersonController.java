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
import org.springframework.web.bind.annotation.CrossOrigin;

@RestController
@CrossOrigin
public class PersonController {
    
    @Autowired
    private IPersonService personServ;    
    
    @PostMapping("/api/person")
    public void addPerson (@RequestBody Person usr){
        personServ.newPerson(usr);
    }
    @GetMapping("/publicapi/person")
    @ResponseBody
    public List<Person> listPersons(){
        return personServ.listPersons();
    }
   
    @GetMapping("/publicapi/person/{id}")
    @ResponseBody
    public Person findPerson(@PathVariable Long id){
        return personServ.findPerson(id);
    }
    
    @DeleteMapping("/api/person/{id}")
    public void deletePerson (@PathVariable Long id){
        Person usr= findPerson(id);
        personServ.deletePerson(usr);
    }
    
    @DeleteMapping("/api/person")
    public void deletePerson (@RequestBody Person usr){
        personServ.deletePerson(usr);
    }
    
    @PutMapping("/api/person")
    public void editPerson (@RequestBody Person usr){
        personServ.editPerson(usr);
    }
    
    @PutMapping("/api/person/{id}")
    public void editPerson(@PathVariable Long id) {
        Person usr= findPerson(id);
        personServ.editPerson(usr);
    }  
    
}
