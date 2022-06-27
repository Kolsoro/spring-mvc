package com.samer;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class AddController {

	@GetMapping
	public ModelAndView add(@RequestParam("i") int i, @RequestParam("j") int j) {
		int k = i + j;
		ModelAndView mv = new ModelAndView();
		mv.setViewName("display");
		mv.addObject("result", k);
		return mv;
	}
}
