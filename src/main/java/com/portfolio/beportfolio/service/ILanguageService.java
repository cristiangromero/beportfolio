package com.portfolio.beportfolio.service;

import com.portfolio.beportfolio.model.Language;
import java.util.List;


public interface ILanguageService {
    public List<Language> listLanguage();
    public void newLanguage(Language language);
    public void deleteLanguage(int id);
    public Language findLanguage(int id);
    public void editLanguage(Language language);
}
