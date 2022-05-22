/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.portfolio.beportfolio.Controller;

import com.portfolio.beportfolio.model.UserLanguage;
import com.portfolio.beportfolio.service.IUserLanguageService;
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
public class UserLanguageController {
    @Autowired
    private IUserLanguageService userLanguageServ;    
    
    @PostMapping("/new/userLanguage")
    public void addUserLanguage (@RequestBody UserLanguage userLanguage){
        userLanguageServ.newUserLanguage(userLanguage);
    }
    @GetMapping("/list/userLanguage")
    @ResponseBody
    public List<UserLanguage> listUserLanguage(){
        return userLanguageServ.listUserLanguage();
    }
      
    @PutMapping("/edit/userLanguage")
    public void editUserLanguage (@RequestBody UserLanguage userLanguage){
        userLanguageServ.editUserLanguage(userLanguage);
    }
    
}
