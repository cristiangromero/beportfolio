package com.portfolio.beportfolio.Controller;

import com.portfolio.beportfolio.model.Experience;
import com.portfolio.beportfolio.service.IExperienceService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin
@RequestMapping("/api/experience")
public class ExperienceController {
    @Autowired
    private IExperienceService experienceServ;    
    
//    @PreAuthorize("isAuthenticated()")
    @PostMapping
    public void addExperience (@RequestBody Experience experience){
        experienceServ.newExperience(experience);
    }
    @GetMapping
    @ResponseBody
    public List<Experience> listExperience(){
        return experienceServ.listExperience();
    }
   
    @GetMapping("/{id}")
    @ResponseBody
    public Experience findExperience(@PathVariable Long id){
        return experienceServ.findExperience(id);
    }
    
//    @PreAuthorize("isAuthenticated()")
    @DeleteMapping("/{id}")
    public void deleteExperience (@PathVariable Long id){
        Experience experience= findExperience(id);
        experienceServ.deleteExperience(experience);
    }
    
//    @PreAuthorize("isAuthenticated()")
    @PutMapping
    public void editExperience (@RequestBody Experience experience){
        experienceServ.editExperience(experience);
    }
    
//    @PreAuthorize("isAuthenticated()")
    @PutMapping("/{id}")
    public void editExperience(@PathVariable Long id) {
        Experience experience= findExperience(id);
        experienceServ.editExperience(experience);
    }
}
