 package com.example.demo;

import javax.persistence.Table;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller

public class BibliotecaController {
	
	private BibliotecaRepositorioSpring bb;
	
	@Autowired
	public BibliotecaController(BibliotecaRepositorioSpring bb/*, VendaRepositorioSpring vr*/) {
		this.bb = bb;
	}

	@RequestMapping("/profile")
	public String consultarBib(Model model) {
		model.addAttribute("Biblioteca", bb.findAll());
		return "profile";
	}
	
}
