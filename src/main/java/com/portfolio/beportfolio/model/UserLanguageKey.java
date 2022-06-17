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
public class UserLanguageKey implements Serializable{
    private Long idUser;
    private Long idLanguage;
 /*   
    public UserLanguageKey(){
        
    }
    
    public UserLanguageKey(int idUser, int idLanguage){
        this.idUser = idUser;
        this.idLanguage = idLanguage;
    }
*/
}
