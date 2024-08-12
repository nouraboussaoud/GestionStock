package com.nour.gestionStock.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@EqualsAndHashCode(callSuper = true)

@Table(name="client")
public class Client extends AbstractEntity{
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
    ///////////un client passe plusieurs command client
    @OneToMany(mappedBy = "client")
    List<CommandeClient> commandeClients ;


}
