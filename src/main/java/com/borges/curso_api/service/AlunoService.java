package com.borges.curso_api.service;

import com.borges.curso_api.entity.Aluno;
import com.borges.curso_api.repository.AlunoRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Optional;

public class AlunoService {

    @Autowired
    private AlunoRepository alunoRepository;

    public Aluno salvar(Aluno aluno) {
        if (aluno.getNome() == null || aluno.getNome().isEmpty()) {
            throw new IllegalArgumentException("Nome do aluno é obrigatório.");
        }
        Optional<Aluno> alunoExistente = alunoRepository.findByCpf(aluno.getCpf());
        if (alunoExistente.isPresent()) {
            throw new IllegalArgumentException("CPF já cadastrado no sistema");

        }
        return alunoRepository.save(aluno);
    }

    public Aluno buscarPorId(Long id) {
        if (id == null) {
            throw new IllegalArgumentException("ID do aluno é obrigatório.");
        }
        return alunoRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Aluno não encontrado com ID: " + id));

    }

}
