package br.com.example.indiana.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import br.com.example.indiana.model.PessoaModel;

public interface RepositorioPessoa extends CrudRepository<PessoaModel, Integer>{
    List<PessoaModel> findAll();
    PessoaModel findById(int id);
}
