package com.utez.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.utez.api.entity.Persona;

@org.springframework.stereotype.Repository
public interface Repository extends JpaRepository<Persona, Long>{

}
