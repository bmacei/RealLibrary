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
import org.springframework.web.bind.annotation.RestController;
import org.thymeleaf.expression.Ids;

@Controller

public class BibliotecaController {
	
	private BibliotecaRepositorioSpring br;
	private JogoRepositorioSpring jg;
	
	@Autowired
	public void ListaJogosController(JogoRepositorioSpring jg) {
		this.jg = jg;
		
	}
	
	@Autowired
	public BibliotecaController(BibliotecaRepositorioSpring bc) {
		this.br = bc;
	}

	@RequestMapping("/profile")
	public String consultarBib(Model model) {
//		model.addAttribute("Biblioteca", br.findAll());
		
		Iterable<Biblioteca> bl = br.findAll();
		Iterable<Jogo>       jl = jg.findAll();
		
		List<Jogo> x = new ArrayList<>();

		for(Biblioteca b:bl) {
			for(Jogo j:jl) {
				if(b.getJogo() == j.getCodigoJogo() && !(x.contains(j))) {
				
					x.add(j);
				}
			}
		}
		
		model.addAttribute("Jogo", x);
		
		return "profile";
	}
	
	/*@GetMapping("/profile")
    public String bibliotecaForm(Model model) {
        model.addAttribute("bib", new Biblioteca());
        return "cadastraprodutos""profile";
    }*/
	
	@PostMapping("/profile")
	public String bibliotecaCadastro(@ModelAttribute Biblioteca bib, Model model) {
		Biblioteca bibl = br.save(bib);
		return "redirect:/profile";
	}
}
