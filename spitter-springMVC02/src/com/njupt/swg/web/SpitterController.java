package com.njupt.swg.web;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.Errors;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import com.njupt.swg.bean.Spitter;
import com.njupt.swg.data.ISpitterDao;

@Controller
@RequestMapping("/spitter")
public class SpitterController {
	private ISpitterDao spitterDao;
	
	@Autowired
	public SpitterController(ISpitterDao spitterDao) {
		this.spitterDao = spitterDao;
	}
	
	@RequestMapping(value="/register",method=RequestMethod.GET)
	public String showRegisterationForm(){
		return "registerForm";
	}
	
	 @RequestMapping(value="/register", method=RequestMethod.POST)
	 public String processRegistration(@Valid Spitter spitter,Errors errors,Model model) {
	    if (errors.hasErrors()) {
	      return "registerForm";
	    }
	    spitterDao.save(spitter);
	    return "redirect:/spitter/" + spitter.getUsername();
	  }
	 
	  @RequestMapping(value="/{username}", method=RequestMethod.GET)
	  public String showSpitterProfile(@PathVariable String username, Model model) {
	    Spitter spitter = spitterDao.findByUsername(username);
	    model.addAttribute(spitter);
	    return "profile";
	  }
	
}
