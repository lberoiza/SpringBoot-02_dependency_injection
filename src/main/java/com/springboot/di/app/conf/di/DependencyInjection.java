package com.springboot.di.app.conf.di;

import java.util.Arrays;
import java.util.List;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

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

  
  @Bean("ItemFactura")
  public List<ItemFactura> registraItemFactura() {
    Producto producto1 = new Producto("Camara Nikon", 1500);
    Producto producto2 = new Producto("Bicicleta Bianchi Aro 26", 1000);

    ItemFactura item1 = new ItemFactura(producto1, 1);
    ItemFactura item2 = new ItemFactura(producto2, 3);
    
    return Arrays.asList(item1, item2);
  }
  
}
