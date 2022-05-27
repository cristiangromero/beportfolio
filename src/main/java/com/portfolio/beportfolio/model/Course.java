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
@Table(name = "course")
public class Course {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int idCourse;
    @Column(nullable = false, length = 150)
    private String title;
    private String url;
    private String provider;
    private java.sql.Date datefinish;
    @ManyToOne
    @JoinColumn(name = "idUser")
    private User idUser;
    
    public Course(){
        
    }
    public Course(int idCourse, String title, String url, String provider, java.sql.Date datefinish, User idUser){
        
        this.idCourse = idCourse;
        this.title = title;
        this.url = url;
        this.provider = provider;
        this.datefinish = datefinish;
        this.idUser = idUser;
        
    }
}
