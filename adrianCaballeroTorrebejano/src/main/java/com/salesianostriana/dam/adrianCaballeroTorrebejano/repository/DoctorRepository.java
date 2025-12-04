package com.salesianostriana.dam.adrianCaballeroTorrebejano.repository;

import com.salesianostriana.dam.adrianCaballeroTorrebejano.model.Doctor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DoctorRepository extends JpaRepository<Long, Doctor> {
}
