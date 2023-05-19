package com.springboot.di.app.models.domain;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;

@Component
public class Factura {

  @Value("${factura.descripcion}")
  private String descripcion;

  @Autowired
  private Cliente cliente;

  @Autowired
  @Qualifier("ItemFacturaOficina")
  private List<ItemFactura> items;


  @PostConstruct
  public void despuesConstructor() {
    cliente.setNombre("Luis Alberto");
    cliente.setApellido("Beroíza Osses");
    descripcion = descripcion.concat(" de "+cliente.getNombreCompleto());
  }


  @PreDestroy
  public void antesDestruir() {
    System.out.println("Antes de Destruir el Contenedor, se ejecuta este metodo");
    System.out.println("Como Nuestra clase es Singleton, ese metodo se ejecutara");
    System.out.println("Cuando la aplicacion finalize");
  }

  public String getDescripcion() {
    return descripcion;
  }

  public void setDescripcion(String descripcion) {
    this.descripcion = descripcion;
  }

  public Cliente getCliente() {
    return cliente;
  }

  public void setCliente(Cliente cliente) {
    this.cliente = cliente;
  }

  public List<ItemFactura> getItems() {
    return items;
  }

  public void setItems(List<ItemFactura> items) {
    this.items = items;
  }

  public Integer getTotal( ) {
    return this.items.stream().map((item) -> item.getTotal()).reduce(0, Integer::sum);
  }
}
