package com.portfolio.beportfolio.model;

import javax.persistence.Column;
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
    private UserLanguageKey idUserLanguage;
    
    @ManyToOne
    @MapsId("idUser")
    @JoinColumn(name = "idUser")
    private User idUser;
    
    @ManyToOne
    @MapsId("idLanguage")
    @JoinColumn(name = "idLanguage")
    private Language idLanguage;
    @Column(length = 3)
    private int percent;
    
    public UserLanguage(){
        
    }
    
    public UserLanguage(User idUser, Language idLanguage, int percent){
        this.idUserLanguage = new UserLanguageKey(idUser.getIdUser(),idLanguage.getIdLanguage());
        this.idUser = idUser;
        this.idLanguage = idLanguage;
        this.percent = percent;
    }
    
}
