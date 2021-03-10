package com.is.issystem.repository;

import com.is.issystem.dto.MailDTO;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface MailDTORepository extends JpaRepository<MailDTO, Integer> {

    public static final String query = "select mail.id, \n" +
            "mail.title, \n" +
            "mail.content, \n" +
            "mail.time,\n" +
            "mail.priority,\n" +
            "mail.status,\n" +
            "(select name from is_agency_db.employee_info where is_agency_db.employee_info.id = mail.receiver_id) as receiver_name,\n" +
            "(select name from is_agency_db.employee_info where is_agency_db.employee_info.id = mail.sender_id) as sender_name\n" +
            "from is_agency_db.mail as mail\n" +
            "where mail.id = ?1\n" +
            "\n";

    @Query(value = query, nativeQuery = true)
    public MailDTO getDetailMail(Integer mailId);
}
