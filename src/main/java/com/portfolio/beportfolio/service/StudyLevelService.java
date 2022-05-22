/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.portfolio.beportfolio.service;

import com.portfolio.beportfolio.model.SLevel;
import com.portfolio.beportfolio.repository.StudyLevelRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudyLevelService implements IStudyLevelService{
            @Autowired
    public StudyLevelRepository studyLevelRepo;
    
    @Override
    public List<SLevel> listStudyLevel() {
        return studyLevelRepo.findAll();
    }

    @Override
    public void newStudyLevel(SLevel studyLevel) {
        studyLevelRepo.save(studyLevel);
    }
    
    @Override
    public void deleteStudyLevel(int id) {
       studyLevelRepo.deleteById(id);
    }

    @Override
    public SLevel findStudyLevel(int id) {
       return studyLevelRepo.findById(id).orElse(null);
    }
    
    @Override
    public void editStudyLevel(SLevel studyLevel) {
        studyLevelRepo.save(studyLevel);
    }
}
