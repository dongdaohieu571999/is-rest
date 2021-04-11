package com.is.issystem.repository.entity_repository;

import com.is.issystem.entities.IllustrationMainInterest;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface IllustrationMainInterestRepository extends JpaRepository<IllustrationMainInterest,Integer>
{
    @Query(value = "SELECT * FROM is_agency_db.illustration_main_intserest where illustration_main_intserest.id_illustration = ?1",nativeQuery = true)
    public IllustrationMainInterest getIllustrationMainInterestByillustID(Integer id_illust);
}
