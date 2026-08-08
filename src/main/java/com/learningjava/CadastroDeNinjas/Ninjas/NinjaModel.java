package com.learningjava.CadastroDeNinjas.Ninjas;

import com.learningjava.CadastroDeNinjas.Missoes.MissoesModel;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.ui.Model;

import java.util.List;

@NoArgsConstructor
@Getter
@Setter
@Entity //Transforma a classe em uma entidade no Banco de dados
@Table(name = "tb_cadastro")
public class NinjaModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) //define que será sequencial, 1,2,3....
    private long id;
    private String nome;
    private String email;
    private int idade;

    @ManyToOne //Pode ter varios ninjas em 1 missao. 1 ninja tem apenas 1 misao
    @JoinColumn(name="missoes_id") //FK. Como 1 ninja pode estar atrelado a 1 missao, tera somente 1 campo que ira apontar para a 1 missao q ele esta atribuido
    private MissoesModel missoes;

    public NinjaModel(String nome,  String email, int idade) {
        this.nome = nome;
        this.email = email;
        this.idade = idade;
    }
}
