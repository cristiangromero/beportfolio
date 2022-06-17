package com.portfolio.beportfolio.model;

import java.io.Serializable;
import javax.persistence.Embeddable;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter @Setter
@Data
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
@Embeddable
public class UserSkillKey implements Serializable{
    private Long idUser;
    private Long idSkill;
 /*   
    public UserSkillKey(){
        
    }
    
    public UserSkillKey(int idUser, int idSkill){
        this.idUser = idUser;
        this.idSkill = idSkill;
    }
*/
}
