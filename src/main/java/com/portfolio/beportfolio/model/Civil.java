
package com.portfolio.beportfolio.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter @Setter
@Entity
@Table(name = "civil")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Civil {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long idCivil;
    @Column(nullable = false, length = 150)
    private String description;
/*    
    public Civil(){
        
    }
    public Civil(int idCivil, String description){
        
        this.idCivil = idCivil;
        this.description = description;
        
    }
*/
}
