package com.mp.ar.turns.controller;

import com.mp.ar.turns.dto.TurnsDto;
import com.mp.ar.turns.model.Turn;
import com.mp.ar.turns.service.ITurnsService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;



@RestController

public class TurnosController {
    
    @Autowired
    private ITurnsService turnServ;
    
    //1-Create new turn
    @PostMapping("/turns/create")
    public String createTurn(@RequestBody TurnsDto turn){
    turnServ.saveTurn(turn.getDate(), turn.getTreatment(), turn.getNationalIdPatient());
    return "Turn has been created succesfully";
    }
    
    
    
    
    //2-bring all turns
    @GetMapping("/turns/bring")
    public List<Turn> traerTurn(){
    return turnServ.getTurns();
    }
    
    //3 -Delete turns 
    @DeleteMapping("/turns/delete/{id}")
    public String deleteTurno(@PathVariable Long id){
        turnServ.deleteTurn(id);
    return "Turn deleted succesfully";
    }
    //Editar turnos 
    @PutMapping ("/turns/edit/{id_original}")
    public Turn editTurn(@PathVariable Long id_original,
                              @RequestBody Turn turnEdit){
     turnServ.editTurn(id_original,turnEdit);
     Turn turnEdited=turnServ.findTurn(id_original);
     return turnEdited;
     
    }
    
    //5- Search turns by id
    @GetMapping("/turns/bring/{id}")
    public Turn bringTurn(@PathVariable Long id){
    return turnServ.findTurn(id);
    }


}
