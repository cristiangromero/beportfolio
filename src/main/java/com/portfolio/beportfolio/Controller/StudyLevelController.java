/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.portfolio.beportfolio.Controller;

import com.portfolio.beportfolio.model.StudyLevel;
import com.portfolio.beportfolio.service.IStudyLevelService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudyLevelController {
    @Autowired
    private IStudyLevelService studyLevelServ;    
    
    @PostMapping("/new/studyLevel")
    public void addStudyLevel (@RequestBody StudyLevel studyLevel){
        studyLevelServ.newStudyLevel(studyLevel);
    }
    @GetMapping("/list/studyLevel")
    @ResponseBody
    public List<StudyLevel> listStudyLevel(){
        return studyLevelServ.listStudyLevel();
    }
   
    @GetMapping("/findstudyLevel/{id}")
    @ResponseBody
    public StudyLevel findStudyLevel(@PathVariable Integer id){
        return studyLevelServ.findStudyLevel(id);
    }
    
    @DeleteMapping("/deletestudyLevel/{id}")
    public void deleteStudyLevel (@PathVariable Integer id){
        studyLevelServ.deleteStudyLevel(id);
    }
    
    @PutMapping("/edit/studyLevel")
    public void editStudyLevel (@RequestBody StudyLevel studyLevel){
        studyLevelServ.editStudyLevel(studyLevel);
    }
    
    @PutMapping("/editstudyLevel/{id}")
    public void editStudyLevel(@PathVariable Integer id) {
        StudyLevel studyLevel= findStudyLevel(id);
        studyLevelServ.editStudyLevel(studyLevel);
    }
}
