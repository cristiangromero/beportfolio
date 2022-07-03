package com.portfolio.beportfolio.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
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
@Table(name = "socialMedia")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class SocialMedia{
        
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long idSocialMedia;
    @Column(nullable = false, length = 150)
    private String description;
    @Column(nullable = false, length = 50)
    private String icon;
    private String url;
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn (name = "idPerson", nullable = false, updatable = false)
    @JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
    private Person person;    
}
