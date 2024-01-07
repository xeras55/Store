package proyect.store.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import proyect.store.model.ProductoModel;
import java.util.List;


@Repository
public interface ProductosRepo extends JpaRepository<ProductoModel,Long>{
  @Query("SELECT nombre_producto FROM ProductoModel WHERE ofertas = 1") 
  List<String> findByOfertas();
}
