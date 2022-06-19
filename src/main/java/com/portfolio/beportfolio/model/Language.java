package com.portfolio.beportfolio.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter @Setter
@Entity
@Table(name = "language")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Language {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long idLanguage;
    @Column(nullable = false, length = 150)
    private String description;
    @Column (nullable = false, length = 3)
    private int percent;
    @JsonIgnore
    @OneToOne (mappedBy = "language")
    private List<User> user;
    
/*
    @OneToMany(mappedBy = "idLanguage", cascade = CascadeType.ALL)
    @JsonIgnore
    private Collection<UserLanguage> languages = new ArrayList<>();
    
    public Language(){
        
    }
    public Language(int idLanguage, String description){
        
        this.idLanguage = idLanguage;
        this.description = description;        
        
    }
    */
}
