package com.portfolio.beportfolio.service;

import com.portfolio.beportfolio.model.User;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.portfolio.beportfolio.repository.UserRepository;

@Service
public class UserService implements IUserService {

    @Autowired
    public UserRepository userRepo;
    
    @Override
    public List<User> listUsers() {
        return userRepo.findAll();
    }

    @Override
    public void newUser(User usr) {
        userRepo.save(usr);
    }
    
    @Override
    public void deleteUser(int id) {
       userRepo.deleteById(id);
    }

    @Override
    public User findUser(int id) {
       return userRepo.findById(id).orElse(null);
    }
    
    @Override
    public void editUser(User usr) {
        userRepo.save(usr);
    }
    
}
