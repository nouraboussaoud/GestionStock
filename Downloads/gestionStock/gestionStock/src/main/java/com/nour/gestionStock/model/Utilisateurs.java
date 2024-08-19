package com.nour.gestionStock.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import java.time.Instant;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Entity
@Table(name="utilisateurs")
public class Utilisateurs extends AbstractEntity{

    private String nom;

    private String prenom;

    private String email;

    private Instant dateDeNaissance;

    private String motDePasse;

    @Embedded
    private Adresse adresse;

    private String photo;

    @ManyToOne
    @JoinColumn(name = "identreprise")
    private Entreprise entreprise;

    @OneToMany(fetch = FetchType.EAGER, mappedBy = "utilisateur")
    @JsonIgnore
    private List<Roles> roles;
}
