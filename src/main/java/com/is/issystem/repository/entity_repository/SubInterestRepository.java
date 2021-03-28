package com.is.issystem.repository.entity_repository;

import com.is.issystem.entities.SubInterest;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SubInterestRepository extends JpaRepository<SubInterest,Integer> {
}
