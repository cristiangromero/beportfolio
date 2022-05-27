package com.portfolio.beportfolio.model;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Set;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter @Setter
@Entity
@Table(name = "socialMedia")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class SocialMedia {
        
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long idSocialMedia;
    @Column(nullable = false, length = 150)
    private String description;
    @Column(nullable = false, length = 50)
    private String icon;
    @OneToMany(mappedBy = "idSocialMedia", cascade = CascadeType.ALL)
    private Collection<UserSocialMedia> socials = new ArrayList<>();
/*    
    public SocialMedia(){
        
    }
    public SocialMedia(int idSocialMedia, String description, String icon){
        
        this.idSocialMedia = idSocialMedia;
        this.description = description;
        this.icon = icon;
        
    }
*/    
}
