package com.portfolio.beportfolio.service;

import com.portfolio.beportfolio.model.Skill;
import com.portfolio.beportfolio.model.Person;
import com.portfolio.beportfolio.repository.SkillRepository;
import com.portfolio.beportfolio.repository.PersonRepository;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SkillService implements ISkillService{
    
    @Autowired
    public SkillRepository skillRepo;
    
    @Autowired
    public PersonRepository personRepo;
    
    @Override
    public List<Skill> listSkill() {
        return skillRepo.findAll();
    }

    @Override
    public void newSkill(Skill skill) {
        
        Optional<Person> optionalPerson = personRepo.findById(skill.getPerson().getIdPerson());
        if (!optionalPerson.isPresent()) {
            return;
        }
        skill.setPerson(optionalPerson.get());
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
        
        Optional<Person> optionalPerson = personRepo.findById(skill.getPerson().getIdPerson());
        if (!optionalPerson.isPresent()) {
            return;
        }
        Optional<Skill> optionalSkill = skillRepo.findById(skill.getIdSkill());
        if (!optionalSkill.isPresent()) {
            return;
        }
        skill.setPerson(optionalPerson.get());
        skill.setIdSkill(optionalSkill.get().getIdSkill());
        skillRepo.save(skill);
        
    }
    
}
