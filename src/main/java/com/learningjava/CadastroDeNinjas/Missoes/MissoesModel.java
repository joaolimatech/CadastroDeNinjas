package com.learningjava.CadastroDeNinjas.Missoes;

import com.learningjava.CadastroDeNinjas.Ninjas.NinjaModel;
import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "tb_missoes")
public class MissoesModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    private String dificuldade;
    private String status;

    @OneToMany (mappedBy = "missoes") //1 missao pode ter muitos ninjas
    private List<NinjaModel > ninjaModel;


    //todo data missao tambem seria interessante


}
