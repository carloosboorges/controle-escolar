package com.borges.curso_api.entity;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.math.BigDecimal;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor

@Entity
@Table(name = "tb_professores")
public class Professor extends Pessoa{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "matricula", length = 12)
    private String matricula;

    @Column(name = "disciplina")
    private String disciplina;

    @Column(name = "salario")
    private BigDecimal salario;

    @OneToMany(mappedBy = "professor")
    private List<Curso> curso;

}
