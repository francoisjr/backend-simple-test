package com.backend.simple.test.domain;

import javax.persistence.*;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

@Entity
@Table(name = "pedido_medico")
public class PedidoMedico implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToOne
    @JoinColumn(name = "medico_id")
    private Medico medico;

    @OneToOne
    @JoinColumn(name = "paciente_id")
    private Paciente paciente;

    @OneToMany(cascade=CascadeType.PERSIST)
    @JoinColumn(name = "pedido_medico_id")
    private List<Exame> exames = new ArrayList<>();

    public PedidoMedico() {
    }

    public PedidoMedico(Long id,Medico medico, Paciente paciente, List<Exame> exames) {
        this.id = id;
        this.medico = medico;
        this.paciente = paciente;
        this.exames = exames;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Medico getMedico() {
        return medico;
    }

    public void setMedico(Medico medico) {
        this.medico = medico;
    }

    public Paciente getPaciente() {
        return paciente;
    }

    public void setPaciente(Paciente paciente) {
        this.paciente = paciente;
    }

    public List<Exame> getExames() {
        return exames;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof PedidoMedico)) return false;
        PedidoMedico that = (PedidoMedico) o;
        return getId().equals(that.getId());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId());
    }

    @Override
    public String toString() {
        return "PedidoMedico{" +
                "id=" + id +
                ", medico=" + medico +
                ", paciente=" + paciente +
                ", exames=" + exames +
                '}';
    }
}
