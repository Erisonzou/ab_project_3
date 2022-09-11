package com.example.demo;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class EmployeeController {
	@RequestMapping("/")
	public ModelAndView load(HttpServletRequest request,HttpServletResponse response) {
		ModelAndView mv=new ModelAndView();
		mv.setViewName("index.jsp");
			return mv;
		}
	
	
	@RequestMapping("/employee")
	public ModelAndView add(HttpServletRequest request,HttpServletResponse response) {
	ModelAndView mv=new ModelAndView();
	Employee e=new Employee();
	e.setEmpno(Integer.parseInt(request.getParameter("no")));
	e.setEmpname(request.getParameter("name"));
	e.setEmpemail(request.getParameter("email"));
	mv.setViewName("display.jsp");
	mv.addObject("employee", e);
		return mv;
	}
}

