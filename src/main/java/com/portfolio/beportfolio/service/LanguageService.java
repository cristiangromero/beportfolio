package com.portfolio.beportfolio.service;

import com.portfolio.beportfolio.model.Language;
import com.portfolio.beportfolio.repository.LanguageRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LanguageService implements ILanguageService{
    
    @Autowired
    public LanguageRepository languageRepo;
    
    @Override
    public List<Language> listLanguage() {
        return languageRepo.findAll();
    }

    @Override
    public void newLanguage(Language language) {
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
        languageRepo.save(language);
    }

    public Language findLanguageById(Long idLanguage) {
        return languageRepo.findByIdLanguage(idLanguage);
    }
    
}
