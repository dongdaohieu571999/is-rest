package com.is.issystem.repository;

import com.is.issystem.entities.AddressInfo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface AddressRepository extends JpaRepository {
    @Query(value = "SELECT * FROM is_agency_db.contact_address;",nativeQuery = true)
    AddressInfo listContactAddress();

    @Query(value = "SELECT * FROM is_agency_db.current_address;",nativeQuery = true)
    AddressInfo listCurrentAddress();

    @Query(value = "SELECT * FROM is_agency_db.permanent_address;",nativeQuery = true)
    AddressInfo listPermanentAddress();

    @Query(value = "SELECT * FROM is_agency_db.workplace_address;",nativeQuery = true)
    AddressInfo listWorkplaceAddress();

}
