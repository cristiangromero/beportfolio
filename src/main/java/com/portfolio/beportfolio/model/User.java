package com.portfolio.beportfolio.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import java.util.ArrayList;
import java.util.Collection;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter @Setter
@Entity
@Table(name = "users")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class User {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long idUser;
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
    @OneToMany(mappedBy = "idUser", cascade = CascadeType.ALL)
    private Collection<UserLanguage> languages = new ArrayList<>();    
    @OneToMany(mappedBy = "idUser", cascade = CascadeType.ALL)
    private Collection<UserSkill> skills = new ArrayList<>();
    @OneToMany(mappedBy = "idUser", cascade = CascadeType.ALL)
    private Collection<UserSocialMedia> socials = new ArrayList<>();
    /*
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
    */
}