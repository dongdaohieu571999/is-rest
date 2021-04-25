package com.is.issystem.service;

import com.google.cloud.storage.Storage;
import com.is.issystem.entities.Attachment;
import com.is.issystem.entities.CustomerAttachment;
import com.is.issystem.repository.entity_repository.AttachmentRepository;
import com.is.issystem.repository.entity_repository.CustomerAttachmentRepository;
import org.junit.Assert;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.*;

import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

class AttachmentServiceTest {

    private AttachmentService attachmentServiceUnderTest;

    @BeforeEach
    void setUp() {
        attachmentServiceUnderTest = new AttachmentService();
        attachmentServiceUnderTest.customerAttachmentRepository = mock(CustomerAttachmentRepository.class);
        attachmentServiceUnderTest.attachmentRepository = mock(AttachmentRepository.class);
    }

    @Test
    void testSaveOneCustomerAttachment() {
        // Setup
        final CustomerAttachment customerAttachment = new CustomerAttachment();
        customerAttachment.setId(0);
        customerAttachment.setName_document("name_document");
        customerAttachment.setUrl("url");
        customerAttachment.setId_customer(0);
        customerAttachment.setId_contract(0);

        // Configure CustomerAttachmentRepository.save(...).
        final CustomerAttachment attachment = new CustomerAttachment();
        attachment.setId(0);
        attachment.setName_document("name_document");
        attachment.setUrl("url");
        attachment.setId_customer(0);
        attachment.setId_contract(0);
        when(attachmentServiceUnderTest.customerAttachmentRepository.save(any(CustomerAttachment.class))).thenReturn(attachment);

        // Run the test
        final CustomerAttachment result = attachmentServiceUnderTest.saveOneCustomerAttachment(customerAttachment);

        // Verify the results
    }

    @Test
    void testGetCustomerAttachment() {
        // Setup

        // Configure CustomerAttachmentRepository.getCustomerAttachemnt(...).
        final CustomerAttachment attachment = new CustomerAttachment();
        attachment.setId(0);
        attachment.setName_document("name_document");
        attachment.setUrl("url");
        attachment.setId_customer(0);
        attachment.setId_contract(0);
        final List<CustomerAttachment> customerAttachments = Arrays.asList(attachment);

        when(attachmentServiceUnderTest.customerAttachmentRepository.getCustomerAttachemnt(0)).thenReturn(customerAttachments);

        // Run the test
        final List<CustomerAttachment> result = attachmentServiceUnderTest.getCustomerAttachment(0);

        // Verify the results
    }

    @Test
    void testGetCustomerAttachment_CustomerAttachmentRepositoryReturnsNoItems() {
        // Setup
        when(attachmentServiceUnderTest.customerAttachmentRepository.getCustomerAttachemnt(0)).thenReturn(Collections.emptyList());

        // Run the test
        final List<CustomerAttachment> result = attachmentServiceUnderTest.getCustomerAttachment(0);

        // Verify the results
    }

    @Test
    void testSaveCustomerAttachment() {
        // Setup
        final CustomerAttachment attachment = new CustomerAttachment();
        attachment.setId(0);
        attachment.setName_document("name_document");
        attachment.setUrl("url");
        attachment.setId_customer(0);
        attachment.setId_contract(0);
        final List<CustomerAttachment> customerAttachment = Arrays.asList(attachment);

        // Configure CustomerAttachmentRepository.saveAll(...).
        final CustomerAttachment attachment1 = new CustomerAttachment();
        attachment1.setId(0);
        attachment1.setName_document("name_document");
        attachment1.setUrl("url");
        attachment1.setId_customer(0);
        attachment1.setId_contract(0);
        final List<CustomerAttachment> customerAttachments = Arrays.asList(attachment1);
        when(attachmentServiceUnderTest.customerAttachmentRepository.saveAll(Arrays.asList(new CustomerAttachment()))).thenReturn(customerAttachments);

        // Run the test
        final List<CustomerAttachment> result = attachmentServiceUnderTest.saveCustomerAttachment(customerAttachment);

        // Verify the results
    }

    @Test
    void testSaveCustomerAttachment_CustomerAttachmentRepositoryReturnsNoItems() {
        // Setup
        final CustomerAttachment attachment = new CustomerAttachment();
        attachment.setId(0);
        attachment.setName_document("name_document");
        attachment.setUrl("url");
        attachment.setId_customer(0);
        attachment.setId_contract(0);
        final List<CustomerAttachment> customerAttachment = Arrays.asList(attachment);
        when(attachmentServiceUnderTest.customerAttachmentRepository.saveAll(Arrays.asList(new CustomerAttachment()))).thenReturn(Collections.emptyList());

        // Run the test
        final List<CustomerAttachment> result = attachmentServiceUnderTest.saveCustomerAttachment(customerAttachment);

        // Verify the results
    }

