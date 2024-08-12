package com.nour.gestionStock.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@Data
@EqualsAndHashCode(callSuper = true)
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name="article")
public class Article extends AbstractEntity{
     @Column(name = "codeArticle")
     private String codeArticle ;
     @Column(name = "designation")
     private String designation ;
     @Column(name = "prixUnitaireHt")
     private BigDecimal prixUnitaireHt ;
     @Column(name = "taucTva")
     private BigDecimal tauxTva ;
     @Column(name = "prixUnitaireTtc")
     private BigDecimal prixUnitaireTtc ;
     @Column(name = "photo")
     private String photo ;
     //////////---ici on a la jointure entre les deuc table article et category many articccle appartient a une category avec une colonne de table d'association named idcategory
     @ManyToOne
     @JoinColumn(name = "idcategory")
     private Category category;
}
