package com.codewitharjun.fullstackbackend.repository;

import com.codewitharjun.fullstackbackend.model.Participation;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ParticipationRepository extends JpaRepository<Participation,Long>{
}
