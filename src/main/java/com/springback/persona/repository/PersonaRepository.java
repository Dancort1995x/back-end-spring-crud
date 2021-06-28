package com.springback.persona.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springback.persona.model.Persona;

public interface PersonaRepository extends JpaRepository<Persona, Long>{

}
