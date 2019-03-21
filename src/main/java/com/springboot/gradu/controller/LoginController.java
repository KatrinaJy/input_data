package com.springboot.gradu.controller;



import com.springboot.gradu.Enum.FYEnum;
import com.springboot.gradu.service.model.UserContext;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Controller
public class LoginController {

	@RequestMapping(value = "/login.do", method = RequestMethod.POST)
	public String loginPost(HttpServletRequest request, HttpServletResponse response, ModelMap model) {
		String username = request.getParameter("yhm");
		String password = request.getParameter("mm");
		if("super".equals(username)&&"PassWord".equals(password)){
			UserContext user=new UserContext();
			user.setName(username);
			request.getSession().setAttribute("userContext", user);
			FYEnum[] fyenums = FYEnum.values();
			model.addAttribute("fyenums", fyenums);
			model.addAttribute("user","π‹¿Ì‘±");
			return "loginAgain";
		}
		return "login";
	}
	
	@RequestMapping(value = "/login.do", method = RequestMethod.GET)
	public String loginGet(HttpServletRequest request, HttpServletResponse response, ModelMap model) {
		
		return "login";
	}
	
	@RequestMapping(value = "/loginout.do", method = RequestMethod.GET)
	public String loginout(HttpServletRequest request, HttpServletResponse response, ModelMap model) {
		request.getSession().setAttribute("userContext", null);
		return "login";
	}
}
