package com.portfolio.beportfolio.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@Entity
@Table(name = "education")
public class Education {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int idEducation;
    private String title;
    private java.sql.Date dateini;
    private java.sql.Date datefinish;
    private boolean currentStudy;
    private String institute;
    @ManyToOne
    @JoinColumn(name = "idStudyLevel")
    private StudyLevel idStudylevel;
    @ManyToOne
    @JoinColumn(name = "idUser")
    private User idUser;
    
    public Education(){
        
    }
    
    public Education(int idEducation, String title, java.sql.Date dateini, 
                     java.sql.Date datefinish, boolean currentStudy, String institute,
                     StudyLevel idStudylevel, User idUser){
        
        this.idEducation = idEducation;
        this.title = title;
        this.dateini = dateini;
        this.datefinish = datefinish;
        this.currentStudy = currentStudy;
        this.institute = institute;
        this.idStudylevel = idStudylevel;
        
    }
}
