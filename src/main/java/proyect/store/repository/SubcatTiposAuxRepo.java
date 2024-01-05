package proyect.store.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import proyect.store.model.SubcatTiposAuxModel;

public interface SubcatTiposAuxRepo extends JpaRepository<SubcatTiposAuxModel, Long>{
  @Query("SELECT id_sub_sub FROM SubcatTiposAuxModel WHERE id_subcategoria = ?1")
  List<Long>findIdSubSub(Long idSubTiposAux);
}
