package org.github.iandralma.projetolivrosfav.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
@Entity
@Getter
@Setter
@Table(name = "tb_classificacao",schema = "livros-fav")
public class Classificacao {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column
    private String classificacao;

    @Column
    private Integer ordem;
}
