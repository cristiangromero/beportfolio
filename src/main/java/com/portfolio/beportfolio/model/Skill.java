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
@Table(name = "skill")
public class Skill {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int idSkill;
    @Column(nullable = false, length = 150)
    private String description;
    @OneToMany(mappedBy = "idSkill")
    private Set<UserSkill> skillPercents= new HashSet<>();
    
    public Skill(){
        
    }
    public Skill(int idSkill, String description){
        
        this.idSkill = idSkill;
        this.description = description;
        
    }
}
