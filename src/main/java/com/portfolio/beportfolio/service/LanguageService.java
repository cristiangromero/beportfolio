package com.portfolio.beportfolio.service;

import com.portfolio.beportfolio.model.Language;
import com.portfolio.beportfolio.model.User;
import com.portfolio.beportfolio.repository.LanguageRepository;
import com.portfolio.beportfolio.repository.UserRepository;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LanguageService implements ILanguageService{
    
    @Autowired
    public LanguageRepository languageRepo;
    
    @Autowired
    public UserRepository userRepo;
    
    @Override
    public List<Language> listLanguage() {
        return languageRepo.findAll();
    }

    @Override
    public void newLanguage(Language language) {
        
        Optional<User> optionalUser = userRepo.findById(language.getUser().getIdUser());
        if (!optionalUser.isPresent()) {
            return;
        }
        language.setUser(optionalUser.get());
        languageRepo.save(language);
        
    }
    
    @Override
    public void deleteLanguage(Language language) {
       languageRepo.delete(language);
    }

    @Override
    public Language findLanguage(Long id) {
       return languageRepo.findById(id).orElse(null);
    }
    
    @Override
    public void editLanguage(Language language) {
        
        Optional<User> optionalUser = userRepo.findById(language.getUser().getIdUser());
        if (!optionalUser.isPresent()) {
            return;
        }
        Optional<Language> optionalLanguage = languageRepo.findById(language.getIdLanguage());
        if (!optionalLanguage.isPresent()) {
            return;
        }
        language.setUser(optionalUser.get());
        language.setIdLanguage(optionalLanguage.get().getIdLanguage());
        languageRepo.save(language);

    }
    
}