package com.zenyoga.naveen.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.zenyoga.naveen.model.Contactentity;

@Repository
public interface ContactRepo extends JpaRepository<Contactentity, Long> {

}
