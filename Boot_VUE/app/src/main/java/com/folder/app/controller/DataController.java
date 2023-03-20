package com.folder.app.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

//@CrossOrigin(origins = "http://localhost:8800")
@RestController
public class DataController {
  
  @GetMapping("/")
  public String home() {
    return "Data 준비 중 ....";
  }

  @GetMapping("/api")
  public String api() {
    return "Api Data 준비 중 ....";
  }

}
