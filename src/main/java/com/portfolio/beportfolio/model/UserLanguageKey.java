package com.portfolio.beportfolio.model;

import java.io.Serializable;
import javax.persistence.Embeddable;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@Embeddable
public class UserLanguageKey implements Serializable{
    
    private int idUser;
    private int idLanguage;
    
    public UserLanguageKey(){
        
    }
    
    public UserLanguageKey(int idUser, int idLanguage){
        this.idUser = idUser;
        this.idLanguage = idLanguage;
    }
}
