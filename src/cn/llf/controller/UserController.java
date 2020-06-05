package cn.llf.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.github.pagehelper.PageInfo;

import cn.llf.pojo.User;
import cn.llf.service.UserService;

@Controller
@RequestMapping("/user")
public class UserController {
	@Autowired
	private UserService userService;
	
	@RequestMapping("/list")
	@ResponseBody
	public List<User>listkk(){
		return userService.findUser();
	}
	@RequestMapping("/listinfo")
	public ModelAndView userListPage(String userName,Integer userRole,Integer pageNum){
		if(pageNum ==null || pageNum ==0){
			pageNum=1;
			}
		PageInfo<User>pageInfo=userService.findAllUser1(userName, userRole, pageNum);
		ModelAndView mv=new ModelAndView();
		mv.addObject("pageCount",pageInfo.getPages());
		mv.addObject("userList", pageInfo.getList());
		mv.addObject("userName", userName);
		mv.addObject("userRole", userRole); 
		mv.setViewName("listinfo");
		return mv;
		}
	@RequestMapping("/update")
	public String up(){
		return "update";
	}
	
}
