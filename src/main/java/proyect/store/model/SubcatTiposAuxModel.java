package proyect.store.model;

import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EntityListeners;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "subcategoria_tipos_aux")
@EntityListeners(AuditingEntityListener.class)
public class SubcatTiposAuxModel {
  @Id
  private Long id_subcategoria;

  @Column
  private Long id_sub_sub;

  public SubcatTiposAuxModel() {

  }

  public SubcatTiposAuxModel(Long id_subcategoria, Long id_sub_sub) {
    this.id_subcategoria = id_subcategoria;
    this.id_sub_sub = id_sub_sub;
  }

  public Long getId_subcategoria() {
    return id_subcategoria;
  }

  public void setId_subcategoria(Long id_subcategoria) {
    this.id_subcategoria = id_subcategoria;
  }

  public Long getId_sub_sub() {
    return id_sub_sub;
  }

  public void setId_sub_sub(Long id_sub_sub) {
    this.id_sub_sub = id_sub_sub;
  }

}
