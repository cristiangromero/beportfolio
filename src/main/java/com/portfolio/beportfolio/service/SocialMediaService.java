package com.portfolio.beportfolio.service;

import com.portfolio.beportfolio.model.SocialMedia;
import com.portfolio.beportfolio.model.Person;
import com.portfolio.beportfolio.repository.SocialMediaRepository;
import com.portfolio.beportfolio.repository.PersonRepository;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SocialMediaService implements ISocialMediaService{
    
    @Autowired
    public SocialMediaRepository socialMediaRepo;
    
    @Autowired
    public PersonRepository personRepo;
    
    @Override
    public List<SocialMedia> listSocialMedia() {
        return socialMediaRepo.findAll();
    }

    @Override
    public void newSocialMedia(SocialMedia socialMedia) {
        Optional<Person> optionalPerson = personRepo.findById(socialMedia.getPerson().getIdPerson());
        if (!optionalPerson.isPresent()) {
            return;
        }
        socialMedia.setPerson(optionalPerson.get());
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
        
        Optional<Person> optionalPerson = personRepo.findById(socialMedia.getPerson().getIdPerson());
        if (!optionalPerson.isPresent()) {
            return;
        }
        Optional<SocialMedia> optionalSocialMedia = socialMediaRepo.findById(socialMedia.getIdSocialMedia());
        if (!optionalSocialMedia.isPresent()) {
            return;
        }
        socialMedia.setPerson(optionalPerson.get());
        socialMedia.setIdSocialMedia(optionalSocialMedia.get().getIdSocialMedia());
        socialMediaRepo.save(socialMedia);
    }
    
}
