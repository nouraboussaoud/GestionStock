package com.nour.gestionStock.dto;

import com.nour.gestionStock.model.Article;
import com.nour.gestionStock.model.CommandeClient;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class LigneCommandeClientDto {
    private ArticleDto article ;
    private CommandeClientDto commandeClient ;
}
