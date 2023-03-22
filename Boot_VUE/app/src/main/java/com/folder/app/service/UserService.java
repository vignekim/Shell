package com.folder.app.service;

import com.folder.app.dto.ResultDTO;
import com.folder.app.dto.UserDTO;

public interface UserService {

  public ResultDTO findAll();
  public ResultDTO editById(UserDTO uDto);
  public ResultDTO delete(int no);
  public ResultDTO save(UserDTO uDto);

}
