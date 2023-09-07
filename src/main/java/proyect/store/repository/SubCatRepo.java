package proyect.store.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import proyect.store.model.SubCategoriesModel;
import java.util.List;

@Repository
public interface SubCatRepo extends JpaRepository<SubCategoriesModel, Long>{
  List<SubCategoriesModel>findById(@Param("id_categoria_pfk")long id);

  @Query(
    "SELECT sub.nombre_subcategoria " +
    "FROM SubCategoriesModel sub " +
    "WHERE sub.id_subcategoria IN :ids"
  )
  List<String> findNamesByIds(@Param("ids") List<Long> ids);

  @Query(
    "SELECT sub.nombre_subcategoria " +
    "FROM SubCategoriesModel sub " +
    "WHERE sub.id_subcategoria IN :ids"
  )
  List<String> findNamesByIds1(@Param("ids") List<List<Long>>ids);

  
}
