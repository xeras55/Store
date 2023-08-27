package proyect.store.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import proyect.store.model.CategoriesModel;

@Repository
public interface CategoriesRepo extends JpaRepository<CategoriesModel, Long>{
  List<CategoriesModel>findById(@Param("id_categoria_p")long id);
}