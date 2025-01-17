package com.nour.gestionStock.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.*;
import org.springframework.security.core.parameters.P;

import java.time.Instant;
import java.util.List;

@Data
@Builder
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@AllArgsConstructor
@Entity
@Table(name="ventes")
public class Ventes extends AbstractEntity{
    private String code ;
    private Instant dateVente;

    private String commentaire;

    @Column(name = "identreprise")
    private Integer idEntreprise;

    @OneToMany(mappedBy = "ventes")
    private List<LigneVente> ligneVentes;
}
