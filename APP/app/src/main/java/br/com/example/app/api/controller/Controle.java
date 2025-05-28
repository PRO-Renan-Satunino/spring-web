package br.com.example.app.api.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import br.com.example.app.api.model.Pessoa;

@RestController
public class Controle {
    //Definir a primeira rota
    @GetMapping("Hello")

    public String mensagem() {
        return "Olá Mundo!";
    }

    @GetMapping("/boasvindas")
    public String boasVindas() {
        return "Seja bem vindo!";
    }

    @PostMapping("/boasvindas/{nome}")
    public String boasVindas(@PathVariable String nome) {
        return "Seja bem vindo (A) !"+nome;
    }

    @PostMapping("/pessoa")
    public Pessoa pessoa(@RequestBody Pessoa p) {
        return p;
    }
}
