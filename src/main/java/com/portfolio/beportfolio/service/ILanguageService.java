package com.portfolio.beportfolio.service;

import com.portfolio.beportfolio.model.Language;
import java.util.List;


public interface ILanguageService {
    public List<Language> listLanguage();
    public void newLanguage(Language language);
    public void deleteLanguage(Language language);
    public Language findLanguage(Long id);
    public void editLanguage(Language language);
}
