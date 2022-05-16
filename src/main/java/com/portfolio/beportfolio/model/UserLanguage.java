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
@Table(name = "user_language")
public class UserLanguage{
    @EmbeddedId
    private UserLanguage idUserLanguage;
    
    @ManyToOne
    @MapsId("idUser")
    @JoinColumn
    private User idUser;
    
    @ManyToOne
    @MapsId("idLanguage")
    @JoinColumn
    private Language idLanguage;
    
    private int percent;
    
    public UserLanguage(){
        
    }
    
    public UserLanguage(User idUser, Language idLanguage, int percent){
        this.idUser = idUser;
        this.idLanguage = idLanguage;
        this.percent = percent;
    }
    
}
