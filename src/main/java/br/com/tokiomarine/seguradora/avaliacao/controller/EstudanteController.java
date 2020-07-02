package br.com.tokiomarine.seguradora.avaliacao.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import br.com.tokiomarine.seguradora.avaliacao.entidade.Estudante;
import br.com.tokiomarine.seguradora.avaliacao.service.EstudanteService;
/**
 * Controller MVC  Estudantes
 * @see Estudante
 * @see EstudanteService
 * @author Erickson Lima
 *
 */
@Controller
@RequestMapping("/estudantes/")
public class EstudanteController {

	@Autowired
	private EstudanteService service;

	/**
	 *  Navega ate a pagina de criação de estudantes
	 * @param estudante
	 * @return
	 */
	@GetMapping("criar")
	public String iniciarCastrado(Estudante estudante) {
		return "cadastrar-estudante";
	}

	
	@GetMapping("listar")
	public String listarEstudantes(Model model) {
		List<Estudante> estudantes = service.buscarEstudantes();
		if(estudantes.isEmpty()) {
			estudantes = null;
		}
		model.addAttribute("estudantes", estudantes);
		return "index";
	}

	@PostMapping("add")
	public String adicionarEstudante(@Valid Estudante estudante, BindingResult result, Model model) {
		if (result.hasErrors()) {
			return "cadastrar-estudante";
		}

		service.cadastrarEstudante(estudante);

		return "redirect:listar";
	}

	@GetMapping("editar/{id}")
	public String exibirEdicaoEstudante(long id, Model model) {
		Estudante estudante = service.buscarEstudante(id);
		model.addAttribute("estudante", estudante);
		return "atualizar-estudante";
	}

	@PostMapping("atualizar/{id}")
	public String atualizarEstudante(@PathVariable("id") long id, @Valid Estudante estudante, BindingResult result, Model model) {
		if (result.hasErrors()) {
			// estudante.setId(id);
			return "atualizar-estudante";
		}

		service.atualizarEstudante(estudante);

		model.addAttribute("estudantes", service.buscarEstudantes());
		return "index";
	}

	@GetMapping("apagar/{id}")
	public String apagarEstudante(@PathVariable("id") long id, Model model) {
		// TODO IMPLEMENTAR A EXCLUSAO DE ESTUDANTES
		model.addAttribute("estudantes", service.buscarEstudantes());
		return "index";
	}
}
