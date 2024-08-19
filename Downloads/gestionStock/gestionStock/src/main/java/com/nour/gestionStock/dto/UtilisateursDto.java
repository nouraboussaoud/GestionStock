package com.nour.gestionStock.dto;

import com.fasterxml.jackson.annotation.JsonIgnore;


import lombok.Builder;
import lombok.Data;

import java.time.Instant;
import java.util.List;

@Data
@Builder
public class UtilisateursDto {
    private String nom;

    private String prenom;

    private String email;

    private Instant dateDeNaissance;

    private String motDePasse;

    private AdresseDto adresse;

    private String photo;


    private EntrepriseDto entreprise;
    @JsonIgnore
    private List<RolesDto> roles;
}
