package com.portfolio.beportfolio.service;

import com.portfolio.beportfolio.model.UserSocialMedia;
import com.portfolio.beportfolio.repository.UserSocialMediaRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserSocialMediaService implements IUserSocialMediaService{
            @Autowired
    public UserSocialMediaRepository userSocialMediaRepo;
    
    @Override
    public List<UserSocialMedia> listUserSocialMedia() {
        return userSocialMediaRepo.findAll();
    }

    @Override
    public void newUserSocialMedia(UserSocialMedia userSocialMedia) {
        userSocialMediaRepo.save(userSocialMedia);
    }
    
    @Override
    public void editUserSocialMedia(UserSocialMedia userSocialMedia) {
        userSocialMediaRepo.save(userSocialMedia);
    }
}
