package com.cess.clinica.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cess.clinica.model.Internacion;

@Repository
public interface InternacionRepository extends JpaRepository<Internacion, Integer>{

}
