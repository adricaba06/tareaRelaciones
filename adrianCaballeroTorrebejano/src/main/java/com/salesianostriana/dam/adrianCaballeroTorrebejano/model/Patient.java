package com.salesianostriana.dam.adrianCaballeroTorrebejano.model;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;

@Entity
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Patient {

    @Id
    @GeneratedValue
    private Long id;

    private String name;
    private String surname;
    private LocalDate birthdate;
    private String email;

    @ManyToMany(fetch = FetchType.EAGER)
    @JoinTable(name = "patient_doctor",
    joinColumns = @JoinColumn(name = "patient_id"),
            inverseJoinColumns = @JoinColumn(name = "doctor_id")


    )
    @Builder.Default
    private Set<Doctor> doctors = new HashSet<>();

    //metodos helper

    public void addDoctor(Doctor doctor){
        doctors.add(doctor);
        doctor.getPacients().add(this);
    }

    public void removeDoctor(Doctor doctor){
        doctors.remove(doctor);
        doctor.getPacients().remove(this);
    }


}

// preguntar mejor @@SequenceGenerator

// PostgreSQL, Oracle usan secuencias para generar ids, pero por ejempll MySql no?