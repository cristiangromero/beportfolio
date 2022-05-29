package com.portfolio.beportfolio.Controller;

import com.portfolio.beportfolio.model.UserLanguage;
import com.portfolio.beportfolio.model.UserLanguageKey;
import com.portfolio.beportfolio.service.IUserLanguageService;
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
public class UserLanguageController {
    @Autowired
    private IUserLanguageService userLanguageServ;    
    
    @PostMapping("/api/userlanguage")
    public void addUserLanguage (@RequestBody UserLanguage userLanguage){
        userLanguageServ.newUserLanguage(userLanguage);
    }
    @GetMapping("/api/userlanguage")
    @ResponseBody
    public List<UserLanguage> listUserLanguage(){
        return userLanguageServ.listUserLanguage();
    }
   
    @GetMapping("/api/userlanguage/{id}")
    @ResponseBody
    public UserLanguage findUserLanguage(@PathVariable UserLanguageKey id){
        return userLanguageServ.findUserLanguage(id);
    }
    
    @DeleteMapping("/api/userlanguage/{id}")
    public void deleteUserLanguage (@PathVariable UserLanguageKey id){
        UserLanguage userLanguage= findUserLanguage(id);
        userLanguageServ.deleteUserLanguage(userLanguage);
    }
    
    @PutMapping("/api/userLanguage")
    public void editUserLanguage (@RequestBody UserLanguage userLanguage){
        userLanguageServ.editUserLanguage(userLanguage);
    }
    
    @PutMapping("/api/userlanguage/{id}")
    public void editUserLanguage(@PathVariable UserLanguageKey id) {
        UserLanguage userLanguage= findUserLanguage(id);
        userLanguageServ.editUserLanguage(userLanguage);
    }
}
