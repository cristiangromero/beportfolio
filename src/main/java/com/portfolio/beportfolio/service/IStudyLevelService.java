package com.portfolio.beportfolio.service;

import com.portfolio.beportfolio.model.SLevel;
import java.util.List;

public interface IStudyLevelService {
    public List<SLevel> listStudyLevel();
    public void newStudyLevel(SLevel studyLevel);
    public void deleteStudyLevel(int id);
    public SLevel findStudyLevel(int id);
    public void editStudyLevel(SLevel studyLevel);
}
