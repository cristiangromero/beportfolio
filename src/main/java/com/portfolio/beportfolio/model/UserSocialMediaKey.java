package com.portfolio.beportfolio.model;

import javax.persistence.Embeddable;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@Embeddable
public class UserSocialMediaKey {
    
    private int idUser;
    private int idSocialMedia;
    
    public UserSocialMediaKey(){
        
    }
    
    public UserSocialMediaKey(int idUser, int idSocialMedia){
        this.idUser = idUser;
        this.idSocialMedia = idSocialMedia;
    }
    
}
