/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.portfolio.beportfolio.service;

import com.portfolio.beportfolio.model.UserSkill;
import com.portfolio.beportfolio.repository.UserSkillRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserSkillService implements IUserSkillService{
    @Autowired
    public UserSkillRepository userSkillRepo;
    
    @Override
    public List<UserSkill> listUserSkill() {
        return userSkillRepo.findAll();
    }

    @Override
    public void newUserSkill(UserSkill userSkill) {
        userSkillRepo.save(userSkill);
    }
       
    @Override
    public void editUserSkill(UserSkill userSkill) {
        userSkillRepo.save(userSkill);
    }
}
