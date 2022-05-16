package com.portfolio.beportfolio.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@Entity
@Table(name = "experience")
public class Experience {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int idExperience;
    private String title;
    private String expertise;
    private java.sql.Date dateini;
    private java.sql.Date datefinish;
    private boolean currentJob;
    private String company;
    private String description;
    @ManyToOne
    private User idUser;
    
    public Experience(){
        
    }
    
    public Experience(int idExperience, String title, String expertise, 
                    java.sql.Date dateini, java.sql.Date datefinish, boolean currentJob,
                    String company, String description, User idUser){
        this.idExperience = idExperience;
        this.title = title;
        this.expertise = expertise;
        this.dateini = dateini;
        this.datefinish = datefinish;
        this.currentJob = currentJob;
        this.company = company;
        this.description = description;
        this.idUser = idUser;
    }
    
}