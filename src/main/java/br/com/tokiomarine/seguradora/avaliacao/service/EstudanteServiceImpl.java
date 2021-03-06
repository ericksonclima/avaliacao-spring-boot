package br.com.tokiomarine.seguradora.avaliacao.service;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.tokiomarine.seguradora.avaliacao.entidade.Estudante;
import br.com.tokiomarine.seguradora.avaliacao.repository.EstudanteRepository;

/**
 * Implementação {@link EstudanteService}
 * 
 * @author Erickson Lima
 *
 */
@Service
public class EstudanteServiceImpl implements EstudanteService {

	@Autowired
	private EstudanteRepository repository;

	@Override
	public Estudante salvarEstudante(@Valid Estudante estudante) {
		return repository.save(estudante);
	}


	@Override
	public List<Estudante> buscarEstudantes() {
		return (List<Estudante>) repository.findAll();
	}

	@Override
	public Estudante buscarEstudante(Long id) {
		return repository.findById(id).orElse(null);
	}

	@Override
	public void deletarEstudante(Long id) {
		repository.deleteById(id);
	}
}
