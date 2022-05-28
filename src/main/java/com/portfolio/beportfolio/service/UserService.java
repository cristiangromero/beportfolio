package com.portfolio.beportfolio.service;

import com.portfolio.beportfolio.model.Language;
import com.portfolio.beportfolio.model.Skill;
import com.portfolio.beportfolio.model.SocialMedia;
import com.portfolio.beportfolio.model.User;
import com.portfolio.beportfolio.model.UserLanguage;
import com.portfolio.beportfolio.model.UserSkill;
import com.portfolio.beportfolio.model.UserSocialMedia;
import com.portfolio.beportfolio.repository.LanguageRepository;
import com.portfolio.beportfolio.repository.SkillRepository;
import com.portfolio.beportfolio.repository.SocialMediaRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.portfolio.beportfolio.repository.UserRepository;
import java.util.stream.Collectors;

@Service
public class UserService implements IUserService {

    @Autowired
    public UserRepository userRepo;
    
    @Autowired
    public LanguageRepository languageRepo;
    
    @Autowired
    public SkillRepository skillRepo;
    
    @Autowired
    public SocialMediaRepository socialRepo;
    
    @Override
    public List<User> listUsers() {
        return userRepo.findAll();
    }

    @Override
    public void newUser(User usr) {
        User newUser = new User();     
        newUser.setName(usr.getName());
        newUser.setSurname(usr.getSurname());
        newUser.setEmail(usr.getEmail());
        newUser.setPhone(usr.getPhone());
        newUser.setStreet(usr.getStreet());
        newUser.setStreetNumber(usr.getStreetNumber());
        newUser.setBirth(usr.getBirth());
        newUser.setChildren(usr.getChildren());
        newUser.setPicture(usr.getPicture());
        newUser.setIam(usr.getIam());
        newUser.setName(usr.getName());
        newUser.setAboutme(usr.getAboutme());
        newUser.setIdCivil(usr.getIdCivil());
        newUser.setIdCity(usr.getIdCity());
        newUser.getLanguages().addAll((usr.getLanguages()
                .stream()
                .map(userLanguage -> {
                    Language language = languageRepo.findById(userLanguage.getIdLanguage().getIdLanguage()).orElse(null);
                    UserLanguage newUl = new UserLanguage();
                    newUl.setIdLanguage(language);
                    newUl.setIdUser(newUser);
                    newUl.setPercent(userLanguage.getPercent());
                    return newUl;
                })
                .collect(Collectors.toList())
        ));
        newUser.getSkills().addAll((usr.getSkills()
                .stream()
                .map(userSkill -> {
                    Skill skill = skillRepo.findById(userSkill.getIdSkill().getIdSkill()).orElse(null);
                    UserSkill newUs = new UserSkill();
                    newUs.setIdSkill(skill);
                    newUs.setIdUser(newUser);
                    newUs.setPercent(userSkill.getPercent());
                    return newUs;
                })
                .collect(Collectors.toList())
        ));
        newUser.getSocials().addAll((usr.getSocials()
                .stream()
                .map(userSocialMedia -> {
                    SocialMedia socialMedia = socialRepo.findById(userSocialMedia.getIdSocialMedia().getIdSocialMedia()).orElse(null);
                    UserSocialMedia newUsm = new UserSocialMedia();
                    newUsm.setIdSocialMedia(socialMedia);
                    newUsm.setIdUser(newUser);
                    newUsm.setUrl(userSocialMedia.getUrl());
                    return newUsm;
                })
                .collect(Collectors.toList())
        ));
        userRepo.save(newUser);
    }
    
    @Override
    public void deleteUser(User usr) {
       userRepo.delete(usr);
    }

    @Override
    public User findUser(Long id) {
       return userRepo.findById(id).orElse(null);
    }
    
    @Override
    public void editUser(User usr) {
        User editUser = new User();     
        editUser.setName(usr.getName());
        editUser.setSurname(usr.getSurname());
        editUser.setEmail(usr.getEmail());
        editUser.setPhone(usr.getPhone());
        editUser.setStreet(usr.getStreet());
        editUser.setStreetNumber(usr.getStreetNumber());
        editUser.setBirth(usr.getBirth());
        editUser.setChildren(usr.getChildren());
        editUser.setPicture(usr.getPicture());
        editUser.setIam(usr.getIam());
        editUser.setName(usr.getName());
        editUser.setAboutme(usr.getAboutme());
        editUser.setIdCivil(usr.getIdCivil());
        editUser.setIdCity(usr.getIdCity());
        editUser.getLanguages().addAll((usr.getLanguages()
                .stream()
                .map(userLanguage -> {
                    Language language = languageRepo.findById(userLanguage.getIdLanguage().getIdLanguage()).orElse(null);
                    UserLanguage editUl = new UserLanguage();
                    editUl.setIdLanguage(language);
                    editUl.setIdUser(editUser);
                    editUl.setPercent(userLanguage.getPercent());
                    return editUl;
                })
                .collect(Collectors.toList())
        ));
        editUser.getSkills().addAll((usr.getSkills()
                .stream()
                .map(userSkill -> {
                    Skill skill = skillRepo.findById(userSkill.getIdSkill().getIdSkill()).orElse(null);
                    UserSkill editUs = new UserSkill();
                    editUs.setIdSkill(skill);
                    editUs.setIdUser(editUser);
                    editUs.setPercent(userSkill.getPercent());
                    return editUs;
                })
                .collect(Collectors.toList())
        ));
        editUser.getSocials().addAll((usr.getSocials()
                .stream()
                .map(userSocialMedia -> {
                    SocialMedia socialMedia = socialRepo.findById(userSocialMedia.getIdSocialMedia().getIdSocialMedia()).orElse(null);
                    UserSocialMedia editUsm = new UserSocialMedia();
                    editUsm.setIdSocialMedia(socialMedia);
                    editUsm.setIdUser(editUser);
                    editUsm.setUrl(userSocialMedia.getUrl());
                    return editUsm;
                })
                .collect(Collectors.toList())
        ));
        userRepo.save(editUser);
    }
    
}
