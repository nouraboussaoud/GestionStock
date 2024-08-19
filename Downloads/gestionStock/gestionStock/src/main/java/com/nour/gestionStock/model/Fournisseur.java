package com.nour.gestionStock.model;

import jakarta.persistence.*;
import lombok.*;
import org.aspectj.weaver.loadtime.definition.LightXMLParser;

import java.util.List;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Entity
@Table(name="fournisseur")
public class Fournisseur extends AbstractEntity{

    @Column(name = "nom")
    private String nom ;

    @Column(name = "prenom")
    private String prenom ;

    /////////att a utiliser plusieurs fois donc on va faire une classe entity adress
    @Embedded
    private Adresse adresse ;////////champ composee

    @Column(name = "photo")
    private String photo ;

    @Column(name = "mail")
    private String mail ;

    @Column(name = "numTel")
    private String numTel ;
    @OneToMany(mappedBy = "fournisseur")
    private List<CommandeFournisseur>commandeFournisseurs ;
}
