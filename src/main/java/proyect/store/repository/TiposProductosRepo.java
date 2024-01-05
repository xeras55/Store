package proyect.store.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import proyect.store.model.TiposProductosModel;

@Repository
public interface TiposProductosRepo extends JpaRepository<TiposProductosModel,Long>{
  
}
