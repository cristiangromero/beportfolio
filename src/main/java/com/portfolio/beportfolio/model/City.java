
package com.portfolio.beportfolio.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@Entity
@Table(name = "city")

public class City {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int idCity;
    private String description;
    @ManyToOne
    private State idState;
    
    public City(){
        
    }
    public City(int idCity, String description, State idState){
        
        this.idCity = idCity;
        this.description = description;
        this.idState = idState;
        
    }
    
}
