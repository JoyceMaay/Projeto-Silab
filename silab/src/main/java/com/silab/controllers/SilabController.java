package com.silab.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.silab.models.Laboratorio;
import com.silab.repository.LaboratorioRepository;

@Controller
public class SilabController {
	
	@Autowired
	private LaboratorioRepository lr;
	
	@GetMapping("/paginaInicial")
	public String index() {
		return "silab/paginaInicial/inicio";
	}
	
	@GetMapping("/cadastrarLab")
	public String form() {
		return "silab/laboratorios/formLaboratorio";
	}
	
	@RequestMapping(value = "/{codigo}", method = RequestMethod.GET)
	public ModelAndView DetalhesLaboratorio(@PathVariable("codigo") long codigo) {
		Laboratorio laboratorio = lr.findByCodigo(codigo);
		ModelAndView mv = new ModelAndView("silab/laboratorios/DetalhesLaboratorio");
		mv.addObject("laboratorio", laboratorio);
		return mv;
	}
}
