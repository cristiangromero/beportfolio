package com.portfolio.beportfolio.model;

import java.util.HashSet;
import java.util.Set;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@Entity
@Table(name = "socialMedia")
public class SocialMedia {
        
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int idSocialMedia;
    private String description;
    @OneToMany(mappedBy = "idSocialMedia")
    private Set<UserSocialMedia> socialMediaUrls = new HashSet<>();
    
    public SocialMedia(){
        
    }
    public SocialMedia(int idSocialMedia, String description){
        
        this.idSocialMedia = idSocialMedia;
        this.description = description;        
        
    }
    
    
}
