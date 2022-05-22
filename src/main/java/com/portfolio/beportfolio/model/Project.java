package com.portfolio.beportfolio.model;

import javax.persistence.Column;
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
@Table(name = "project")
public class Project {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int idProject;
    @Column(nullable = false, length = 150)
    private String title;
    private String url;
    private String rol;
    private String description;
    @ManyToOne
    @JoinColumn(name = "idUser")
    private User idUser;
    
    public Project(){
        
    }
    
    public Project(int idProject, String title, String url, String rol, String description, User idUser){
        
        this.idProject = idProject;
        this.title = title;
        this.url = url;
        this.rol = rol;
        this.description = description;
        this.idUser = idUser;
        
    }
    
}
