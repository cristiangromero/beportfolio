package com.portfolio.beportfolio.service;

import com.portfolio.beportfolio.model.Experience;
import com.portfolio.beportfolio.model.User;
import com.portfolio.beportfolio.repository.ExperienceRepository;
import com.portfolio.beportfolio.repository.UserRepository;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ExperienceService implements IExperienceService{
    
    @Autowired
    public ExperienceRepository experienceRepo;
    
    @Autowired
    public UserRepository userRepo;
    
    @Override
    public List<Experience> listExperience() {
        return experienceRepo.findAll();
    }

    @Override
    public void newExperience(Experience experience) {
        Optional<User> optionalUser = userRepo.findById(experience.getUser().getIdUser());
        if (!optionalUser.isPresent()) {
            return;
        }
        experience.setUser(optionalUser.get());
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
        
        Optional<User> optionalUser = userRepo.findById(experience.getUser().getIdUser());
        if (!optionalUser.isPresent()) {
            return;
        }
        Optional<Experience> optionalExperience = experienceRepo.findById(experience.getIdExperience());
        if (!optionalExperience.isPresent()) {
            return;
        }
        experience.setUser(optionalUser.get());
        experience.setIdExperience(optionalExperience.get().getIdExperience());
        experienceRepo.save(experience);

    }
}
