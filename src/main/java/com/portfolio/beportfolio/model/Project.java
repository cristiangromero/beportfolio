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
@Table(name = "project")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Project {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long idProject;
    @Column(nullable = false, length = 150)
    private String title;
    private String url;
    private String rol;
    private String description;
    @ManyToOne
    @JoinColumn(name = "idUser")
    private User idUser;
 /*   
    public Project(){
        
    }
    
    public Project(int idProject, String title, String url, String rol, String description, User idUser){
        
        this.idProject = idProject;
        this.title = title;
        this.url = url;
        this.rol = rol;
        this.description = description;
        this.idUser = idUser;
        
    }
*/    
}
