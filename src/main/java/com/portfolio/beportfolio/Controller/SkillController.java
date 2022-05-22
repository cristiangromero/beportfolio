/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.portfolio.beportfolio.Controller;

import com.portfolio.beportfolio.model.Skill;
import com.portfolio.beportfolio.service.ISkillService;
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
public class SkillController {
    
    @Autowired
    private ISkillService skillServ;    
    
    @PostMapping("/new/skill")
    public void addSkill (@RequestBody Skill skill){
        skillServ.newSkill(skill);
    }
    @GetMapping("/list/skill")
    @ResponseBody
    public List<Skill> listSkill(){
        return skillServ.listSkill();
    }
   
    @GetMapping("/findskill/{id}")
    @ResponseBody
    public Skill findSkill(@PathVariable Integer id){
        return skillServ.findSkill(id);
    }
    
    @DeleteMapping("/deleteskill/{id}")
    public void deleteSkill (@PathVariable Integer id){
        skillServ.deleteSkill(id);
    }
    
    @PutMapping("/edit/skill")
    public void editSkill (@RequestBody Skill skill){
        skillServ.editSkill(skill);
    }
    
    @PutMapping("/editskill/{id}")
    public void editSkill(@PathVariable Integer id) {
        Skill skill= findSkill(id);
        skillServ.editSkill(skill);
    }
    
}
