package com.nour.gestionStock.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import java.time.Instant;
import java.util.List;

@Data
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
