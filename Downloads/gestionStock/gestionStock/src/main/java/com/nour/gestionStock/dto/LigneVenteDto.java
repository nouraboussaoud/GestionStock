package com.nour.gestionStock.dto;

import lombok.Builder;
import lombok.Data;

import java.math.BigDecimal;

@Data
@Builder
public class LigneVenteDto {
    private BigDecimal quantite ;
    private VentesDto vente ;

}

