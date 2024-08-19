package com.nour.gestionStock.dto;

import com.nour.gestionStock.model.Category;
import jakarta.persistence.Column;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.Builder;
import lombok.Data;

import java.math.BigDecimal;

@Builder
@Data
public class ArticleDto {

    private String codeArticle ;
    private String designation ;
    private BigDecimal prixUnitaireHt ;
    private BigDecimal tauxTva ;

    private BigDecimal prixUnitaireTtc ;

    private String photo ;
    //////////---ici on a la jointure entre les deuc table article et category many articccle appartient a une category avec une colonne de table d'association named idcategory

    private CategoryDto category;

}
