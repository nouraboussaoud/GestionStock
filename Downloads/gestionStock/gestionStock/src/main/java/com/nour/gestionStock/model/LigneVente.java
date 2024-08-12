package com.nour.gestionStock.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@Data
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Entity
@Table(name="lignevente")
public class LigneVente extends  AbstractEntity {
    @ManyToOne
    @JoinColumn(name = "idventes")
    private Ventes ventes ;
    @Column(name = "quantite")
    private BigDecimal quantite ;


}
