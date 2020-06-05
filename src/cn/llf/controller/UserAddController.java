package cn.llf.controller;

import java.io.File;
import java.io.IOException;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.multipart.MultipartFile;

import cn.llf.pojo.User;
import cn.llf.service.UserService;

@Controller
@RequestMapping("/useradd")
public class UserAddController {
	@Autowired
	private UserService userService;
	@RequestMapping("/add")
	public String addUser(@ModelAttribute("user") User user){ 
		System.out.println("-----------------------useradd-----------");
		return"add";
	}
	@RequestMapping("/insert")
	public String insert(@Valid User user,BindingResult br,MultipartFile multipartFile,
			HttpServletRequest requests ){
		
		System.out.println("------------------------------ajjjj----------------------");
		System.out.println(user.getUserName()+"--------------------");
		if(br.hasErrors()){
			return"add";
		}
		String userPhoto="";
		if(multipartFile !=null && !multipartFile.isEmpty()){
			String targeFolder=requests.getServletContext().getRealPath("/statics/uploads");
			String timeName=String.valueOf(System.currentTimeMillis());
			String orgName=multipartFile.getOriginalFilename();
			String extName=orgName.split("\\.")[orgName.split("\\.").length-1];
			userPhoto=timeName+"."+extName;
			try {
				multipartFile.transferTo(new File(targeFolder+File.separator+userPhoto));
			} catch (IllegalStateException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			
		}
		if(!userPhoto.equals("")){
			user.setUserPhoto(userPhoto);
		}
		
		int count=userService.insertuser(user);
		System.out.println("------------------------------sxxxxx----------------------");
		System.out.println(user.getUserName()+"--------------------");
		if(count==1){
			return "redirect:/user/listinfo";
		}
		return"useradd/add";
	}
		
}
