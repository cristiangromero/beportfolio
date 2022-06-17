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
import com.portfolio.beportfolio.repository.UserLanguageRepository;
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
    public LanguageService languageService;
    
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
                    Language language = languageService.findLanguageById(userLanguage.getIdLanguage().getIdLanguage());
                    UserLanguage newUl = new UserLanguage();
                    newUl.setIdLanguage(language);
                    newUl.setIdUser(newUser);
                    newUl.setPercent(userLanguage.getPercent());
                    return newUl;
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
        userRepo.save(usr);
    }
    
}
