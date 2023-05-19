package com.springboot.di.app.models.services;

public class MiServicioInyectado implements IService{

  public String operacion() {
    return "Ejecutando algún proceso importante Inyectado...";
  }

}
