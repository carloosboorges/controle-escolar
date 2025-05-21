package com.borges.curso_api.entity;
import com.borges.curso_api.interfaces.Cadastro;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor

@Entity
@Table(name = "tb_aluno")
public class Aluno extends Pessoa implements Cadastro {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "matricula", length = 100)
    private String matricula;

    @ManyToOne
    @JoinColumn(name = "curso_id")
    private Curso curso;


    @Override
    public String exibirDados() {
        return "Nome: " + this.nome + " - Matrícula: " + this.matricula
                + "CPF: " + this.cpf + "Email: " + this.email;
    }
}
