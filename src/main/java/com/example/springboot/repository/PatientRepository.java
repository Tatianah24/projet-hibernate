package com.example.springboot.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.springboot.model.Patient;

public interface PatientRepository extends JpaRepository <Patient, Long> {

	Optional<Patient> findByNomPat(String nomPat);

}
