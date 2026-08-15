package com.learningjava.CadastroDeNinjas.Missoes.service;

import com.learningjava.CadastroDeNinjas.Missoes.MissoesModel;
import com.learningjava.CadastroDeNinjas.Missoes.repository.MissoesRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@Slf4j
public class MissoesService {
    @Autowired
    MissoesRepository missoesRepository;


    public MissoesModel listarMissao(Long id){
        Optional<MissoesModel> mis =  missoesRepository.findById(id);
        return mis.orElse(null);
    }

    public List<MissoesModel> listarTodasMissoes(){
        return missoesRepository.findAll();
    }

    public MissoesModel criarMissao(MissoesModel model){
        return missoesRepository.save(model);
    }
}
