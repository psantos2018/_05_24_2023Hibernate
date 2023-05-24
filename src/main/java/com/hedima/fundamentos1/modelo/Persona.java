package com.hedima.fundamentos1;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.time.LocalDate;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@Table(name = "personas")
public class Persona implements Serializable {
    @EmbeddedId
    private PersonaPK pk;
    @Column(nullable = false,length = 20)
    private String nombre;
    @Column(nullable = false,length = 50)
    private String apllellido;
    @Column(nullable = false,length = 1)
    private String sexo;
    @Column(nullable = false,length = 10)
    private String edad;
    private LocalDate fechaNacimiento;
    private String curriculum;

}
