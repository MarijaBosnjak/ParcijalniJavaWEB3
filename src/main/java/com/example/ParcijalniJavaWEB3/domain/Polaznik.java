package com.example.ParcijalniJavaWEB3.domain;

import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Polaznik {



        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Long id;

        @Size(min = 2, max = 50)
        @NotBlank(message = "Ime ne smije biti prazno")
        private String ime;
        private String prezime;
        @NotNull
        @NotBlank(message = "Ime ne smije biti prazno")
        @Email(message = "Email nije ispravnog formata")
        private String email;

        @OneToOne(mappedBy = "polaznik")
        private Upis upis;

}
