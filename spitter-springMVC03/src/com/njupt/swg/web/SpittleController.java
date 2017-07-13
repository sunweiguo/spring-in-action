package com.njupt.swg.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.njupt.swg.data.ISpittleDao;

@Controller
@RequestMapping("spittles")
public class SpittleController {
	private ISpittleDao sd;
	public SpittleController(ISpittleDao sd) {
		this.sd = sd;
	}
	
	@RequestMapping(method = RequestMethod.GET)
	public String spittles(Model model) {
	    model.addAttribute(sd.findSpittles());
	    return "spittles";
	}
}
