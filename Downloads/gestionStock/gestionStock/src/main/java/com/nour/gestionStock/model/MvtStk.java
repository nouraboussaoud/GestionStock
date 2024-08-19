package com.nour.gestionStock.model;

import jakarta.persistence.*;
import lombok.*;

import java.math.BigDecimal;
import java.time.Instant;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Entity
@Table(name="mvtstk")
public class MvtStk extends AbstractEntity{
    @Column(name = "dateMvt")
    private Instant dateMvt;

    @Column(name = "quantite")
    private BigDecimal quantite;

    @ManyToOne
    @JoinColumn(name = "idearticle")
    private Article article;

    @Column(name = "typeMvt")
    private TypeMvtStk typeMvt;
;
}
