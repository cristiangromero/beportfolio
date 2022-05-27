package com.portfolio.beportfolio.service;

import com.portfolio.beportfolio.model.Experience;
import com.portfolio.beportfolio.repository.ExperienceRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ExperienceService implements IExperienceService{
    
    @Autowired
    public ExperienceRepository experienceRepo;
    
    @Override
    public List<Experience> listExperience() {
        return experienceRepo.findAll();
    }

    @Override
    public void newExperience(Experience experience) {
        experienceRepo.save(experience);
    }
    
    @Override
    public void deleteExperience(int id) {
       experienceRepo.deleteById(id);
    }

    @Override
    public Experience findExperience(int id) {
       return experienceRepo.findById(id).orElse(null);
    }
    
    @Override
    public void editExperience(Experience experience) {
        experienceRepo.save(experience);
    }
    
}
