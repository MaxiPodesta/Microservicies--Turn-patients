package com.mp.ar.turns.service;

import com.mp.ar.turns.model.Patient;
import com.mp.ar.turns.model.Turn;
import com.mp.ar.turns.repository.ITurnsRepository;
import java.time.LocalDate;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.client.RestTemplate;


@Service
public class TurnsServiceImpl implements ITurnsService{

    @Autowired
    private ITurnsRepository turnRepo;
    @Autowired
    private RestTemplate apiConsume;
    
    
    @Override
    public List<Turn> getTurns() {
        return turnRepo.findAll() ;
    }

    @Override
    //Here the information of the other service is consume
    public void saveTurn(LocalDate date, String treatment, String patientNationalId) {
    Patient pat = apiConsume.getForObject("http:localhost9001/patients/bringNationalId/"+patientNationalId,
            Patient.class );
   
    String nombreCompletoPaciente= pat.getName()+" "+pat.getSurname();
    
    Turn turn =new Turn();
    turn.setDate(date);
    turn.setTreatment(treatment);
    turn.setNameCompletePatient(nombreCompletoPaciente);
    turnRepo.save(turn);
    }

    @Override
    public void deleteTurn(@PathVariable Long id) {
        turnRepo.deleteById(id);

    }

    @Override
    public Turn findTurn (@PathVariable Long id) {
       return turnRepo.findById(id).orElse(null);
    }

    @Override
    public void editTurn(Long id, Turn turnEdit) {
        Turn turn =this.findTurn(id);
        
        turn.setDate(turnEdit.getDate());
        turn.setTreatment(turnEdit.getTreatment());
        turn.setNameCompletePatient(turnEdit.getNameCompletePatient());
        
        turnRepo.save(turn);
    }
    
}
