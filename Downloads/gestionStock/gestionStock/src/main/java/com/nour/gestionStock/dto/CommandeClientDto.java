package com.nour.gestionStock.dto;

import com.nour.gestionStock.model.Client;
import com.nour.gestionStock.model.LigneCommandeClient;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import lombok.Builder;
import lombok.Data;

import java.time.Instant;
import java.util.List;

@Data
@Builder
public class CommandeClientDto {
    private  String code ;

    private Instant dateCommande ;

    private ClientDto client ;

    private List<LigneCommandeClientDto> ligneCommandeClients;
}
