package com.nour.gestionStock.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.*;

import java.util.List;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
@EqualsAndHashCode(callSuper = true)
@Table(name="category")
public class Category extends AbstractEntity{
    @Column (name = "code")
    private String code ;

    @Column(name = "designation")
    private String designation ;
///mapping car article appartient a une category et une category a une liste d'article
    @OneToMany(mappedBy = "category")

    private List<Article> articles ;
}
