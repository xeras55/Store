package proyect.store.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import proyect.store.model.SubCategoriesModel;
import java.util.List;


public interface SubCatRepo extends JpaRepository<SubCategoriesModel, Long>{
  List<SubCategoriesModel>findById(@Param("id_categoria_pfk")long id);

  @Query(
    "SELECT sub.nombre_subcategoria " +
    "FROM SubCategoriesModel sub " +
    "WHERE sub.id_subcategoria IN :id"
  )
  List<String>findName(@Param("id") Long id);
}
