package com.learningjava.CadastroDeNinjas.Ninjas.controller;

import com.learningjava.CadastroDeNinjas.Ninjas.NinjaModel;
import com.learningjava.CadastroDeNinjas.Ninjas.service.NinjaService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("ninjas")
public class NinjaController {

    private NinjaService ninjaService;

    public NinjaController(NinjaService ninjaService) {
        this.ninjaService = ninjaService;
    }

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
    @GetMapping("/listar")
    public List<NinjaModel> listarNinjas(){
        return ninjaService.listarNinjas();
    }

    //mostrat todos ninjas (READ)
    @GetMapping("/listarID")
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
