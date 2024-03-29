package com.portfolio.beportfolio.Controller;

import com.portfolio.beportfolio.model.SocialMedia;
import com.portfolio.beportfolio.service.ISocialMediaService;
import java.util.List;
import javax.annotation.security.PermitAll;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/api/socialmedia")
@CrossOrigin
public class SocialMediaController {
    @Autowired
    private ISocialMediaService socialMediaServ;    
    
 //   @PreAuthorize("isAuthenticated()")
    @PostMapping
    public void addSocialMedia (@RequestBody SocialMedia socialMedia){
        socialMediaServ.newSocialMedia(socialMedia);
    }
    
    @GetMapping
    @ResponseBody
    public List<SocialMedia> listSocialMedia(){
        return socialMediaServ.listSocialMedia();
    }
   
    @GetMapping("/{id}")
    @ResponseBody
    public SocialMedia findSocialMedia(@PathVariable Long id){
        return socialMediaServ.findSocialMedia(id);
    }
    
    @PreAuthorize("isAuthenticated()")
    @DeleteMapping("/{id}")
    public void deleteSocialMedia (@PathVariable Long id){
        SocialMedia socialMedia= findSocialMedia(id);
        socialMediaServ.deleteSocialMedia(socialMedia);
    }
    
    @PreAuthorize("isAuthenticated()")
    @DeleteMapping
    public void deleteSocialMedia (@RequestBody SocialMedia socialMedia){
        socialMediaServ.deleteSocialMedia(socialMedia);
    }
    
    @PreAuthorize("isAuthenticated()")
    @PutMapping
    public void editSocialMedia (@RequestBody SocialMedia socialMedia){
        socialMediaServ.editSocialMedia(socialMedia);
    }
    
    @PreAuthorize("isAuthenticated()")
    @PutMapping("/{id}")
    public void editSocialMedia(@PathVariable Long id) {
        SocialMedia socialMedia= findSocialMedia(id);
        socialMediaServ.editSocialMedia(socialMedia);
    }
}
