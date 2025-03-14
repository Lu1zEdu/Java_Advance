package br.com.fiap.api_rest.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.util.Date;

@Entity
public class Cliente {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    private int idade;
    private Date DatNas;
    private String email;
    private String senha;
    private String cpf;
    private Categoria categoria;
    private boolean VIP;

    public Cliente() {
    }

    public Cliente(Long id, String nome, int idade, Date datNas, String email, String senha, String cpf, Categoria categoria, boolean VIP) {
        this.id = id;
        this.nome = nome;
        this.idade = idade;
        DatNas = datNas;
        this.email = email;
        this.senha = senha;
        this.cpf = cpf;
        this.categoria = categoria;
        this.VIP = VIP;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }


    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public Categoria getCategoria() {
        return categoria;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }

    public Date getDatNas() {
        return DatNas;
    }

    public void setDatNas(Date datNas) {
        DatNas = datNas;
    }

    public boolean isVIP() {
        return VIP;
    }

    public void setVIP(boolean VIP) {
        this.VIP = VIP;
    }
}