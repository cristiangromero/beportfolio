package com.portfolio.beportfolio.model;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.MapsId;
import javax.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter @Setter
@Entity
@Table(name = "user_skill")
@Data
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
public class UserSkill{
    @EmbeddedId
    private UserSkillKey idUserSkill = new UserSkillKey();
    
    @ManyToOne
    @MapsId("idUser")
    @JoinColumn(name = "idUser")
    private User idUser;
    
    @ManyToOne
    @MapsId("idSkill")
    @JoinColumn(name = "idSkill")
    private Skill idSkill;
    
    private int percent;
/*    
    public UserSkill(){
        
    }
    
    public UserSkill(User idUser, Skill idSkill, int percent){
        this.idUserSkill = new UserSkillKey(idUser.getIdUser(), idSkill.getIdSkill());
        this.idUser = idUser;
        this.idSkill = idSkill;
        this.percent = percent;
    }    
*/    
}
