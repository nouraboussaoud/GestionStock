package com.nour.gestionStock.dto;

import com.nour.gestionStock.model.Article;
import jakarta.persistence.Column;
import jakarta.persistence.OneToMany;
import lombok.Builder;
import lombok.Data;

import java.util.List;
@Data
@Builder
public class CategoryDto {
    private String code ;

    private String designation ;
    ///mapping car article appartient a une category et une category a une liste d'article

    private List<ArticleDto> articles ;
}
