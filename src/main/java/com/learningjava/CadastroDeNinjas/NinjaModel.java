package com.learningjava.CadastroDeNinjas;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

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

    public NinjaModel(String nome,  String email, int idade) {
        this.nome = nome;
        this.email = email;
        this.idade = idade;
    }
}
