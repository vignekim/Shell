package com.folder.app.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.SelectKey;
import org.apache.ibatis.annotations.Update;
import org.apache.ibatis.mapping.StatementType;

import com.folder.app.dto.UserDTO;

@Mapper
public interface UserMapper {

  @Select("select * from user3 where del = false group by no desc")
  public List<UserDTO> findAll();

  @Update("update user3 set name = #{name}, pwd = #{pwd}, gender = #{gender} where no = #{no}")
  public int editById(UserDTO uDto);

  @Update("update user3 set del = true where no = #{no}")
  public int delete(int no);

  @SelectKey(statementType = StatementType.PREPARED, statement = "select last_insert_id() as no", keyProperty = "no", before = false, resultType = int.class)
  @Insert("insert into user3 (name, email, pwd, gender) value (#{name},#{email},#{pwd},#{gender})")
  public int save(UserDTO uDto);

}
