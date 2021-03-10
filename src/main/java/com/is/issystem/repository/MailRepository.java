package com.is.issystem.repository;

import com.is.issystem.entities.Mail;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface MailRepository extends JpaRepository<Mail, Integer> {

    public static final String getAllMailQuery = "select mail.id, \n" +
            "mail.title, \n" +
            "mail.content, \n" +
            "mail.time,\n" +
            "mail.priority,\n" +
            "mail.status,\n" +
            "(select name from is_agency_db.employee_info where is_agency_db.employee_info.id = mail.receiver_id) as receiver_name,\n" +
            "(select name from is_agency_db.employee_info where is_agency_db.employee_info.id = mail.sender_id) as sender_name\n" +
            "from is_agency_db.mail as mail\n" +
            "where mail.receiver_id = (select em_if.id from is_agency_db.employee_acc as em_acc, is_agency_db.employee_info as em_if\n" +
            "where em_acc.id = em_if.id \n" +
            "and \n" +
            "em_acc.code = ?1)";

    @Query(value = getAllMailQuery, nativeQuery = true)
    public List<Mail> getAllMail(String userCode);

}
