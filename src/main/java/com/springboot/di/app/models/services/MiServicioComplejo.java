package com.springboot.di.app.models.services;

import org.springframework.stereotype.Component;

@Component("MiServicioComplejo")
public class MiServicioComplejo implements IService{

  @Override
  public String operacion() {
    return "Ejecutando algún proceso importante Complejo...";
  }

}
