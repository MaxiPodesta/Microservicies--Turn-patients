package com.mp.ar.turns.repository;

import com.mp.ar.turns.model.Turn;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository 
public interface ITurnsRepository extends JpaRepository<Turn,Long> {
    
}
