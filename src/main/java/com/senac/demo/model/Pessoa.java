package com.senac.demo.model;

import javax.persistence.Column;
import javax.persistence.MappedSuperclass;
import java.util.EmptyStackException;

@MappedSuperclass
public class Pessoa extends Entityid {

    @Column(name = "nome" , nullable = false)
    private String nome;

    @Column(name = "telefone", nullable = false)
    private String telefone;

    @Column(name = "endereço", nullable = false)
    private String endereço;

    @Column(name = "email", nullable = false)
    private String email;





    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEndereço() {
        return endereço;
    }

    public void setEndereço(String endereço) {
        this.endereço = endereço;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }





    @Override
    public String toString() {
        return "Pessoa{" +
                "nome=' " + nome + '\'' +
                ", telefone=' " + telefone + '\'' +
                ", endereço=' " + endereço + '\'' +
                ", email=' " + email + '\'' +
                '}';
    }
}
