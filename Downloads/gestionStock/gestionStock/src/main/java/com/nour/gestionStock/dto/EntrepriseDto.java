package com.nour.gestionStock.dto;

import com.nour.gestionStock.model.Adresse;

import lombok.Builder;
import lombok.Data;

import java.util.List;

@Data
@Builder
public class EntrepriseDto {
    private String nom;

    private String description;

    private Adresse adresse;

    private String codefiscale;

    private String photo;

    private String email;

    private String numTel;

    private String siteWeb;

    private List<UtilisateursDto> utilisateurs;
}

