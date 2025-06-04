package br.com.example.indiana.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import br.com.example.indiana.model.VeiculoModel;

public interface  RepositorioVeiculo extends CrudRepository<VeiculoModel, Integer> {
    List<VeiculoModel> findAll();
    VeiculoModel findByMarcaAndModelo(String marca, String modelo);
    VeiculoModel findByCodigo(int codigo);
}
