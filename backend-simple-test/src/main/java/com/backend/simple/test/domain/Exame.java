package com.backend.simple.test.domain;

import javax.persistence.*;
import java.io.Serializable;
import java.time.Instant;
import java.util.Objects;

@Entity
@Table(name = "exame")
public class Exame implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String descricao;
    private Instant dataValidade;

    public Exame() {
    }

    public Exame(Long id, String descricao, Instant dataValidade) {
        this.id = id;
        this.descricao = descricao;
        this.dataValidade = dataValidade;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Instant getDataValidade() {
        return dataValidade;
    }

    public void setDataValidade(Instant dataValidade) {
        this.dataValidade = dataValidade;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Exame)) return false;
        Exame exame = (Exame) o;
        return getId().equals(exame.getId());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId());
    }

    @Override
    public String toString() {
        return "Exame{" +
                "id=" + id +
                ", descricao='" + descricao + '\'' +
                ", dataValidade=" + dataValidade +
                '}';
    }
}
