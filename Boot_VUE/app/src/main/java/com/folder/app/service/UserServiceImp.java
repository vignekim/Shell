package com.folder.app.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.folder.app.dao.UserDao;
import com.folder.app.dto.ResultDTO;
import com.folder.app.dto.UserDTO;

@Service
public class UserServiceImp implements UserService {

  private ResultDTO rDto;

  @Autowired UserDao uDao;

  @Override
  public ResultDTO findAll() {
    rDto = new ResultDTO();
    List<UserDTO> resultList = uDao.findAll();
    if(resultList != null){
      rDto.setState(true);
      rDto.setResult(resultList);
    } else {
      rDto.setState(false);
    }
    return rDto;
  }

  @Override
  public ResultDTO editById(UserDTO uDto) {

    return rDto;
  }

  @Override
  public ResultDTO delete(int no) {

    return rDto;
  }

  @Override
  public ResultDTO save(UserDTO uDto){

    return rDto;
  }

}
