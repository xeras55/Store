package proyect.store.model;

import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EntityListeners;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "categorias_principales")
@EntityListeners(AuditingEntityListener.class)
public class CategoriesModel {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private long id_categoria_p;
  @Column
  private String nombre_categoria;

  public CategoriesModel(long id_categoria_p, String nombre_categoria) {
    this.id_categoria_p = id_categoria_p;
    this.nombre_categoria = nombre_categoria;
  }

  public CategoriesModel() {
  }

  public long getId_categoria_p() {
    return id_categoria_p;
  }

  public String getNombre_categoria() {
    return nombre_categoria;
  }

  public void setNombre_categoria(String nombre_categoria) {
    this.nombre_categoria = nombre_categoria;
  }

  public void setId_categoria_p(long long1) {
  }

}
