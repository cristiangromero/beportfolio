
package com.portfolio.beportfolio.model;

import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter @Setter
@Entity
@Table(name = "states")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class State {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long idState;
    @Column(nullable = false, length = 150)
    private String description;
    @ManyToOne
    @JoinColumn(name = "idCountry")
    private Country countries;
    @OneToMany(mappedBy = "states",cascade = CascadeType.ALL)
    private List<City> cities;
/*    
    public State(){
        
    }
    public State(int idState, String description, Country idCountry){
        
        this.idState = idState;
        this.description = description;
        this.idCountry = idCountry;

    }
*/
}
