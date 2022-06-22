package com.portfolio.beportfolio.service;

import com.portfolio.beportfolio.model.SocialMedia;
import com.portfolio.beportfolio.model.User;
import com.portfolio.beportfolio.repository.SocialMediaRepository;
import com.portfolio.beportfolio.repository.UserRepository;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SocialMediaService implements ISocialMediaService{
    
    @Autowired
    public SocialMediaRepository socialMediaRepo;
    
    @Autowired
    public UserRepository userRepo;
    
    @Override
    public List<SocialMedia> listSocialMedia() {
        return socialMediaRepo.findAll();
    }

    @Override
    public void newSocialMedia(SocialMedia socialMedia) {
        Optional<User> optionalUser = userRepo.findById(socialMedia.getUser().getIdUser());
        if (!optionalUser.isPresent()) {
            return;
        }
        socialMedia.setUser(optionalUser.get());
        socialMediaRepo.save(socialMedia);
    }
    
    @Override
    public void deleteSocialMedia(SocialMedia socialMedia) {
       socialMediaRepo.delete(socialMedia);
    }

    @Override
    public SocialMedia findSocialMedia(Long id) {
       return socialMediaRepo.findById(id).orElse(null);
    }
    
    @Override
    public void editSocialMedia(SocialMedia socialMedia) {
        
        Optional<User> optionalUser = userRepo.findById(socialMedia.getUser().getIdUser());
        if (!optionalUser.isPresent()) {
            return;
        }
        Optional<SocialMedia> optionalSocialMedia = socialMediaRepo.findById(socialMedia.getIdSocialMedia());
        if (!optionalSocialMedia.isPresent()) {
            return;
        }
        socialMedia.setUser(optionalUser.get());
        socialMedia.setIdSocialMedia(optionalSocialMedia.get().getIdSocialMedia());
        socialMediaRepo.save(socialMedia);
    }
    
}
