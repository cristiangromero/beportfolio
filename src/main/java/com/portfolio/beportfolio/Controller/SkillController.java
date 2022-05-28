package com.portfolio.beportfolio.Controller;

import com.portfolio.beportfolio.model.Skill;
import com.portfolio.beportfolio.service.ISkillService;
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
public class SkillController {
    @Autowired
    private ISkillService skillServ;    
    
    @PostMapping("/api/skill")
    public void addSkill (@RequestBody Skill skill){
        skillServ.newSkill(skill);
    }
    @GetMapping("/api/skill")
    @ResponseBody
    public List<Skill> listSkill(){
        return skillServ.listSkill();
    }
   
    @GetMapping("/api/skill/{id}")
    @ResponseBody
    public Skill findSkill(@PathVariable Long id){
        return skillServ.findSkill(id);
    }
    
    @DeleteMapping("/api/skill/{id}")
    public void deleteSkill (@PathVariable Long id){
        Skill skill = findSkill(id);
        skillServ.deleteSkill(skill);
    }
    
    @DeleteMapping("/api/skill")
    public void deleteSkill (@RequestBody Skill skill){
        skillServ.deleteSkill(skill);
    }
    
    @PutMapping("/api/skill")
    public void editSkill (@RequestBody Skill skill){
        skillServ.editSkill(skill);
    }
    
    @PutMapping("/api/skill/{id}")
    public void editSkill(@PathVariable Long id) {
        Skill skill= findSkill(id);
        skillServ.editSkill(skill);
    }
}
