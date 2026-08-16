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
    public NinjaModel criarNinja(@RequestBody  NinjaModel model){
        return ninjaService.criarNinja(model);
    }

    // procurar ninja
    @GetMapping("/listar")
    public List<NinjaModel> listarNinjas(){
        return ninjaService.listarNinjas();
    }

    //mostrat todos ninjas (READ)
    @GetMapping("/listar/{id}") //{id} pathVariable
    public NinjaModel listarNinjaPorId(@PathVariable Long id){
        return ninjaService.listarNinjasId(id);
    }

    //alterar dados do ninja
    @PutMapping("/alterar/{id}")
    public NinjaModel alterarNinjaId(@PathVariable Long id, @RequestBody NinjaModel model){
        return ninjaService.atualizarNinja(id, model);
    }

    @DeleteMapping("/delete/{id}")
    public void deletarNinja(@PathVariable Long id) {
        ninjaService.deletarNinja(id);

    }

    //deletar ninja

}
