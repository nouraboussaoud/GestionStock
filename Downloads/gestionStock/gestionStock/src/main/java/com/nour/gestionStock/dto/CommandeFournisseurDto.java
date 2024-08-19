package com.nour.gestionStock.dto;

import com.nour.gestionStock.model.Fournisseur;
import com.nour.gestionStock.model.LigneCommandeFournisseur;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import lombok.Builder;
import lombok.Data;

import java.time.Instant;
import java.util.List;

@Data
@Builder
public class CommandeFournisseurDto {

    private String code ;

    private Instant dateCommande ;

    private FournisseurDto fournisseur ;

    private List<LigneCommandeFournisseurDto> ligneCommandeFournisseurs;

}
