package br.univille.novostalentos.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Data;
@Data
@Entity
public class Cidade {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id; //Unique - torna o campo parte de uma chave única (traduzindo nao permite que haja dois registros com valores iguais nesta coluna)
    @Column(length = 1000, unique = true)
    private String nome;

    public String toString(){
        return getNome();
    }
}
