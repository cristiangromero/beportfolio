package com.portfolio.beportfolio.service;

import com.portfolio.beportfolio.model.User;
import java.util.List;

public interface IUserService {
    
    public List<User> listUsers();
    public void newUser(User usr);
    public void deleteUser(int id);
    public User findUser (int id);
    public void editUser(User usr);
    
}
