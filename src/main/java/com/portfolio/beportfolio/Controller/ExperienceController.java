package com.portfolio.beportfolio.Controller;

import com.portfolio.beportfolio.model.Experience;
import com.portfolio.beportfolio.service.IExperienceService;
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
public class ExperienceController {
    @Autowired
    private IExperienceService experienceServ;    
    
    @PostMapping("/api/experience")
    public void addExperience (@RequestBody Experience experience){
        experienceServ.newExperience(experience);
    }
    @GetMapping("/api/experience")
    @ResponseBody
    public List<Experience> listExperience(){
        return experienceServ.listExperience();
    }
   
    @GetMapping("/api/experience/{id}")
    @ResponseBody
    public Experience findExperience(@PathVariable Long id){
        return experienceServ.findExperience(id);
    }
    
    @DeleteMapping("/api/experience/{id}")
    public void deleteExperience (@PathVariable Long id){
        Experience experience= findExperience(id);
        experienceServ.deleteExperience(experience);
    }
    
    @PutMapping("/api/experience")
    public void editExperience (@RequestBody Experience experience){
        experienceServ.editExperience(experience);
    }
    
    @PutMapping("/api/experience/{id}")
    public void editExperience(@PathVariable Long id) {
        Experience experience= findExperience(id);
        experienceServ.editExperience(experience);
    }
}
