package com.example.demo;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PessoaService {
@Autowired
	private PessoaRepository pessoaRepository;
	public List<PessoaEntities> ListarTodos(){
		return pessoaRepository.findAll();
	}
	public PessoaEntities salvar(PessoaEntities pessoa) {
		return pessoaRepository.save(pessoa);
	}
	public void deletar(Long id) {
		pessoaRepository.deleteById(id);
	}
	public Optional<PessoaEntities> buscarPorId(Long id){
		return pessoaRepository.findById(id);
	}

}

