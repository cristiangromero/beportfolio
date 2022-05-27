package com.portfolio.beportfolio.Controller;

import com.portfolio.beportfolio.model.Language;
import com.portfolio.beportfolio.service.ILanguageService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LanguageController {
    @Autowired
    private ILanguageService languageServ;    
    
    @PostMapping("/new/language")
    public void addLanguage (@RequestBody Language language){
        languageServ.newLanguage(language);
    }
    @GetMapping("/list/language")
    @ResponseBody
    public List<Language> listLanguage(){
        return languageServ.listLanguage();
    }
   
    @GetMapping("/findlanguage/{id}")
    @ResponseBody
    public Language findLanguage(@PathVariable Integer id){
        return languageServ.findLanguage(id);
    }
    
    @DeleteMapping("/deletelanguage/{id}")
    public void deleteLanguage (@PathVariable Integer id){
        languageServ.deleteLanguage(id);
    }
    
    @PutMapping("/edit/language")
    public void editLanguage (@RequestBody Language language){
        languageServ.editLanguage(language);
    }
    
    @PutMapping("/editlanguage/{id}")
    public void editLanguage(@PathVariable Integer id) {
        Language language= findLanguage(id);
        languageServ.editLanguage(language);
    }
}
