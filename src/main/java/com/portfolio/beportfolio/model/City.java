
package com.portfolio.beportfolio.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter @Setter
@Entity
@Table(name = "cities")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class City {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long idCity;
    @Column(nullable = false)
    private String description;
    @ManyToOne
    @JoinColumn(name = "idState")
    private State states;
/*    
    public City(){
        
    }
    public City(int idCity, String description, State idState){
        
        this.idCity = idCity;
        this.description = description;
        this.idState = idState;
        
    }
*/    
}
