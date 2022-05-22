package com.portfolio.beportfolio.model;

import java.io.Serializable;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.MapsId;
import javax.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@Entity
@Table(name = "user_skill")
public class UserSkill implements Serializable{
    @EmbeddedId
    private UserSkill idUserSkill;
    
    @ManyToOne
    @MapsId("idUser")
    @JoinColumn
    private User idUser;
    
    @ManyToOne
    @MapsId("idSkill")
    @JoinColumn
    private Skill idSkill;
    
    private int percent;
    
    public UserSkill(){
        
    }
    
    public UserSkill(User idUser, Skill idSkill, int percent){
        this.idUser = idUser;
        this.idSkill = idSkill;
        this.percent = percent;
    }
    
    
}
