package br.com.tokiomarine.seguradora.avaliacao.service;

import java.util.List;

import javax.validation.Valid;

import br.com.tokiomarine.seguradora.avaliacao.entidade.Estudante;
import br.com.tokiomarine.seguradora.avaliacao.repository.EstudanteRepository;

/**
 * Implementação {@link EstudanteService}
 * 
 * @author Erickson Lima
 *
 */
public class EstudanteServiceImpl implements EstudanteService {

	EstudanteRepository repository;

	@Override
	public void cadastrarEstudante(@Valid Estudante estudante) {

	}

	@Override
	public void atualizarEstudante(@Valid Estudante estudante) {

	}

	@Override
	public List<Estudante> buscarEstudantes() {
		return null;
	}

	@Override
	public Estudante buscarEstudante(long id) {
		throw new IllegalArgumentException("Identificador inválido:" + id);
	}

}
