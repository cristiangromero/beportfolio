package com.portfolio.beportfolio.service;

import com.portfolio.beportfolio.model.Education;
import com.portfolio.beportfolio.repository.EducationRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EducationService implements IEducationService{
    
    @Autowired
    public EducationRepository educationRepo;
    
    @Override
    public List<Education> listEducation() {
        return educationRepo.findAll();
    }

    @Override
    public void newEducation(Education education) {
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
        educationRepo.save(education);
    }
}
