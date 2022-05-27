/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.portfolio.beportfolio.Controller;

import com.portfolio.beportfolio.model.SocialMedia;
import com.portfolio.beportfolio.service.ISocialMediaService;
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
public class SocialMediaController {
    @Autowired
    private ISocialMediaService socialMediaServ;    
    
    @PostMapping("/new/socialMedia")
    public void addSocialMedia (@RequestBody SocialMedia socialMedia){
        socialMediaServ.newSocialMedia(socialMedia);
    }
    @GetMapping("/list/socialMedia")
    @ResponseBody
    public List<SocialMedia> listSocialMedia(){
        return socialMediaServ.listSocialMedia();
    }
   
    @GetMapping("/findsocialMedia/{id}")
    @ResponseBody
    public SocialMedia findSocialMedia(@PathVariable Integer id){
        return socialMediaServ.findSocialMedia(id);
    }
    
    @DeleteMapping("/deletesocialMedia/{id}")
    public void deleteSocialMedia (@PathVariable Integer id){
        socialMediaServ.deleteSocialMedia(id);
    }
    
    @PutMapping("/edit/socialMedia")
    public void editSocialMedia (@RequestBody SocialMedia socialMedia){
        socialMediaServ.editSocialMedia(socialMedia);
    }
    
    @PutMapping("/editsocialMedia/{id}")
    public void editSocialMedia(@PathVariable Integer id) {
        SocialMedia socialMedia= findSocialMedia(id);
        socialMediaServ.editSocialMedia(socialMedia);
    }
}
