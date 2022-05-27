package com.portfolio.beportfolio.model;

import java.io.Serializable;
import javax.persistence.Embeddable;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@Embeddable
public class UserSocialMediaKey implements Serializable{
    
    private int idUser;
    private int idSocialMedia;
    
    public UserSocialMediaKey(){
        
    }
    
    public UserSocialMediaKey(int idUser, int idSocialMedia){
        this.idUser = idUser;
        this.idSocialMedia = idSocialMedia;
    }
    
}
