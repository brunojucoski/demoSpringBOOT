package com.senac.demo.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.MappedSuperclass;
@Entity
public class Fornecedor extends  Pessoa{

    @Column(name = "cnpj", nullable = true)
    private String cnpj ;

    @Column(name = "razao_social" , nullable = true)
    private String razaoSocial;





    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public String getRazaoSocial() {
        return razaoSocial;
    }

    public void setRazaoSocial(String razaoSocial) {
        this.razaoSocial = razaoSocial;
    }



    @Override
    public String toString() {
        return "Fornecedor{" +
                "cnpj='" + cnpj + '\'' +
                ", razaoSocial='" + razaoSocial + '\'' +
                '}';
    }
}
