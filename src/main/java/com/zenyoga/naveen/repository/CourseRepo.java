package com.zenyoga.naveen.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.zenyoga.naveen.model.Courseentity;

@Repository
public interface CourseRepo extends JpaRepository<Courseentity, Long> {
    Courseentity findByName(String name);
    void deleteByName(String name);
    List<Courseentity> findByAcademyId(Long academyId);

    // Other methods...
}