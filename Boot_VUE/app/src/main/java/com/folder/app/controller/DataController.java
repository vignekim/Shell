package com.folder.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

import com.folder.app.dto.ResultDTO;
import com.folder.app.dto.UserDTO;
import com.folder.app.service.UserService;

@CrossOrigin(origins = "http://localhost:8800")
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

  @Autowired UserService uService;

  @PostMapping("/findAll")
  public ResultDTO findAll(){
    return uService.findAll();
  }

  @PostMapping("/editById")
  public ResultDTO editById(UserDTO uDto){
    return null;
  }

  @DeleteMapping("/delete")
  public ResultDTO delete(int no){
    return null;
  }

  @PutMapping("/save")
  public ResultDTO save(UserDTO uDto){
    return null;
  }

}
