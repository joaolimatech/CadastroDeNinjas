package com.learningjava.CadastroDeNinjas.Missoes.controller;

import com.learningjava.CadastroDeNinjas.Missoes.MissoesModel;
import com.learningjava.CadastroDeNinjas.Missoes.service.MissoesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController  //
@RequestMapping("missoes") //Mapeia nossas APIs. Esta roteando nossa API
public class MissoesController {

    @Autowired
    MissoesService missoesService;

    @PostMapping("/criar")
    public MissoesModel criarMissao(@RequestBody MissoesModel missao) {
        return  missoesService.criarMissao(missao);
    }

    @PutMapping("/alterar")
    public String alterarMissao() {
        return "Missao alterada";
    }

    //GET - Mandar uma requisicao para mostrar as missoes
    @GetMapping("/listar")
    public List<MissoesModel> listarMissoes() {
        return missoesService.listarTodasMissoes();
    }


    @GetMapping("/listar/{id}")
    public MissoesModel listarMissao(@PathVariable Long id) {
        return missoesService.listarMissao(id);
    }

    @DeleteMapping("/deletarId")
    public String deletarMissao() {
        return "Missao deletada";
    }

}
