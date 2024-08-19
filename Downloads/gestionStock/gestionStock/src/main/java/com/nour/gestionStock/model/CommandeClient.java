package com.nour.gestionStock.model;

import jakarta.persistence.*;
import lombok.*;

import java.time.Instant;
import java.util.List;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
@EqualsAndHashCode(callSuper = true)

@Table(name="commandeclient")
public class CommandeClient extends AbstractEntity{
    @Column(name = "code")
    private  String code ;

    @Column(name = "dateCommande")
    private Instant dateCommande ;
    @ManyToOne
    @JoinColumn(name = "idclient")
    private Client client ;
    @OneToMany(mappedBy = "commandeClient")
    private List<LigneCommandeClient>ligneCommandeClients;

}
