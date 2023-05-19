package com.springboot.di.app.models.domain;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.web.context.annotation.ApplicationScope;
import org.springframework.web.context.annotation.RequestScope;
import org.springframework.web.context.annotation.SessionScope;


// Scope de los Componentes de Spring

//@Componente sin nada es @Stateless de JEE, solo una instancia para la aplicacion
//no tiene estado (Mas grande)
//
//@Component
//RequestScope El Componente se crea y se destruye en cada HTTP Request (Mas pequenio)
//
//@Component
//@SessionScope es un Componente de Sesion, estará vivo mientras el navegador del usuario
//  esté abierto y no sucesa ningun timeout (Mediano)
//  El componente debe implementar la inderfaz Serializable
//
//@Component
//@ApplicationScope: Es muy parecido Sigleton, pero la diferencia radica en que se guarda
//       en el servlet context y no en el application context de spring


@Component
@RequestScope
public class Cliente {

  @Value("${cliente.nombre}")
  private String nombre;

  @Value("${cliente.apellido}")
  private String apellido;
  

  public String getNombre() {
    return nombre;
  }
  
  public void setNombre(String nombre) {
    this.nombre = nombre;
  }
  
  public String getApellido() {
    return apellido;
  }
  
  public void setApellido(String apellido) {
    this.apellido = apellido;
  }
  
  public String getNombreCompleto() {
    return this.getNombre() + " " + this.getApellido();
  }
}
