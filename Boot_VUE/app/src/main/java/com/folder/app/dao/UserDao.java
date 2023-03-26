package com.folder.app.dao;

import java.util.List;

import com.folder.app.dto.ResultDTO;
import com.folder.app.dto.UserDTO;

public interface UserDao {

  public List<UserDTO> findAll();
  public int editById(UserDTO uDto);
  public int delete(int no);
  public ResultDTO save(UserDTO uDto);

}
