package com.nour.gestionStock.model;

import jakarta.persistence.*;
import lombok.*;

import java.math.BigDecimal;

@Data
@Builder
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
