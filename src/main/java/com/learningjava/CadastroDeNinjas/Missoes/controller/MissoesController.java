package com.learningjava.CadastroDeNinjas.Missoes.controller;

import org.springframework.web.bind.annotation.*;

@RestController  //
@RequestMapping("missoes") //Mapeia nossas APIs. Esta roteando nossa API
public class MissoesController {

    @PostMapping("/criar")
    public String criarMissao() {
        return "Missao criada";
    }

    @PutMapping("/alterar")
    public String alterarMissao() {
        return "Missao alterada";
    }

    //GET - Mandar uma requisicao para mostrar as missoes
    @GetMapping("/listar")
    public String listarMissoes() {
        return "Todas as missoes";
    }

    @DeleteMapping("/deletarId")
    public String deletarMissao() {
        return "Missao deletada";
    }

}
