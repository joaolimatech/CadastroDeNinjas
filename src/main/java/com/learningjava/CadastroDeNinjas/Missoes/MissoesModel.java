package com.learningjava.CadastroDeNinjas.Missoes;

import com.learningjava.CadastroDeNinjas.Ninjas.NinjaModel;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Entity
@Table(name = "tb_missoes")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
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
