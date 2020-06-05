package cn.llf.interceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import cn.llf.pojo.User;

public class AdminIntercepror extends HandlerInterceptorAdapter{


	@Override
	public boolean preHandle(HttpServletRequest request, 
			HttpServletResponse response, Object handler)
			throws Exception {
		/**
		 * 获取Session
		 */
		HttpSession session = request.getSession();
		User user = (User) session.getAttribute("sessionUser");
		/**
		 * 验证失败，重定向到登录界面
		 */
		if(user == null){
			response.sendRedirect(request.getContextPath()+"/user/login");
			return false;
		}
		
		return true;
	}

}
