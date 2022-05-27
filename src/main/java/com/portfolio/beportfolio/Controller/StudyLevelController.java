package com.portfolio.beportfolio.Controller;

import com.portfolio.beportfolio.model.StudyLevel;
import com.portfolio.beportfolio.service.IStudyLevelService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin
@RequestMapping("/api/studylevel")
public class StudyLevelController {
    @Autowired
    private IStudyLevelService studyLevelServ;    
    
    @PostMapping
    public void addStudyLevel (@RequestBody StudyLevel studyLevel){
        studyLevelServ.newStudyLevel(studyLevel);
    }
    @GetMapping
    @ResponseBody
    public List<StudyLevel> listStudyLevel(){
        return studyLevelServ.listStudyLevel();
    }
   
    @GetMapping("/{id}")
    @ResponseBody
    public StudyLevel findStudyLevel(@PathVariable Long id){
        return studyLevelServ.findStudyLevel(id);
    }
    
    @DeleteMapping("/{id}")
    public void deleteStudyLevel (@PathVariable Long id){
        StudyLevel studyLevel= findStudyLevel(id);
        studyLevelServ.deleteStudyLevel(studyLevel);
    }
    
    @PutMapping
    public void editStudyLevel (@RequestBody StudyLevel studyLevel){
        studyLevelServ.editStudyLevel(studyLevel);
    }
    
    @PutMapping("/{id}")
    public void editStudyLevel(@PathVariable Long id) {
        StudyLevel studyLevel= findStudyLevel(id);
        studyLevelServ.editStudyLevel(studyLevel);
    }
}
