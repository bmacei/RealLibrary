 package com.example.demo;

import java.util.ArrayList;
import java.util.List;

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
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.thymeleaf.expression.Ids;

@Controller

public class UserController {
	
	private BibliotecaRepositorioSpring br;
	private JogoRepositorioSpring jg;
	private UserRepositorioSpring ur;
	int tempid;
	
	@Autowired
	public void ListaJogosController(JogoRepositorioSpring jg,UserRepositorioSpring ur,BibliotecaRepositorioSpring br) {
		this.jg = jg;
		this.br= br;
		this.ur = ur;
		
	}
	
	@GetMapping("/samegame")
	public String consultarBib(@RequestParam(name="option") Integer option,Model model) {

		Iterable<Biblioteca> bl = br.findAll();
		Iterable<NUser> us = ur.findAll();
		Iterable<Jogo>       jl = jg.findAll();
		
		List<Jogo> x = new ArrayList<>();
		List<Jogo> y = new ArrayList<>();
		
	for(NUser n:us) {
		if(n.getU()== option) {
			for(Biblioteca b:bl) {
				for(Jogo j:jl) {
					if(n.getJogo()==b.getJogo()) {
						if(b.getJogo() == j.getCodigoJogo() && !(x.contains(j))) {
				
							x.add(j);
						}
					}
				}
			}
		}
	}
		model.addAttribute("Jogo", x);
		
		return "samejogo";
	}
	

}
