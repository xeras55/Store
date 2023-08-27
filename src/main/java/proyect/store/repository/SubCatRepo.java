package proyect.store.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import proyect.store.model.SubCategoriesModel;
import java.util.List;


public interface SubCatRepo extends JpaRepository<SubCategoriesModel, Long>{
  List<SubCategoriesModel>findById(@Param("id_subcategoria")long id);
}
