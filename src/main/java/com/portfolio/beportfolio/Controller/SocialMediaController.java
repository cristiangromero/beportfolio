package com.portfolio.beportfolio.Controller;

import com.portfolio.beportfolio.model.SocialMedia;
import com.portfolio.beportfolio.service.ISocialMediaService;
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
public class SocialMediaController {
    @Autowired
    private ISocialMediaService socialMediaServ;    
    
    @PostMapping("/api/socialmedia")
    public void addSocialMedia (@RequestBody SocialMedia socialMedia){
        socialMediaServ.newSocialMedia(socialMedia);
    }
    @GetMapping("/api/socialmedia")
    @ResponseBody
    public List<SocialMedia> listSocialMedia(){
        return socialMediaServ.listSocialMedia();
    }
   
    @GetMapping("/api/socialmedia/{id}")
    @ResponseBody
    public SocialMedia findSocialMedia(@PathVariable Long id){
        return socialMediaServ.findSocialMedia(id);
    }
    
    @DeleteMapping("/api/socialmedia/{id}")
    public void deleteSocialMedia (@PathVariable Long id){
        SocialMedia socialMedia= findSocialMedia(id);
        socialMediaServ.deleteSocialMedia(socialMedia);
    }
    
    @DeleteMapping("/api/socialmedia")
    public void deleteSocialMedia (@RequestBody SocialMedia socialMedia){
        socialMediaServ.deleteSocialMedia(socialMedia);
    }
    
    @PutMapping("/api/socialmedia")
    public void editSocialMedia (@RequestBody SocialMedia socialMedia){
        socialMediaServ.editSocialMedia(socialMedia);
    }
    
    @PutMapping("/api/socialmedia/{id}")
    public void editSocialMedia(@PathVariable Long id) {
        SocialMedia socialMedia= findSocialMedia(id);
        socialMediaServ.editSocialMedia(socialMedia);
    }
}
