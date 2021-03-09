package com.is.issystem.repository;

import com.is.issystem.entities.Mail;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface MailRepository extends JpaRepository<Mail, Integer> {

    public static final String query = "SELECT * FROM is_agency_db.mail";

    @Query(value = query, nativeQuery = true)
    List<Mail> getAllMail();
}
