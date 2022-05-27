package com.portfolio.beportfolio.model;

import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
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
    @Column(nullable = false, length = 150)
    private String name;
    @Column(nullable = false, length = 150)
    private String surname;
    @Column(length = 150)
    private String email;
    @Column(length = 15)
    private String phone;
    @Column(nullable = true, length = 150)
    private String street;
    @Column(nullable = true)
    private int streetNumber;
    private java.sql.Date birth;
    @Column(nullable = true)
    private int children;
    private String picture;
    private String iam;
    private String aboutme;
    @ManyToOne
    @JoinColumn(name = "idCivil")
    private Civil idCivil;
    @ManyToOne
    @JoinColumn(name = "idCity")
    private City idCity;
    @OneToMany(mappedBy = "idUser")
    private Set<UserLanguage> languagePercents = new HashSet<>();
    @OneToMany(mappedBy = "idUser")
    private Set<UserSkill> skillPercents = new HashSet<>();
    @OneToMany(mappedBy = "idUser")
    private Set<UserSocialMedia> socialMediaUrls = new HashSet<>();
    
    public User(){
        
    }
    
    public User(int idUser, String name, String surname, String email, String phone, 
                String street, int streetNumber, java.sql.Date birth, int children, 
                String picture,String iam, String aboutme, Civil idCivil, City idCity){
        this.idUser = idUser;
        this.name = name;
        this.surname = surname;
        this.email = email;
        this.phone = phone;
        this.street = street;
        this.streetNumber = streetNumber;
        this.birth = birth;
        this.children = children;
        this.picture = picture;
        this.iam = iam;
        this.aboutme = aboutme;
        this.idCivil = idCivil;
        this.idCity = idCity;
        
    }
    
}