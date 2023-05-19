package com.springboot.di.app.conf.di;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.springboot.di.app.models.services.IService;
import com.springboot.di.app.models.services.MiServicioInyectado;

@Configuration
public class DependencyInjection {
  
  @Bean("MiServicioInyectado")
  public IService registrarMiServicioInyectado() {
    return new MiServicioInyectado();
  }

}
