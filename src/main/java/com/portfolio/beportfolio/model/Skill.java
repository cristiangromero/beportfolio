package com.portfolio.beportfolio.model;

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
@Table(name = "skill")
public class Skill {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int idSkill;
    private String description;
    @OneToMany
    private UserSkill idUserSkill;
    
    public Skill(){
        
    }
    public Skill(int idSkill, String description, UserSkill idUserSkill){
        
        this.idSkill = idSkill;
        this.description = description;
        this.idUserSkill = idUserSkill;
        
    }
}
