package com.nour.gestionStock.model;

import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Entity
@Table(name="entreprise")
public class Entreprise extends  AbstractEntity{

    private String nom;

    private String description;

    @Embedded
    private Adresse adresse;

    private String codefiscale;

    private String photo;

    private String email;

    private String numTel;

    private String siteWeb;

    @OneToMany(mappedBy = "entreprise")
    private List<Utilisateurs> utilisateurs;
}
