/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.portfolio.beportfolio.service;

import com.portfolio.beportfolio.model.UserLanguage;
import java.util.List;

public interface IUserLanguageService {
    public List<UserLanguage> listUserLanguage();
    public void newUserLanguage(UserLanguage userLanguage);
    public void editUserLanguage(UserLanguage userLanguage);
}
