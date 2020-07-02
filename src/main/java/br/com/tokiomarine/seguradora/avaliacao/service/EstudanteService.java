package br.com.tokiomarine.seguradora.avaliacao.service;

import java.util.List;

import javax.validation.Valid;

import br.com.tokiomarine.seguradora.avaliacao.entidade.Estudante;

/**
 * Interface Service link {@link Estudante}
 * @author Erick Lima
 *
 */
public interface EstudanteService {

	List<Estudante> buscarEstudantes();

	void cadastrarEstudante(@Valid Estudante estudante);

	Estudante buscarEstudante(Long id);

	void atualizarEstudante(@Valid Estudante estudante);
	
	void deletarEstudante(Long id);
}
