package com.hedima.fundamentos1;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@Table(name = "empleados")

public class Empleada {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idEmpleado;
    @Column(nullable = false,length = 60)
    private String nombre;

    private int edad;
    @Column(nullable = false,length = 40)
    private String puesto;

}
