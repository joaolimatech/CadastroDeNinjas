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

    @Column(name = "nome")
    private String nome;

    @Column(unique = true, name = "email")
    private String email;

    @Column(name =  "idade")
    private int idade;

    @ManyToOne //Pode ter varios ninjas em 1 missao. 1 ninja tem apenas 1 misao
    @JoinColumn(name="missoes_id") //FK. Como 1 ninja pode estar atrelado a 1 missao, tera somente 1 campo que ira apontar para a 1 missao q ele esta atribuido
    private MissoesModel missoes;

    @Column(name="img_url")
    private String imgUrl;

    /*
    *
    INSERT INTO TB_CADASTRO (email, idade, img_url, nome, missoes_id, rank)
    VALUES ('kakashi@konoha.com', 31, 'https://img.com/kakashi.jpg', 'Kakashi Hatake', 1, 'Jounin');
    * */

}
