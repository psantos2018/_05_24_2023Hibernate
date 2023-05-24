package com.hedima.fundamentos1.modelo.unoauno;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@Table(name="centros_educativos")
public class CentroEducativos {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idCentro;
    @Column(length = 30, nullable = false)
    private String nombre;
    @Column(length = 80, nullable = false)
    private String direccion;
    private int plazas;

}
