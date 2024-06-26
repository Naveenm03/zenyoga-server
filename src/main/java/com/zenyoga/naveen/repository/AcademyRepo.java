package com.zenyoga.naveen.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.zenyoga.naveen.model.Academyentity;

@Repository
public interface AcademyRepo extends JpaRepository<Academyentity, Long> {
   

    Academyentity findByName(String name);
    Optional<Academyentity> findById(Long id);
    void deleteByName(String name);
    
    
}
