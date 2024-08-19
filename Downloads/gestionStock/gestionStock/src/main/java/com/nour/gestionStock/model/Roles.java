package com.nour.gestionStock.model;

import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Entity
@Table(name="Roles")
public class Roles extends AbstractEntity{
private String nom ;
    @ManyToOne
    @JoinColumn(name = "idUtilisateur")
    private Utilisateurs utilisateur;
}
