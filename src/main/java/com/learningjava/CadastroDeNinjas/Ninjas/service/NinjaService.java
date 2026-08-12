package com.learningjava.CadastroDeNinjas.Ninjas.service;

import com.learningjava.CadastroDeNinjas.Ninjas.NinjaModel;
import com.learningjava.CadastroDeNinjas.Ninjas.repository.NinjaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class NinjaService {

    private NinjaRepository ninjaRepository;

    public NinjaService(NinjaRepository ninjaRepository) {
        this.ninjaRepository = ninjaRepository;
    }

    public List<NinjaModel> listarNinjas(){
        return ninjaRepository.findAll();
    }
}
