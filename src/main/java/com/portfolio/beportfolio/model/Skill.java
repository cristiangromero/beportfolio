package com.portfolio.beportfolio.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
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
    @ManyToOne
    private User idUser;
    public Skill(){
        
    }
    public Skill(int idSkill, String description, User idUser){
        
        this.idSkill = idSkill;
        this.description = description;
        
    }
}
