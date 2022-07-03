package com.portfolio.beportfolio.service;

import com.portfolio.beportfolio.model.Experience;
import com.portfolio.beportfolio.model.Person;
import com.portfolio.beportfolio.repository.ExperienceRepository;
import com.portfolio.beportfolio.repository.PersonRepository;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ExperienceService implements IExperienceService{
    
    @Autowired
    public ExperienceRepository experienceRepo;
    
    @Autowired
    public PersonRepository personRepo;
    
    @Override
    public List<Experience> listExperience() {
        return experienceRepo.findAll();
    }

    @Override
    public void newExperience(Experience experience) {
        Optional<Person> optionalPerson = personRepo.findById(experience.getPerson().getIdPerson());
        if (!optionalPerson.isPresent()) {
            return;
        }
        experience.setPerson(optionalPerson.get());
        experienceRepo.save(experience);
    }
    
    @Override
    public void deleteExperience(Experience experience) {
       experienceRepo.delete(experience);
    }

    @Override
    public Experience findExperience(Long id) {
       return experienceRepo.findById(id).orElse(null);
    }
    
    @Override
    public void editExperience(Experience experience) {
        
        Optional<Person> optionalPerson = personRepo.findById(experience.getPerson().getIdPerson());
        if (!optionalPerson.isPresent()) {
            return;
        }
        Optional<Experience> optionalExperience = experienceRepo.findById(experience.getIdExperience());
        if (!optionalExperience.isPresent()) {
            return;
        }
        experience.setPerson(optionalPerson.get());
        experience.setIdExperience(optionalExperience.get().getIdExperience());
        experienceRepo.save(experience);

    }
}
