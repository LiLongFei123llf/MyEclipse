package cn.llf.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

import cn.llf.mapper.UserMapper;
import cn.llf.pojo.User;
import cn.llf.service.UserService;
@Service("userService")
public class UserServiceImpl implements UserService{
	@Autowired
	private UserMapper userMapper;
	public UserMapper getUserMapper() {
		return userMapper;
	}
	public void setUserMapper(UserMapper userMapper) {
		this.userMapper = userMapper;
	}
	@Override
	public List<User> findUser() {
		// TODO Auto-generated method stub
		return userMapper.findUser();
	}
	@Override
	public PageInfo<User> findAllUser1(String userName, Integer userRole, Integer pageNum) {
		int pageSize=3;
		PageHelper.startPage(pageNum, pageSize);
		System.out.println(userName+userRole+"-------------------");
		List<User>users=userMapper.findAllUser(userName, userRole);
		System.out.println(users.size()+"------------------------");
		PageInfo<User>info=new PageInfo<User>(users);
		return info;
	}
	@Override
	public int insertuser(User user) {
		int count=userMapper.insertuser(user);
		return count;
	}

}
