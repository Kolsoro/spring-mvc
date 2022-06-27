package com.samer;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class AddServlet {
    @Autowired
	private AddService addService;
    
	@GetMapping("/add")
	public ModelAndView add(@RequestParam("t1") int i,@RequestParam("t2") int j) {
		System.out.println("Hello samer mvc ");
		
		int k = addService.add(i, j);
		ModelAndView mv = new ModelAndView();
		mv.setViewName("display");
		mv.addObject("result", k);
		return mv;
	}

}
