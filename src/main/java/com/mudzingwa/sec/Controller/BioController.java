package com.mudzingwa.sec.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;


import com.mudzingwa.sec.Models.Bio;
import com.mudzingwa.sec.Service.BioServiceIntef;
//import com.mudzingwa.security.Models.User;

@Controller
public class BioController {
	@Autowired
	private BioServiceIntef service;
	@PostMapping("/save")
	public String addBio(@ModelAttribute("bio") Bio bio, ModelMap model) {
		Bio biodata = service.addBio(bio);
		 String msg = "User "+biodata.getFname()+" successfully saved ";
		 model.addAttribute("msga", msg);
	    return "BioData";
			
	}
	@GetMapping("/register")
	public String showBioreg() {
		return "BioData";
	}
	

}
