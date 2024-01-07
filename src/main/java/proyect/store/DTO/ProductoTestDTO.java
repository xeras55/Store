package proyect.store.DTO;

import proyect.store.model.ProductoModel;

public class ProductoTestDTO {

  private ProductoModel productoModel;

  public ProductoTestDTO(ProductoModel productoModel) {
    this.productoModel = productoModel;
  }
  private String nombre;

  public ProductoTestDTO() {
  }

  public ProductoTestDTO(String nombre) {
    this.nombre = nombre;
  }

  public String getNombre() {
    return nombre;
  }

  public void setNombre(String nombre) {
    this.nombre = nombre;
  }
  
  

}
