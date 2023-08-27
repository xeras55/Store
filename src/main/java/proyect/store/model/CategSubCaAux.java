package proyect.store.model;

import jakarta.persistence.Table;

import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import jakarta.persistence.Column;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.EntityListeners;
import jakarta.persistence.Id;

@Entity
@Table(name = "categoria_subcategoria_aux")
@EntityListeners(AuditingEntityListener.class)
public class CategSubCaAux {

  @Id
  private Long id_categoria_pfk;
  @Column
  private Long id_subcategoria;

  public CategSubCaAux() {

  }

  public CategSubCaAux(Long id_categoria_pfk, Long id_subcategoria) {
    this.id_categoria_pfk = id_categoria_pfk;
    this.id_subcategoria = id_subcategoria;
  }

  public Long getId_categoria_pfk() {
    return id_categoria_pfk;
  }

  public void setId_categoria_pfk(Long id_categoria_pfk) {
    this.id_categoria_pfk = id_categoria_pfk;
  }

  public Long getId_subcategoria() {
    return id_subcategoria;
  }

  public void setId_subcategoria(Long id_subcategoria) {
    this.id_subcategoria = id_subcategoria;
  }

}
