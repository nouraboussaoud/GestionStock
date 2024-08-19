package com.nour.gestionStock.dto;

import com.nour.gestionStock.model.Adresse;
import com.nour.gestionStock.model.CommandeClient;
import jakarta.persistence.Column;
import jakarta.persistence.Embedded;
import jakarta.persistence.OneToMany;
import lombok.Builder;
import lombok.Data;

import java.util.List;

@Data
@Builder
public class ClientDto {
    private String nom ;

    private String prenom ;

    /////////att a utiliser plusieurs fois donc on va faire une classe entity adress
    private AdresseDto adresse ;////////champ composee

    private String photo ;

    private String mail ;

    private String numTel ;
    ///////////un client passe plusieurs command client
    List<CommandeClientDto> commandeClients ;

}
