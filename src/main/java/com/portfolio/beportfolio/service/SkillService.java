package com.portfolio.beportfolio.service;

import com.portfolio.beportfolio.model.Skill;
import com.portfolio.beportfolio.repository.SkillRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SkillService implements ISkillService{
    @Autowired
    public SkillRepository skillRepo;
    
    @Override
    public List<Skill> listSkill() {
        return skillRepo.findAll();
    }

    @Override
    public void newSkill(Skill skill) {
        skillRepo.save(skill);
    }
    
    @Override
    public void deleteSkill(Skill skill) {
       skillRepo.delete(skill);
    }

    @Override
    public Skill findSkill(Long id) {
       return skillRepo.findById(id).orElse(null);
    }
    
    @Override
    public void editSkill(Skill skill) {
        skillRepo.save(skill);
    }
    
    
    
}
