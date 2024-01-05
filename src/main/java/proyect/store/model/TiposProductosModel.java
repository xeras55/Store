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
@Table(name = "tipos_productos")
@EntityListeners(AuditingEntityListener.class)
public class TiposProductosModel {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id_sub_sub;

  @Column
  private String nombre_sub_sub;

  public TiposProductosModel() {
  }

  public TiposProductosModel(Long id_sub_sub, String nombre_sub_sub) {
    this.id_sub_sub = id_sub_sub;
    this.nombre_sub_sub = nombre_sub_sub;
  }

  public Long getId_sub_sub() {
    return id_sub_sub;
  }

  public void setId_sub_sub(Long id_sub_sub) {
    this.id_sub_sub = id_sub_sub;
  }

  public String getNombre_sub_sub() {
    return nombre_sub_sub;
  }

  public void setNombre_sub_sub(String nombre_sub_sub) {
    this.nombre_sub_sub = nombre_sub_sub;
  }

}
