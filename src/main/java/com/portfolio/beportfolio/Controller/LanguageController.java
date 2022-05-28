package com.portfolio.beportfolio.Controller;

import com.portfolio.beportfolio.model.Language;
import com.portfolio.beportfolio.service.ILanguageService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin
public class LanguageController {
    @Autowired
    private ILanguageService languageServ;    
    
    @PostMapping("/api/language")
    public void addLanguage (@RequestBody Language language){
        languageServ.newLanguage(language);
    }
    @GetMapping("/api/language")
    @ResponseBody
    public List<Language> listLanguage(){
        return languageServ.listLanguage();
    }
   
    @GetMapping("/api/language/{id}")
    @ResponseBody
    public Language findLanguage(@PathVariable Long id){
        return languageServ.findLanguage(id);
    }
    
    @DeleteMapping("/api/language/{id}")
    public void deleteLanguage (@PathVariable Long id){
        Language language= findLanguage(id);
        languageServ.deleteLanguage(language);
    }
    
    @PutMapping("/api/language")
    public void editLanguage (@RequestBody Language language){
        languageServ.editLanguage(language);
    }
    
    @PutMapping("/api/language/{id}")
    public void editLanguage(@PathVariable Long id) {
        Language language= findLanguage(id);
        languageServ.editLanguage(language);
    }
}
