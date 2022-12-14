package br.univille.novostalentos.entity;

import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import lombok.Data;

@Data
@Entity
public class Produto {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(length = 100, unique = true)  
    private String nome;
    @Column(length = 1000)
    private String descricao;
    @Column(length = 1000)
    private String urlImagem;
    private BigDecimal valor;
    @ManyToOne
    private Cidade cidadeOrigem;
}
