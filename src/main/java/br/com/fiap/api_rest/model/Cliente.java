package br.com.fiap.api_rest.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;
import br.com.fiap.api_rest.Enums.Categoria;

@Entity
@Data
public class Cliente {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nome;
    private int idade;
    private String email;
    private String password;
    private String cpf;
    private Categoria categoria;

    public Cliente(Object o, String nome, int idade) {
    }
}
