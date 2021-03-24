package com.backend.simple.test.domain;

import javax.persistence.*;
import java.io.Serializable;
import java.time.Instant;
import java.util.Objects;

@Entity
@Table(name = "paciente")
public class Paciente implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    private Instant dataNascimento;
    private String sexo;
    private String nomeMae;
    private String endereco;
    private String telefone;
    private String email;
    private String cpf;
    private String rg;

    public Paciente(Long id, String nome, Instant dataNascimento, String sexo, String nomeMae, String endereco, String telefone, String email, String cpf, String rg) {
        this.id = id;
        this.nome = nome;
        this.dataNascimento = dataNascimento;
        this.sexo = sexo;
        this.nomeMae = nomeMae;
        this.endereco = endereco;
        this.telefone = telefone;
        this.email = email;
        this.cpf = cpf;
        this.rg = rg;
    }

    public Paciente() {
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

    public Instant getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(Instant dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getNomeMae() {
        return nomeMae;
    }

    public void setNomeMae(String nomeMae) {
        this.nomeMae = nomeMae;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Paciente)) return false;
        Paciente paciente = (Paciente) o;
        return getId().equals(paciente.getId());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId());
    }

    @Override
    public String toString() {
        return "Paciente{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", dataNascimento=" + dataNascimento +
                ", sexo='" + sexo + '\'' +
                ", nomeMae='" + nomeMae + '\'' +
                ", endereco='" + endereco + '\'' +
                ", telefone='" + telefone + '\'' +
                ", email='" + email + '\'' +
                ", cpf='" + cpf + '\'' +
                ", rg='" + rg + '\'' +
                '}';
    }
}
