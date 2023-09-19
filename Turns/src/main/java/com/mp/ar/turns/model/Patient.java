package com.mp.ar.turns.model;

import java.time.LocalDate;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter @Setter
@AllArgsConstructor
@NoArgsConstructor
public class Patient {
    
    private Long idPatient;
    private String nationalId;
    private String name;
    private String surname;
    private LocalDate bornDate;
    private String phone;
}
