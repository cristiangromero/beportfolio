package com.portfolio.beportfolio.model;

import javax.persistence.Column;
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
public class UserSkill{
    @EmbeddedId
    private UserSkillKey idUserSkill;
    
    @ManyToOne
    @MapsId("idUser")
    @JoinColumn(name = "idUser")
    private User idUser;
    
    @ManyToOne
    @MapsId("idSkill")
    @JoinColumn(name = "idSkill")
    private Skill idSkill;
    @Column(length = 3)
    private int percent;
    
    public UserSkill(){
        
    }
    
    public UserSkill(User idUser, Skill idSkill, int percent){
        this.idUserSkill = new UserSkillKey(idUser.getIdUser(), idSkill.getIdSkill());
        this.idUser = idUser;
        this.idSkill = idSkill;
        this.percent = percent;
    }    
    
}
