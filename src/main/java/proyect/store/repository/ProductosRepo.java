package proyect.store.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import proyect.store.model.ProductoModel;

@Repository
public interface ProductosRepo extends JpaRepository<ProductoModel,Long>{
  
}
