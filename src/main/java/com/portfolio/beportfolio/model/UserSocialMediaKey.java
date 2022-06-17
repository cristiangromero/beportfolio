package com.portfolio.beportfolio.model;

import java.io.Serializable;
import javax.persistence.Embeddable;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter @Setter
@Data
@AllArgsConstructor
@NoArgsConstructor
@Embeddable
public class UserSocialMediaKey implements Serializable{
    
    private Long idUser;
    private Long idSocialMedia;
/*
    public UserSocialMediaKey(){
        
    }
    
    public UserSocialMediaKey(int idUser, int idSocialMedia){
        this.idUser = idUser;
        this.idSocialMedia = idSocialMedia;
    }
*/    
}
