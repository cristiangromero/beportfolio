package com.portfolio.beportfolio.service;

import com.portfolio.beportfolio.model.UserLanguage;
import com.portfolio.beportfolio.model.UserLanguageKey;
import com.portfolio.beportfolio.repository.UserLanguageRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserLanguageService implements IUserLanguageService{
    
    @Autowired
    public UserLanguageRepository userLanguageRepo;
    
    @Override
    public List<UserLanguage> listUserLanguage() {
        return userLanguageRepo.findAll();
    }

    @Override
    public void newUserLanguage(UserLanguage userLanguage) {
        userLanguageRepo.save(userLanguage);
    }
    
    @Override
    public void deleteUserLanguage(UserLanguage userLanguage) {
       userLanguageRepo.delete(userLanguage);
    }

    @Override
    public UserLanguage findUserLanguage(UserLanguageKey id) {
       return userLanguageRepo.findById(id).orElse(null);
    }
    
    @Override
    public void editUserLanguage(UserLanguage userLanguage) {
        userLanguageRepo.save(userLanguage);
    }
    
}
