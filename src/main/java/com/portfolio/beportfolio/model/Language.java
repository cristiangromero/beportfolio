package com.portfolio.beportfolio.model;

import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@Entity
@Table(name = "language")
public class Language {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int idLanguage;
    @Column(nullable = false, length = 150)
    private String description;
    @OneToMany(mappedBy = "idLanguage")
    private Set<UserLanguage> languagePercents = new HashSet<>();
    
    public Language(){
        
    }
    public Language(int idLanguage, String description){
        
        this.idLanguage = idLanguage;
        this.description = description;        
        
    }
    
}
