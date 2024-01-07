package proyect.store.service.implementations;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import proyect.store.model.ProductoModel;
import proyect.store.repository.ProductosRepo;

@Service
public class ProductoImp {
  @Autowired
  private ProductosRepo productosRepo;

  public List<String> bringProductosList(){
    List<String> productosModelList = productosRepo.findByOfertas();
    return productosModelList;
  }
}
