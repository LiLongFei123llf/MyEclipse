package cn.llf.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import cn.llf.pojo.User;

public interface UserMapper {
	List<User>findUser();
	 
	List<User>findAllUser(@Param("userName")String userName,@Param("userRole") Integer userRole);
	int insertuser(User user);
	int update(Integer id);
	int delete(Integer id);
}
