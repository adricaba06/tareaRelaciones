package com.salesianostriana.dam.adrianCaballeroTorrebejano.repository;

import com.salesianostriana.dam.adrianCaballeroTorrebejano.model.Patient;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PatientRepository extends JpaRepository<Long, Patient> {

}
