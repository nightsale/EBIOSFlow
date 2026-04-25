package com.nightsale.ebios.domain;

import io.quarkus.hibernate.orm.panache.PanacheEntity;
import jakarta.persistence.Entity;

@Entity
public class Asset extends PanacheEntity {
  public String name; // Ex: "Serveur de messagerie", "Poste R&D"
  public String type; // Ex: "MATERIEL", "RESEAU", "LOGICIEL"
  public boolean isInternetExposed;
}
