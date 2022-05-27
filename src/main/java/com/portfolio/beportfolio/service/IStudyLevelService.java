package com.portfolio.beportfolio.service;

import com.portfolio.beportfolio.model.StudyLevel;
import java.util.List;

public interface IStudyLevelService {
    public List<StudyLevel> listStudyLevel();
    public void newStudyLevel(StudyLevel studyLevel);
    public void deleteStudyLevel(int id);
    public StudyLevel findStudyLevel(int id);
    public void editStudyLevel(StudyLevel studyLevel);
}
