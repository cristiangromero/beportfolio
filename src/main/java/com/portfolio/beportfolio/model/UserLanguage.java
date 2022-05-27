package com.portfolio.beportfolio.model;

import javax.persistence.Column;
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
@Table(name = "user_language")
@Data
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
public class UserLanguage{
    @EmbeddedId
    private UserLanguageKey idUserLanguage = new UserLanguageKey();
    
    @ManyToOne
    @MapsId("idUser")
    @JoinColumn(name = "idUser")
    private User idUser;
    
    @ManyToOne
    @MapsId("idLanguage")
    @JoinColumn(name = "idLanguage")
    private Language idLanguage;
    
    private int percent;
/*    
    public UserLanguage(){
        
    }
    
    public UserLanguage(User idUser, Language idLanguage, int percent){
        this.idUserLanguage = new UserLanguageKey(idUser.getIdUser(),idLanguage.getIdLanguage());
        this.idUser = idUser;
        this.idLanguage = idLanguage;
        this.percent = percent;
    }
*/    
}
