package com.learningjava.CadastroDeNinjas.Ninjas.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping
public class NinjaController {

    @GetMapping("/boas-vindas")
    public String boasVindas(){
        return "Bem vindo a aplicacao";
    }

    //Add ninja
    @PostMapping("/criar")
    public String criarNinja(){
        return "ninja criado";
    }

    // procurar ninja
    @GetMapping("/todos")
    public String mostrarTOdosNinjas(){
        return "todos ninjas";
    }

    //mostrat todos ninjas (READ)
    @GetMapping("/todosID")
    public String mostrarNinjasID(){
        return "mostrar por ID";
    }

    //alterar dados do ninja
    @PutMapping("/alterarID")
    public String alterarNinjaId(){
        return "Alterar ninja";
    }

    @DeleteMapping("/deleteID")
    public String deletarNinja(){
        return "deletar ninjas";
    }

    //deletar ninja

}
