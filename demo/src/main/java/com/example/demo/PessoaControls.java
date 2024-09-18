package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
@RestController
@RequestMapping("/Pessoas")
public class PessoaControls {
@Autowired
private PessoaRepository pessoaRepository;

@PostMapping
public PessoaEntities criarPessoa(@RequestBody PessoaEntities pessoa) {
	return pessoaRepository.save(pessoa);
}
@GetMapping("/{id}")
public PessoaEntities buscarPessoa(@PathVariable Long id) {
	return pessoaRepository.findById(id).orElse(null);
}
@PutMapping("/{id}")
public PessoaEntities atualizarPessoa(@PathVariable Long id, @RequestBody PessoaEntities pessoa) {
	pessoa.setId(id);
	return pessoaRepository.save(pessoa);
}
@DeleteMapping("/{id}")
public void deletarPessoa(@PathVariable Long id) {
	pessoaRepository.deleteById(id);
}
}