    @Test
    void testUploadCustomerAttachmentToGCP() throws Exception {
        // Setup
        final MultipartFile[] fileData = new MultipartFile[]{};
        final Storage storage = null;

        // Configure CustomerAttachmentRepository.save(...).
        final CustomerAttachment attachment = new CustomerAttachment();
        attachment.setId(0);
        attachment.setName_document("name_document");
        attachment.setUrl("url");
        attachment.setId_customer(0);
        attachment.setId_contract(0);
        when(attachmentServiceUnderTest.customerAttachmentRepository.save(any(CustomerAttachment.class))).thenReturn(attachment);

        // Run the test
        final List<String[]> result = attachmentServiceUnderTest.uploadCustomerAttachmentToGCP(fileData, storage);

        // Verify the results
    }

    @Test
    void testUploadCustomerAttachmentToGCP_ThrowsIOException() {
        // Setup
        final MultipartFile[] fileData = new MultipartFile[]{};
        final Storage storage = null;

        // Configure CustomerAttachmentRepository.save(...).
        final CustomerAttachment attachment = new CustomerAttachment();
        attachment.setId(0);
        attachment.setName_document("name_document");
        attachment.setUrl("url");
        attachment.setId_customer(0);
        attachment.setId_contract(0);
        when(attachmentServiceUnderTest.customerAttachmentRepository.save(any(CustomerAttachment.class))).thenReturn(attachment);

        // Run the test
        assertThrows(IOException.class, () -> attachmentServiceUnderTest.uploadCustomerAttachmentToGCP(fileData, storage));
    }

    @Test
    void testUpdateAttachment() {
        // Setup
        final CustomerAttachment attachment = new CustomerAttachment();
        attachment.setId(0);
        attachment.setName_document("name_document");
        attachment.setUrl("url");
        attachment.setId_customer(0);
        attachment.setId_contract(0);
        final List<CustomerAttachment> customerAttachments = Arrays.asList(attachment);

        // Configure CustomerAttachmentRepository.findById(...).
        final CustomerAttachment attachment1 = new CustomerAttachment();
        attachment1.setId(0);
        attachment1.setName_document("name_document");
        attachment1.setUrl("url");
        attachment1.setId_customer(0);
        attachment1.setId_contract(0);
        final Optional<CustomerAttachment> customerAttachment = Optional.of(attachment1);
        when(attachmentServiceUnderTest.customerAttachmentRepository.findById(0)).thenReturn(customerAttachment);

        // Configure CustomerAttachmentRepository.save(...).
        final CustomerAttachment attachment2 = new CustomerAttachment();
        attachment2.setId(0);
        attachment2.setName_document("name_document");
        attachment2.setUrl("url");
        attachment2.setId_customer(0);
        attachment2.setId_contract(0);
        when(attachmentServiceUnderTest.customerAttachmentRepository.save(any(CustomerAttachment.class))).thenReturn(attachment2);

        // Run the test
        final List<CustomerAttachment> result = attachmentServiceUnderTest.updateAttachment(customerAttachments);

        // Verify the results
    }

    @Test
    void testUpdateAttachment_CustomerAttachmentRepositoryFindByIdReturnsAbsent() {
        // Setup
        final CustomerAttachment attachment = new CustomerAttachment();
        attachment.setId(0);
        attachment.setName_document("name_document");
        attachment.setUrl("url");
        attachment.setId_customer(0);
        attachment.setId_contract(0);
        final List<CustomerAttachment> customerAttachments = Arrays.asList(attachment);
        when(attachmentServiceUnderTest.customerAttachmentRepository.findById(0)).thenReturn(Optional.empty());

        // Configure CustomerAttachmentRepository.save(...).
        final CustomerAttachment attachment1 = new CustomerAttachment();
        attachment1.setId(0);
        attachment1.setName_document("name_document");
        attachment1.setUrl("url");
        attachment1.setId_customer(0);
        attachment1.setId_contract(0);
        when(attachmentServiceUnderTest.customerAttachmentRepository.save(any(CustomerAttachment.class))).thenReturn(attachment1);

        // Run the test
        final List<CustomerAttachment> result = attachmentServiceUnderTest.updateAttachment(customerAttachments);

        // Verify the results
    }

    @Test
    void testUpdateAttachmentAll() {
        // Setup
        final Attachment attachment = new Attachment();
        attachment.setId(2);
        attachment.setUrl("https://www.googleapis.com/download/storage/v1/b/is-solution.appspot.com/o/62_03.16-BM%C3%84%EF%BF%BDHHDCVFPTU-Mau-chuyen-nganh-hoc.doc?generation=1618840040849978&alt=media");
        attachment.setId_attachment("62");
        attachment.setName("03.16-BMĐHHDCVFPTU-Mau-chuyen-nganh-hoc.doc");
        final List<Attachment> attachments = new ArrayList<>();
        attachments.add(attachment);

        // Run the test
        final List<Attachment> result = attachmentServiceUnderTest.updateAttachmentAll(attachments);
        System.out.println(result.toString());

        // Verify the results
        Assert.assertEquals(result.size(), attachments.size());
    }
}
