package com.portfolio.beportfolio.Controller;

import com.portfolio.beportfolio.model.UserSocialMedia;
import com.portfolio.beportfolio.service.IUserSocialMediaService;
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
public class UserSocialMediaController {
        @Autowired
    private IUserSocialMediaService userSocialMediaServ;    
    
    @PostMapping("/new/userSocialMedia")
    public void addUserSocialMedia (@RequestBody UserSocialMedia userSocialMedia){
        userSocialMediaServ.newUserSocialMedia(userSocialMedia);
    }
    @GetMapping("/list/userSocialMedia")
    @ResponseBody
    public List<UserSocialMedia> listUserSocialMedia(){
        return userSocialMediaServ.listUserSocialMedia();
    }
    
    @PutMapping("/edit/userSocialMedia")
    public void editUserSocialMedia (@RequestBody UserSocialMedia userSocialMedia){
        userSocialMediaServ.editUserSocialMedia(userSocialMedia);
    }
}
