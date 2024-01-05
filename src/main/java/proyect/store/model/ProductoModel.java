package proyect.store.model;

import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EntityListeners;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "producto")
@EntityListeners(AuditingEntityListener.class)
public class ProductoModel {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id_producto;
  @Column
  private String nombre_producto;
  @Column
  private int tipo_producto;
  @Column
  private int colores;
  @Column
  private String talla;
  @Column
  private int licencias;
  @Column
  private int ofertas;
  @Column
  private int estampado;
  @Column
  private int precio;
  @Column
  private String descripcion;
  @Column
  private int piezas;

  public ProductoModel() {
  }

  public ProductoModel(Long id_producto, String nombre_producto, int tipo_producto, int colores, String talla,
      int licencias, int ofertas, int estampado, int precio, String descripcion, int piezas) {
    this.id_producto = id_producto;
    this.nombre_producto = nombre_producto;
    this.tipo_producto = tipo_producto;
    this.colores = colores;
    this.talla = talla;
    this.licencias = licencias;
    this.ofertas = ofertas;
    this.estampado = estampado;
    this.precio = precio;
    this.descripcion = descripcion;
    this.piezas = piezas;
  }

  public Long getId_producto() {
    return id_producto;
  }

  public void setId_producto(Long id_producto) {
    this.id_producto = id_producto;
  }

  public String getNombre_producto() {
    return nombre_producto;
  }

  public void setNombre_producto(String nombre_producto) {
    this.nombre_producto = nombre_producto;
  }

  public int getTipo_producto() {
    return tipo_producto;
  }

  public void setTipo_producto(int tipo_producto) {
    this.tipo_producto = tipo_producto;
  }

  public int getColores() {
    return colores;
  }

  public void setColores(int colores) {
    this.colores = colores;
  }

  public String getTalla() {
    return talla;
  }

  public void setTalla(String talla) {
    this.talla = talla;
  }

  public int getLicencias() {
    return licencias;
  }

  public void setLicencias(int licencias) {
    this.licencias = licencias;
  }

  public int getOfertas() {
    return ofertas;
  }

  public void setOfertas(int ofertas) {
    this.ofertas = ofertas;
  }

  public int getEstampado() {
    return estampado;
  }

  public void setEstampado(int estampado) {
    this.estampado = estampado;
  }

  public int getPrecio() {
    return precio;
  }

  public void setPrecio(int precio) {
    this.precio = precio;
  }

  public String getDescripcion() {
    return descripcion;
  }

  public void setDescripcion(String descripcion) {
    this.descripcion = descripcion;
  }

  public int getPiezas() {
    return piezas;
  }

  public void setPiezas(int piezas) {
    this.piezas = piezas;
  }

}
