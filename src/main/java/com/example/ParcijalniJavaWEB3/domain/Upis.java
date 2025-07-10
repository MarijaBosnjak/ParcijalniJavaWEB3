package com.example.ParcijalniJavaWEB3.domain;


import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Upis {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToOne
    @JoinColumn(name = "polaznik_id")
    private Polaznik polaznik;

    @ManyToOne
    @JoinColumn(name = "program_id")
    private ProgramObrazovanja program;
    @NotBlank(message = "Datum upisa je obavezan")
    private String datumUpisa;
}
