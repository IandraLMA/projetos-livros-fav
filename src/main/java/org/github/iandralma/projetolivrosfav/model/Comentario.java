package org.github.iandralma.projetolivrosfav.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "tb_comentario",schema = "livros-fav")
public class Comentario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column
    private String comentario;

    @ManyToOne(fetch = FetchType.LAZY,optional = false)
    @JoinColumn(name = "fk_livro")
    private Livro livro;
}
