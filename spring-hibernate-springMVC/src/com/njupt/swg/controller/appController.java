package com.njupt.swg.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.njupt.swg.model.User;
import com.njupt.swg.service.IUserService;

@Controller("userController")
@RequestMapping("/")
public class appController {
	@Autowired
	private IUserService userService;
	@Autowired
	MessageSource messageSource;
	
	@RequestMapping(value={"/","/list"}, method = RequestMethod.GET)
	public String listAllUsers(Model model){
		List<User> users = userService.listAllUSers();
		model.addAttribute("users", users);
		return "list";
	}
	
	@RequestMapping(value="/add",method=RequestMethod.GET)
	public String addUser(Model model){
		User user = new User();
		model.addAttribute("user",user);
		return "add";
	}
	
	@RequestMapping(value="/add",method=RequestMethod.POST)
	public String addUser(@Valid User user,BindingResult br,Model model){
		if(br.hasErrors()){
			return "add";
		}
		userService.addUser(user);
		return "redirect:/list";
	}
	
	@RequestMapping(value="/delete/{id}",method=RequestMethod.GET)
	public String delete(@PathVariable int id){
		System.out.println(id);
		userService.delete(id);
		return "redirect:/list";
	}
}
