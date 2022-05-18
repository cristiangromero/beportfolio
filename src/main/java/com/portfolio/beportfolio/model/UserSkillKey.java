package com.portfolio.beportfolio.model;

import java.io.Serializable;
import javax.persistence.Embeddable;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@Embeddable
public class UserSkillKey implements Serializable{
    private int idUser;
    private int idSkill;
    
    public UserSkillKey(){
        
    }
    
    public UserSkillKey(int idUser, int idSkill){
        this.idUser = idUser;
        this.idSkill = idSkill;
    }
}
