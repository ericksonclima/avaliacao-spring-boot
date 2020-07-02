package br.com.tokiomarine.seguradora.avaliacao.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.tokiomarine.seguradora.avaliacao.entidade.Estudante;
import br.com.tokiomarine.seguradora.avaliacao.service.EstudanteService;

/**
 * Rest Controller Estudantes
 * @see Estudante
 * @see EstudanteService
 * @author Erick Lima
 *
 */
@RestController()
@RequestMapping("/rs/estudantes")
public class EstudanteRestController {

	@Autowired
	private EstudanteService estudanteService;

	@PostMapping
	public Estudante create( @RequestBody Estudante estudante) {
		estudante.setId(null);
		estudante = estudanteService.salvarEstudante(estudante);
		return estudante;
	}

	@PutMapping
	public Estudante update(@RequestBody Estudante estudante) {

		estudante = estudanteService.salvarEstudante(estudante);
		return estudante;
	}

	@GetMapping
	public List<Estudante> list(){
		return estudanteService.buscarEstudantes();
	}
	@GetMapping("{id}")
	public Estudante findById(@PathVariable Long id) {
		return estudanteService.buscarEstudante(id);
	}
	@DeleteMapping("{id}")
	public void delete(@PathVariable Long id) {
		estudanteService.deletarEstudante(id);
	}
}
