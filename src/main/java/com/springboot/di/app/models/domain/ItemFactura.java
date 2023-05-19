package com.springboot.di.app.models.domain;

public class ItemFactura {

  private Producto producto;
  private Integer cantidad;

  public ItemFactura(Producto producto, Integer cantidad) {
    this.producto = producto;
    this.cantidad = cantidad;
  }

  public Producto getProducto() {
    return producto;
  }

  public void setProducto(Producto producto) {
    this.producto = producto;
  }

  public Integer getCantidad() {
    return this.cantidad;
  }

  public void setCantidad(Integer cantidad) {
    this.cantidad = cantidad;
  }
  
  public Integer getTotal() {
    return this.cantidad * this.producto.getPrecio();
  }
}
