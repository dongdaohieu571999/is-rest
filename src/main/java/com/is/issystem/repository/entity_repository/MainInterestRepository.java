package com.is.issystem.repository.entity_repository;

import com.is.issystem.entities.MainInterest;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MainInterestRepository extends JpaRepository<MainInterest,Integer> {

}
