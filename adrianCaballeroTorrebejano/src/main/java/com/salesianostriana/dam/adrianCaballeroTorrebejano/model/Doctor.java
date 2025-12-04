package com.salesianostriana.dam.adrianCaballeroTorrebejano.model;

import jakarta.persistence.*;
import lombok.*;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Entity
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Doctor {

    @Id
    @GeneratedValue
    private Long id;

    private String name;
    private String surname;

    private String specialty;
    private String email;

    @ManyToMany(mappedBy = "doctors")
    @Builder.Default
    @ToString.Exclude
    private Set<Patient> pacients = new HashSet<>();

    //un doctor puede tratar a varios pacientes y un paciente puede ser tratado por varios doctores



}
