package com.nightsale.ebios.domain;

import io.quarkus.hibernate.orm.panache.PanacheEntity;
import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;

@Entity
public class AttackStep extends PanacheEntity {

  public String description; // Ex: "Intrusion via mail de hameçonnage"
  public String phase; // "CONNAITRE", "RENTRER", "TROUVER", "EXPLOITER"
  public int likelihood; // Vraisemblance (cotation EBIOS)

  @ManyToOne public Asset targetedAsset; // Le bien support ciblé par cette action
}
