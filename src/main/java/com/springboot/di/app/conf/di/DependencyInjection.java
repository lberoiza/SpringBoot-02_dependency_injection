package com.springboot.di.app.conf.di;

import java.util.Arrays;
import java.util.List;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

import com.springboot.di.app.models.domain.ItemFactura;
import com.springboot.di.app.models.domain.Producto;
import com.springboot.di.app.models.services.IService;
import com.springboot.di.app.models.services.MiServicioInyectado;

@Configuration
public class DependencyInjection {
  
  @Bean("MiServicioInyectado")
  public IService registrarMiServicioInyectado() {
    return new MiServicioInyectado();
  }
  
  @Primary
  @Bean("ItemFactura")
  public List<ItemFactura> registraItemFactura() {
    Producto producto1 = new Producto("Camara Nikon", 1500);
    Producto producto2 = new Producto("Bicicleta Bianchi Aro 26", 1000);

    ItemFactura item1 = new ItemFactura(producto1, 1);
    ItemFactura item2 = new ItemFactura(producto2, 3);

    return Arrays.asList(item1, item2);
  }

  
  @Bean("ItemFacturaOficina")
  public List<ItemFactura> registraItemFacturaOficina() {
    Producto producto1 = new Producto("Silla de Escritorio", 500);
    Producto producto2 = new Producto("Escritorio", 1000);
    Producto producto3 = new Producto("Laptop Dell", 2000);
    Producto producto4 = new Producto("Impresora Multifuncional Epson", 3500);
    Producto producto5 = new Producto("Monitor 24 pulgadas Dell", 1000);

    ItemFactura item1 = new ItemFactura(producto1, 4);
    ItemFactura item2 = new ItemFactura(producto2, 4);
    ItemFactura item3 = new ItemFactura(producto3, 4);
    ItemFactura item4 = new ItemFactura(producto4, 1);
    ItemFactura item5 = new ItemFactura(producto5, 8);

    return Arrays.asList(item1, item2, item3, item4, item5);
  }
  
}
