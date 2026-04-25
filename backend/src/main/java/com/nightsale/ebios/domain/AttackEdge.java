package com.nightsale.ebios.domain;

import io.quarkus.hibernate.orm.panache.PanacheEntity;
import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;

@Entity
public class AttackEdge extends PanacheEntity {

    @ManyToOne
    public AttackStep sourceStep; // L'action de départ

    @ManyToOne
    public AttackStep targetStep; // L'action d'arrivée

    public String operator; // "ET" ou "OU" (selon la méthode EBIOS)
}