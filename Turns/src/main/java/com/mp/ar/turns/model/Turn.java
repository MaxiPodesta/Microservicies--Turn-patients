package com.mp.ar.turns.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import java.time.LocalDate;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
@Getter @Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Turn {
    @Id
    @GeneratedValue(strategy =GenerationType.IDENTITY)
    private Long id_turn;
    @Temporal(TemporalType.DATE)
    
    private LocalDate date;
    private String treatment;
    private String nameCompletePatient;

  
    
    
}
