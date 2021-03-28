package com.is.issystem.repository.entity_repository;

import com.is.issystem.entities.IllustrationSubInterest;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface IllustrationSubInterestRepository extends JpaRepository<IllustrationSubInterest,Integer>
{
    @Query(value = "SELECT * FROM is_agency_db.illustration_sub_interest where illustration_sub_interest.id_illustration = ?1",nativeQuery = true)
    public List<IllustrationSubInterest> getAllIllustrationSubByIllustID(Integer id_illust);
}
