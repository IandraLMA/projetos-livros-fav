package org.github.iandralma.projetolivrosfav.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
@Entity
@Getter
@Setter
@Table(name = "tb_livros",schema = "livros-fav")
public class Livro {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String titulo;

    @Column(nullable = false)
    private String autor;

    @Column(nullable = false)
    private String genero;

    @Column(name="num_pag",length = 5)
    private Integer numPag;

    @Column(name="ano_publicacao")
    private Integer anoPubli;

    @Column
    private String descricao;

    @ManyToOne(fetch = FetchType.LAZY,optional = false)
    @JoinColumn(name = "fk_classificacao",nullable = false)
    private Classificacao classificacao;

}
