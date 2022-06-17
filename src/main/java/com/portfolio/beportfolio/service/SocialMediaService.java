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
    public void deleteSocialMedia(SocialMedia socialMedia) {
       socialMediaRepo.delete(socialMedia);
    }

    @Override
    public SocialMedia findSocialMedia(Long id) {
       return socialMediaRepo.findById(id).orElse(null);
    }
    
    @Override
    public void editSocialMedia(SocialMedia socialMedia) {
        socialMediaRepo.save(socialMedia);
    }
}
