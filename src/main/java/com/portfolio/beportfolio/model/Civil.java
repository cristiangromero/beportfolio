
package com.portfolio.beportfolio.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@Entity
@Table(name = "civil")
public class Civil {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int idCivil;
    private String description;
    
    public Civil(){
        
    }
    public Civil(int idCivil, String description){
        
        this.idCivil = idCivil;
        this.description = description;
        
    }
}
