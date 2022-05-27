package com.portfolio.beportfolio.model;

import java.io.Serializable;
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
@Table(name = "user_socialmedia")
@Data
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
public class UserSocialMedia{
    
    @EmbeddedId
    private UserSocialMediaKey idUserSocialMedia = new UserSocialMediaKey();
    
    @ManyToOne
    @MapsId("idUser")
    @JoinColumn(name = "idUser")
    private User idUser;
    
    @ManyToOne
    @MapsId("idSocialMedia")
    @JoinColumn(name = "idSocialMedia")
    private SocialMedia idSocialMedia;
    
    private String url;
/*    
    public UserSocialMedia(){
        
    }
    
    public UserSocialMedia(User idUser, SocialMedia idSocialMedia, String url){
        this.idUserSocialMedia = new UserSocialMediaKey(idUser.getIdUser(),idSocialMedia.getIdSocialMedia());
        this.idUser = idUser;
        this.idSocialMedia = idSocialMedia;
        this.url = url;
    }
*/    
}
