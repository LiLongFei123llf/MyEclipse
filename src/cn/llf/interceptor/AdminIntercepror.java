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
		 * ��ȡSession
		 */
		HttpSession session = request.getSession();
		User user = (User) session.getAttribute("sessionUser");
		/**
		 * ��֤ʧ�ܣ��ض��򵽵�¼����
		 */
		if(user == null){
			response.sendRedirect(request.getContextPath()+"/user/login");
			return false;
		}
		
		return true;
	}

}
