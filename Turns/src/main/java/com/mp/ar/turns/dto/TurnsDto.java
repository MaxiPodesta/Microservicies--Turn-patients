package com.mp.ar.turns.dto;

import java.time.LocalDate;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;



@Getter @Setter
@AllArgsConstructor
@NoArgsConstructor
public class TurnsDto {
    
    private LocalDate date;
    private String treatment;
    private String nationalIdPatient;
    
}
