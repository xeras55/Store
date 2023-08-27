package proyect.store.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import proyect.store.model.CategSubCaAux;
import proyect.store.model.SubCategoriesModel;

@Repository
public interface CateSubAuxRepo extends JpaRepository<CategSubCaAux, Long>{

      @Query("SELECT csa.id_subcategoria FROM CategSubCaAux csa WHERE csa.id_categoria_pfk = ?1")
      List<Long>fidByMySelf(Long idCategoriaP);
}
