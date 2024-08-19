package com.nour.gestionStock.dto;

import com.nour.gestionStock.model.Utilisateurs;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class RolesDto {
    private String nom ;

    private UtilisateursDto utilisateur;

}
