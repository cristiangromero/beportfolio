package com.portfolio.beportfolio.service;

import com.portfolio.beportfolio.model.StudyLevel;
import com.portfolio.beportfolio.repository.StudyLevelRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudyLevelService implements IStudyLevelService{
    
    @Autowired
    public StudyLevelRepository studyLevelRepo;
    
    @Override
    public List<StudyLevel> listStudyLevel() {
        return studyLevelRepo.findAll();
    }

    @Override
    public void newStudyLevel(StudyLevel studyLevel) {
        studyLevelRepo.save(studyLevel);
    }
    
    @Override
    public void deleteStudyLevel(StudyLevel studyLevel) {
       studyLevelRepo.delete(studyLevel);
    }

    @Override
    public StudyLevel findStudyLevel(Long id) {
       return studyLevelRepo.findById(id).orElse(null);
    }
    
    @Override
    public void editStudyLevel(StudyLevel studyLevel) {
        studyLevelRepo.save(studyLevel);
    }
}
