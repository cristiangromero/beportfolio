package com.portfolio.beportfolio.Controller;

import com.portfolio.beportfolio.model.Education;
import com.portfolio.beportfolio.service.IEducationService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin
public class EducationController {
    @Autowired
    private IEducationService educationServ;    
    
    @PostMapping("/api/education")
    public void addEducation (@RequestBody Education education){
        educationServ.newEducation(education);
    }
    @GetMapping("/api/education")
    @ResponseBody
    public List<Education> listEducation(){
        return educationServ.listEducation();
    }
   
    @GetMapping("/api/education/{id}")
    @ResponseBody
    public Education findEducation(@PathVariable Long id){
        return educationServ.findEducation(id);
    }
    
    @DeleteMapping("/api/education/{id}")
    public void deleteEducation (@PathVariable Long id){
        Education education= findEducation(id);
        educationServ.deleteEducation(education);
    }
    
    @PutMapping("/api/education")
    public void editEducation (@RequestBody Education education){
        educationServ.editEducation(education);
    }
    
    @PutMapping("/api/education/{id}")
    public void editEducation(@PathVariable Long id) {
        Education education= findEducation(id);
        educationServ.editEducation(education);
    }
}
