package com.nour.gestionStock.model;

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
@Table(name="lignecommandefournisseur")
public class LigneCommandeFournisseur extends AbstractEntity{
    @ManyToOne
    @JoinColumn(name = "idarticle")
    private Article article ;

    @ManyToOne
    @JoinColumn(name = "idcommande")
    private CommandeFournisseur commandeFournisseur ;


}
