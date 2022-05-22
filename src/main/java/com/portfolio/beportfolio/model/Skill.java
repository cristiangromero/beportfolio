package com.portfolio.beportfolio.model;

import java.util.Set;
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
    @OneToMany(mappedBy = "idSkill")
    Set <UserSkill> skillPercents;
    
    public Skill(){
        
    }
    public Skill(int idSkill, String description){
        
        this.idSkill = idSkill;
        this.description = description;
        
    }
}
