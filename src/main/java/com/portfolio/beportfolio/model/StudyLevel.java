package com.portfolio.beportfolio.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@Entity
@Table(name = "studyLevel")
public class StudyLevel {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int idStudylevel;
    private String description;
    
    public StudyLevel(){
        
    }
    public StudyLevel(int idStudylevel, String description){
        
        this.idStudylevel = idStudylevel;
        this.description = description;
        
    }
    
}
