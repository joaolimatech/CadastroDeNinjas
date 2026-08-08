package com.learningjava.CadastroDeNinjas.Missoes.repository;

import com.learningjava.CadastroDeNinjas.Missoes.MissoesModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MissoesRepository  extends JpaRepository<MissoesModel, Long> {
}
