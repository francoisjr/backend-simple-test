package com.backend.simple.test.domain;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Objects;

@Entity
@Table(name = "medico")
public class Medico implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    private Integer numeroConselho;
    private String estadoConselho;
    private String tipoConselho;

    public Medico(Long id, String nome, Integer numeroConselho, String estadoConselho, String tipoConselho) {
        this.id = id;
        this.nome = nome;
        this.numeroConselho = numeroConselho;
        this.estadoConselho = estadoConselho;
        this.tipoConselho = tipoConselho;
    }

    public Medico() {
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

    public Integer getNumeroConselho() {
        return numeroConselho;
    }

    public void setNumeroConselho(Integer numeroConselho) {
        this.numeroConselho = numeroConselho;
    }

    public String getEstadoConselho() {
        return estadoConselho;
    }

    public void setEstadoConselho(String estadoConselho) {
        this.estadoConselho = estadoConselho;
    }

    public String getTipoConselho() {
        return tipoConselho;
    }

    public void setTipoConselho(String tipoConselho) {
        this.tipoConselho = tipoConselho;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Medico)) return false;
        Medico medico = (Medico) o;
        return getId().equals(medico.getId());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId());
    }

    @Override
    public String toString() {
        return "Medico{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", numeroConselho=" + numeroConselho +
                ", estadoConselho='" + estadoConselho + '\'' +
                ", tipoConselho='" + tipoConselho + '\'' +
                '}';
    }
}
