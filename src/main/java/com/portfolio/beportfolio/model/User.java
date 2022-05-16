package com.portfolio.beportfolio.model;

import java.util.Date;
import java.util.Set;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
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
    private String street;
    private int number;
    private java.sql.Date birth;
    private int children;
    private String picture;
    private String iam;
    private String aboutme;
    private String mydescript;
    private String mydescript2;
    private String resume;
    @ManyToOne
    private Civil idCivil;
    @ManyToOne
    private City idCity;
    @OneToMany
    private UserLanguage idUserLanguage;
    
    public User(){
        
    }
    
    public User(int idUser, String name, String surname, String email, String phone, 
                String street, int number, java.sql.Date birth, int children, 
                String picture,String iam, String aboutme, String mydescript, String mydescript2,
                String resume, Civil idCivil, City idCity){
        this.idUser = idUser;
        this.name = name;
        this.surname = surname;
        this.email = email;
        this.phone = phone;
        this.street = street;
        this.number = number;
        this.birth = birth;
        this.children = children;
        this.picture = picture;
        this.iam = iam;
        this.aboutme = aboutme;
        this.mydescript = mydescript;
        this.mydescript2 = mydescript2;
        this.resume = resume;
        this.idCivil = idCivil;
        this.idCity = idCity;
    }
    
}