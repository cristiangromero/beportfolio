package com.portfolio.beportfolio.Controller;

import com.portfolio.beportfolio.model.Education;
import com.portfolio.beportfolio.service.IEducationService;
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
public class EducationController {
    
    @Autowired
    private IEducationService educationServ;    
    
    @PostMapping("/new/education")
    public void addEducation (@RequestBody Education education){
        educationServ.newEducation(education);
    }
    @GetMapping("/list/education")
    @ResponseBody
    public List<Education> listEducation(){
        return educationServ.listEducation();
    }
   
    @GetMapping("/findeducation/{id}")
    @ResponseBody
    public Education findEducation(@PathVariable Integer id){
        return educationServ.findEducation(id);
    }
    
    @DeleteMapping("/deleteeducation/{id}")
    public void deleteEducation (@PathVariable Integer id){
        educationServ.deleteEducation(id);
    }
    
    @PutMapping("/edit/education")
    public void editEducation (@RequestBody Education education){
        educationServ.editEducation(education);
    }
    
    @PutMapping("/editeducation/{id}")
    public void editEducation(@PathVariable Integer id) {
        Education education= findEducation(id);
        educationServ.editEducation(education);
    }
    
}
