package com.nour.gestionStock.dto;

import com.nour.gestionStock.model.TypeMvtStk;
import lombok.Builder;
import lombok.Data;

import java.math.BigDecimal;
import java.time.Instant;

@Data
@Builder
public class MvtStkDto {
    private ArticleDto article ;
    private TypeMvtStk typeMvt ;
    private BigDecimal quantite ;
    private Instant dateMvt ;

}
