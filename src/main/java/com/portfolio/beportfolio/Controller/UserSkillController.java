/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.portfolio.beportfolio.Controller;

import com.portfolio.beportfolio.model.UserSkill;
import com.portfolio.beportfolio.service.IUserSkillService;
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
public class UserSkillController {
    @Autowired
    private IUserSkillService userSkillServ;    
    
    @PostMapping("/new/userSkill")
    public void addUserSkill (@RequestBody UserSkill userSkill){
        userSkillServ.newUserSkill(userSkill);
    }
    @GetMapping("/list/userSkill")
    @ResponseBody
    public List<UserSkill> listUserSkill(){
        return userSkillServ.listUserSkill();
    }
    
    @PutMapping("/edit/userSkill")
    public void editUserSkill (@RequestBody UserSkill userSkill){
        userSkillServ.editUserSkill(userSkill);
    }
    
}
