package com.portfolio.beportfolio.service;

import com.portfolio.beportfolio.model.Experience;
import java.util.List;


public interface IExperienceService {
    public List<Experience> listExperience();
    public void newExperience(Experience experience);
    public void deleteExperience(Experience experience);
    public Experience findExperience(Long id);
    public void editExperience(Experience experience);
}
