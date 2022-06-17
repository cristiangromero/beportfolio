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
@Table(name = "experience")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Experience {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long idExperience;
    @Column(nullable = false, length = 150)
    private String title;
    @Column(length = 150)
    private String expertise;
    @Column(nullable = false)
    private java.sql.Date dateini;
    private java.sql.Date datefinish;
    @Column(nullable = true)
    private boolean currentJob;
    @Column(nullable = false, length = 150)
    private String company;
    private String description;
    @ManyToOne
    @JoinColumn(name = "idUser")
    private User idUser;
/*    
    public Experience(){
        
    }
    
    public Experience(int idExperience, String title, String expertise, 
                    java.sql.Date dateini, java.sql.Date datefinish, boolean currentJob,
                    String company, String description, User idUser){
        this.idExperience = idExperience;
        this.title = title;
        this.expertise = expertise;
        this.dateini = dateini;
        this.datefinish = datefinish;
        this.currentJob = currentJob;
        this.company = company;
        this.description = description;
        this.idUser = idUser;
    }
*/    
}
