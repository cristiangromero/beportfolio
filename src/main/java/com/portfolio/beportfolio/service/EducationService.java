package com.portfolio.beportfolio.service;

import com.portfolio.beportfolio.model.Education;
import com.portfolio.beportfolio.model.User;
import com.portfolio.beportfolio.repository.EducationRepository;
import com.portfolio.beportfolio.repository.UserRepository;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EducationService implements IEducationService{
    
    @Autowired
    public EducationRepository educationRepo;
    
    @Autowired
    public UserRepository userRepo;
    
    @Override
    public List<Education> listEducation() {
        return educationRepo.findAll();
    }

    @Override
    public void newEducation(Education education) {
        
        Optional<User> optionalUser = userRepo.findById(education.getUser().getIdUser());
        if (!optionalUser.isPresent()) {
            return;
        }
        education.setUser(optionalUser.get());
        educationRepo.save(education);
        
    }
    
    @Override
    public void deleteEducation(Education education) {
       educationRepo.delete(education);
    }

    @Override
    public Education findEducation(Long id) {
       return educationRepo.findById(id).orElse(null);
    }
    
    @Override
    public void editEducation(Education education) {
        
        Optional<User> optionalUser = userRepo.findById(education.getUser().getIdUser());
        if (!optionalUser.isPresent()) {
            return;
        }
        Optional<Education> optionalEducation = educationRepo.findById(education.getIdEducation());
        if (!optionalEducation.isPresent()) {
            return;
        }
        education.setUser(optionalUser.get());
        education.setIdEducation(optionalEducation.get().getIdEducation());
        educationRepo.save(education);

    }
}
