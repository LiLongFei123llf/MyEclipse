package cn.llf.service;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Service;

import com.github.pagehelper.PageInfo;

import cn.llf.pojo.User;

public interface UserService {
	List<User>findUser();
	PageInfo<User>findAllUser1(String userName,Integer userRole,Integer pageNum);
	int insertuser(User user);
}
