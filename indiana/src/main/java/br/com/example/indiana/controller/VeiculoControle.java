package br.com.example.indiana.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PathVariable;

import br.com.example.indiana.model.VeiculoModel;
import br.com.example.indiana.repository.RepositorioVeiculo;
import java.util.List;

@RestController
public class VeiculoControle{
    
    @Autowired
    private RepositorioVeiculo acao;

    @PostMapping("/Veiculo")
    public VeiculoModel salvar(@RequestBody VeiculoModel obj) {
        return acao.save(obj);
    }

    @GetMapping("/Veiculo")
    public List<VeiculoModel> listar() {
        return acao.findAll();
    }

    @GetMapping("/Veiculo/{id}")
    public VeiculoModel buscar(@PathVariable int codigo) {
        return acao.findByCodigo(codigo);
    }

    @GetMapping("/Veiculo")
    public VeiculoModel editar(@RequestBody VeiculoModel obj) {
        return acao.save(obj);
    }

    @DeleteMapping("/Veiculo/{id}")
    public void excluir(@PathVariable int codigo) {
        VeiculoModel obj = acao.findByCodigo(codigo);
        acao.delete(obj);
    }
}
