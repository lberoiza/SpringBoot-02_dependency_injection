package com.springboot.di.app.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.springboot.di.app.models.services.IService;

@Controller
public class IndexController {

  @Autowired
  private IService service;

  @GetMapping({"", "/", "/index"})
  public String index(Model model) {
    model.addAttribute("result", service.operacion());
    return "index";
  }

}
