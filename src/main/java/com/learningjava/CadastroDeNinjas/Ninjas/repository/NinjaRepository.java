package com.learningjava.CadastroDeNinjas.Ninjas.repository;

import com.learningjava.CadastroDeNinjas.Missoes.MissoesModel;
import com.learningjava.CadastroDeNinjas.Ninjas.NinjaModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface NinjaRepository extends JpaRepository<NinjaModel, Long> { //JPA é uma abstração para as queries do JPA

}
