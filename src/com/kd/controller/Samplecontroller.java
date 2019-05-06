package com.kd.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.kd.SampleDAO.LoginDAO;
import com.kd.model.Login;

@Controller
public class Samplecontroller {
	@Autowired
	LoginDAO ldao;
	@RequestMapping(value="/")
	public String home() {
		return "login";
	}
	@RequestMapping(value="check",method=RequestMethod.GET)
	public String loginchk(@ModelAttribute Login l,Model model) {
		if(ldao.lchk(l)==1) {
			System.out.println(l.getUname());
			model.addAttribute("name",l);
			return "home";
		}
		return "register";
	}
	@RequestMapping(value="register",method=RequestMethod.GET)
	public String register(@ModelAttribute Login l,Model model) {
		ldao.reg(l);
		return "login";
	}
}
