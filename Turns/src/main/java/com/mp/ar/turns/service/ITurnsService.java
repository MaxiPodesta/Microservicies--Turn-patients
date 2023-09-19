package com.mp.ar.turns.service;

import com.mp.ar.turns.model.Turn;
import java.time.LocalDate;
import java.util.List;

public interface ITurnsService {
    
    public List<Turn> getTurns();
    
    public void saveTurn(LocalDate date, String treatment,String patientNationalId);
    
    public void deleteTurn (Long id);
    
    public Turn findTurn(Long id);
    
    public void editTurn(Long id, Turn turnEdit);
    
    
    
}
