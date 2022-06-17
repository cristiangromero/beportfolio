package com.portfolio.beportfolio.service;

import com.portfolio.beportfolio.model.Education;
import java.util.List;

public interface IEducationService {
    
    public List<Education> listEducation();
    public void newEducation(Education education);
    public void deleteEducation(Education education);
    public Education findEducation(Long id);
    public void editEducation(Education education);
    
}
