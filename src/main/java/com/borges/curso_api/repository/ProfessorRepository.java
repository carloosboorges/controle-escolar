package com.borges.curso_api.repository;
import com.borges.curso_api.entity.Professor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface  ProfessorRepository extends JpaRepository<Professor, Long> {
}
