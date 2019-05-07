package com.uca.capas.controller;

import javax.validation.Valid;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.uca.capas.domain.Product;
import com.uca.capas.domain.User;

@Controller
public class MainController {

	@RequestMapping("/")
	public ModelAndView initMain() {
		ModelAndView mav = new ModelAndView();
		Product product = new Product();
		mav.addObject("message", "Agregue un producto");
		mav.addObject("product", product);
		mav.setViewName("mainproduct");
		return mav;
	}
	
	@RequestMapping("/formData")
	public ModelAndView form(@Valid @ModelAttribute Product product, BindingResult result) {
		ModelAndView mav = new ModelAndView();
		if(result.hasErrors()) {
			mav.setViewName("mainproduct");
		}else {
			mav.addObject("message", "Producto agregado con exito");
			mav.setViewName("form");
		}
		return mav;
	}

	@RequestMapping("/User")
	public ModelAndView initMainUser() {
		ModelAndView mav = new ModelAndView();
		User user = new User();
		mav.addObject("message", "Bienvenidos a MVC");
		mav.addObject("user", user);
		mav.setViewName("main");
		return mav;
	}
	
	@RequestMapping("/formDataUser")
	public ModelAndView formUser(@Valid @ModelAttribute User user, BindingResult result) {
		ModelAndView mav = new ModelAndView();
		if(result.hasErrors()) {
			mav.setViewName("main");
		}else {
			mav.addObject("message", "Persona agregada con exito");
			mav.setViewName("form");
		}
		return mav;
	}
}