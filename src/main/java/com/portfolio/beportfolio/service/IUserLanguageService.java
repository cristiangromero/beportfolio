package com.portfolio.beportfolio.service;

import com.portfolio.beportfolio.model.UserLanguage;
import com.portfolio.beportfolio.model.UserLanguageKey;
import java.util.List;

public interface IUserLanguageService {
    public List<UserLanguage> listUserLanguage();
    public void newUserLanguage(UserLanguage userUserLanguage);
    public void deleteUserLanguage(UserLanguage userUserLanguage);
    public UserLanguage findUserLanguage(UserLanguageKey id);
    public void editUserLanguage(UserLanguage userUserLanguage);
}
