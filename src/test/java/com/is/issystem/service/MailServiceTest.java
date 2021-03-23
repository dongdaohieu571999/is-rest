package com.is.issystem.service;

import com.is.issystem.dto.MailDTO;
import com.is.issystem.repository.MailDTORepository;
import org.junit.Assert;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.*;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
class MailServiceTest {

    @Mock
    private MailDTORepository mockMailDTORepository;

    @InjectMocks
    private MailService mailServiceUnderTest;

    @Test
    void testGetAllMail() {
        // Setup

        // Run the test
        final List<MailDTO> result = mailServiceUnderTest.getAllMail("userCode");

        // Verify the results
        Assert.assertNotNull(result);
    }

    @Test
    void testGetAllMail_MailDTORepositoryReturnsNoItems() {
        // Setup
        when(mockMailDTORepository.getAllMail("userCode")).thenReturn(Collections.emptyList());

        // Run the test
        final List<MailDTO> result = mailServiceUnderTest.getAllMail("userCode");

        // Verify the results
        Assert.assertNull(result);
    }

    @Test
    void testGetDetailMail() {
        // Setup

        // Configure MailDTORepository.getDetailMail(...).
        final MailDTO mailDTO = new MailDTO();
        mailDTO.setTitle("5");
        mailDTO.setContent("5");
        mailDTO.setTime(new GregorianCalendar(2021, Calendar.MARCH, 11).getTime());
        mailDTO.setStatus("1");
        mailDTO.setPriority("1");
        mailDTO.setSenderName("manh");
        when(mockMailDTORepository.getDetailMail("manh", 34)).thenReturn(mailDTO);

        // Run the test
        final MailDTO result = mailServiceUnderTest.getDetailMail("manh", 34);

        // Verify the results
        Assert.assertEquals(mailDTO, result);
    }

    @Test
    void testGetDetailMail01() {
        // Setup

        // Configure MailDTORepository.getDetailMail(...).
        final MailDTO mailDTO = new MailDTO();
        mailDTO.setTitle("6");
        mailDTO.setContent("6");
        mailDTO.setTime(new GregorianCalendar(2021, Calendar.MARCH, 11).getTime());
        mailDTO.setStatus("1");
        mailDTO.setPriority("1");
        mailDTO.setSenderName("manh");
        when(mockMailDTORepository.getDetailMail("manh", 37)).thenReturn(mailDTO);

        // Run the test
        final MailDTO result = mailServiceUnderTest.getDetailMail("manh", 37);

        // Verify the results
        Assert.assertEquals(mailDTO, result);
    }

    @Test
    void testAddNewMail() {
        // Setup
        when(mockMailDTORepository.addNewMail("title", "senderNameCode", "receiverNameCode", "content", 0, 0)).thenReturn(0);

        // Run the test
        final Integer result = mailServiceUnderTest.addNewMail("title", "senderNameCode", "receiverNameCode", "content", 0, 0);

        // Verify the results
        assertEquals(0, result);
    }
}
