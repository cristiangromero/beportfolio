package com.portfolio.beportfolio.service;

import com.portfolio.beportfolio.model.SocialMedia;
import com.portfolio.beportfolio.repository.SocialMediaRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SocialMediaService implements ISocialMediaService{
    @Autowired
    public SocialMediaRepository socialMediaRepo;
    
    @Override
    public List<SocialMedia> listSocialMedia() {
        return socialMediaRepo.findAll();
    }

    @Override
    public void newSocialMedia(SocialMedia socialMedia) {
        socialMediaRepo.save(socialMedia);
    }
    
    @Override
    public void deleteSocialMedia(int id) {
       socialMediaRepo.deleteById(id);
    }

    @Override
    public SocialMedia findSocialMedia(int id) {
       return socialMediaRepo.findById(id).orElse(null);
    }
    
    @Override
    public void editSocialMedia(SocialMedia socialMedia) {
        socialMediaRepo.save(socialMedia);
    }
}
