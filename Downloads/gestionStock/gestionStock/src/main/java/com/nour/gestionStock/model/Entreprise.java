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
