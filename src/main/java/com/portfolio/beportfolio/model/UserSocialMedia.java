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
@Table(name = "user_socialmedia")
public class UserSocialMedia implements Serializable{
    
    @EmbeddedId
    private UserSocialMedia idUserSocialMedia;
    
    @ManyToOne
    @MapsId("idUser")
    @JoinColumn
    private User idUser;
    
    @ManyToOne
    @MapsId("idSocialMedia")
    @JoinColumn
    private SocialMedia idSocialMedia;
    
    private String url;
    
    public UserSocialMedia(){
        
    }
    
    public UserSocialMedia(User idUser, SocialMedia idSocialMedia, String url){
        this.idUser = idUser;
        this.idSocialMedia = idSocialMedia;
        this.url = url;
    }
    
}
