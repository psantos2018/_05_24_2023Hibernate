package com.hedima.fundamentos1;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Embeddable
public class PersonaPK implements Serializable {
    @Column(name = "telefono")
    private Long telefono;
    @Column(name = "nif")
    private String nif;
}
