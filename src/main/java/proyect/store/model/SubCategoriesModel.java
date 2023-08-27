package proyect.store.model;

import jakarta.persistence.Table;


import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EntityListeners;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
@Table(name = "subcategoria")
@EntityListeners(AuditingEntityListener.class)
public class SubCategoriesModel {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private long id_subcategoria;
  @Column
  private String nombre_subcategoria;

  public SubCategoriesModel() {
  }

  public SubCategoriesModel(long id_subcategoria, String nombre_subcategoria) {
    this.id_subcategoria = id_subcategoria;
    this.nombre_subcategoria = nombre_subcategoria;
  }

  public long getId_subcategoria() {
    return id_subcategoria;
  }

  public void setId_subcategoria(long id_subcategoria) {
    this.id_subcategoria = id_subcategoria;
  }

  public String getNombre_subcategoria() {
    return nombre_subcategoria;
  }

  public void setNombre_subcategoria(String nombre_subcategoria) {
    this.nombre_subcategoria = nombre_subcategoria;
  }

}
