package com.portfolio.beportfolio.model;

import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@Entity
@Table(name = "users")
public class User {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int idUser;
    
    private String name;
    private String surname;
    private String email;
    private String phone;
    private int number;
    private java.sql.Date birth;
    private int children;
    private String picture;
    private String iam;
    private String aboutme;
    private String mydescript;
    private String mydescript2;
    private String resume;
    
    
    public User(){
        
    }
    
    public User(int idUser, String name, String surname){
        this.idUser = idUser;
        this.name = name;
        this.surname = surname;
    }
    
}