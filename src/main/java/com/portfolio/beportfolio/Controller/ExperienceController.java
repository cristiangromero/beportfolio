package com.portfolio.beportfolio.Controller;

import com.portfolio.beportfolio.model.Experience;
import com.portfolio.beportfolio.service.IExperienceService;
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
public class ExperienceController {
    
    @Autowired
    private IExperienceService experienceServ;    
    
    @PostMapping("/new/experience")
    public void addExperience (@RequestBody Experience experience){
        experienceServ.newExperience(experience);
    }
    @GetMapping("/list/experience")
    @ResponseBody
    public List<Experience> listExperience(){
        return experienceServ.listExperience();
    }
   
    @GetMapping("/findexperience/{id}")
    @ResponseBody
    public Experience findExperience(@PathVariable Integer id){
        return experienceServ.findExperience(id);
    }
    
    @DeleteMapping("/deleteexperience/{id}")
    public void deleteExperience (@PathVariable Integer id){
        experienceServ.deleteExperience(id);
    }
    
    @PutMapping("/edit/experience")
    public void editExperience (@RequestBody Experience experience){
        experienceServ.editExperience(experience);
    }
    
    @PutMapping("/editexperience/{id}")
    public void editExperience(@PathVariable Integer id) {
        Experience experience= findExperience(id);
        experienceServ.editExperience(experience);
    }
    
}
