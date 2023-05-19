package com.springboot.di.app.models.services;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Primary
@Component("MiServicioSimple")
public class MiServicio implements IService{

  @Override
  public String operacion() {
    return "Ejecutando algún proceso importante Simple...";
  }

}
