package com.is.issystem.service;

import com.is.issystem.dto.CustomerDTO;
import com.is.issystem.entities.*;
import com.is.issystem.repository.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.*;

import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

class CustomerInfoServiceTest {

    private CustomerInfoService customerInfoServiceUnderTest;

    @BeforeEach
    void setUp() {
        customerInfoServiceUnderTest = new CustomerInfoService();
        customerInfoServiceUnderTest.customerDTORepository = mock(CustomerDTORepository.class);
        customerInfoServiceUnderTest.customerInfoRepository = mock(CustomerInfoRepository.class);
        customerInfoServiceUnderTest.permanentAddressRepository = mock(PermanentAddressRepository.class);
        customerInfoServiceUnderTest.contactAddressRepository = mock(ContactAddressRepository.class);
        customerInfoServiceUnderTest.currentAddressRepository = mock(CurrentAddressRepository.class);
        customerInfoServiceUnderTest.workplaceRepository = mock(WorkplaceRepository.class);
        customerInfoServiceUnderTest.customerAccRepository = mock(CustomerAccRepository.class);
    }

    @Test
    void testUpdateCustomerInfo() {
        // Setup
        final CustomerDTO customerDTO = new CustomerDTO();
        customerDTO.setUpdated_time(new GregorianCalendar(2019, Calendar.JANUARY, 1).getTime());
        customerDTO.setMarital_status(false);
        customerDTO.setCreated_time(new GregorianCalendar(2019, Calendar.JANUARY, 1).getTime());
        customerDTO.setSource("source");
        customerDTO.setId(0);
        customerDTO.setBirth_date(new GregorianCalendar(2019, Calendar.JANUARY, 1).getTime());
        customerDTO.setAge(0);
        customerDTO.setBirth_address("birth_address");
        customerDTO.setTypes_identification("types_identification");
        customerDTO.setID_card("id_card");

        // Configure CustomerInfoRepository.findById(...).
        final CustomerInfo customerInfo1 = new CustomerInfo();
        customerInfo1.setUpdated_time(new GregorianCalendar(2019, Calendar.JANUARY, 1).getTime());
        customerInfo1.setMarital_status(false);
        customerInfo1.setCreated_time(new GregorianCalendar(2019, Calendar.JANUARY, 1).getTime());
        customerInfo1.setSource("source");
        customerInfo1.setGender(false);
        customerInfo1.setCode_em_support("code_em_support");
        customerInfo1.setId(0);
        customerInfo1.setBirth_date(new GregorianCalendar(2019, Calendar.JANUARY, 1).getTime());
        customerInfo1.setAge(0);
        customerInfo1.setBirth_address("birth_address");
        final Optional<CustomerInfo> customerInfo = Optional.of(customerInfo1);
        when(customerInfoServiceUnderTest.customerInfoRepository.findById(0)).thenReturn(customerInfo);

        // Configure ContactAddressRepository.findById(...).
        final ContactAddress contactAddress1 = new ContactAddress();
        contactAddress1.setConadd_id(0);
        contactAddress1.setConadd_no_street("conadd_no_street");
        contactAddress1.setConadd_city("conadd_city");
        contactAddress1.setConadd_district("conadd_district");
        contactAddress1.setConadd_wards("conadd_wards");
        final Optional<ContactAddress> contactAddress = Optional.of(contactAddress1);
        when(customerInfoServiceUnderTest.contactAddressRepository.findById(0)).thenReturn(contactAddress);

        // Configure CurrentAddressRepository.findById(...).
        final CurrentAddress currentAddress1 = new CurrentAddress();
        currentAddress1.setCuradd_id(0);
        currentAddress1.setCuradd_no_street("curadd_no_street");
        currentAddress1.setCuradd_city("curadd_city");
        currentAddress1.setCuradd_district("curadd_district");
        currentAddress1.setCuradd_wards("curadd_wards");
        final Optional<CurrentAddress> currentAddress = Optional.of(currentAddress1);
        when(customerInfoServiceUnderTest.currentAddressRepository.findById(0)).thenReturn(currentAddress);

        // Configure PermanentAddressRepository.findById(...).
        final PermanentAddress permanentAddress1 = new PermanentAddress();
        permanentAddress1.setPeradd_id(0);
        permanentAddress1.setPeradd_no_street("peradd_no_street");
        permanentAddress1.setPeradd_city("peradd_city");
        permanentAddress1.setPeradd_district("peradd_district");
        permanentAddress1.setPeradd_wards("peradd_wards");
        final Optional<PermanentAddress> permanentAddress = Optional.of(permanentAddress1);
        when(customerInfoServiceUnderTest.permanentAddressRepository.findById(0)).thenReturn(permanentAddress);

        // Configure WorkplaceRepository.findById(...).
        final WorkplaceAddress workplaceAddress1 = new WorkplaceAddress();
        workplaceAddress1.setWorkadd_id(0);
        workplaceAddress1.setWorkadd_no_street("workadd_no_street");
        workplaceAddress1.setWorkadd_city("workadd_city");
        workplaceAddress1.setWorkadd_district("workadd_district");
        workplaceAddress1.setWorkadd_wards("workadd_wards");
        final Optional<WorkplaceAddress> workplaceAddress = Optional.of(workplaceAddress1);
        when(customerInfoServiceUnderTest.workplaceRepository.findById(0)).thenReturn(workplaceAddress);

        // Configure CustomerInfoRepository.save(...).
        final CustomerInfo customerInfo2 = new CustomerInfo();
        customerInfo2.setUpdated_time(new GregorianCalendar(2019, Calendar.JANUARY, 1).getTime());
        customerInfo2.setMarital_status(false);
        customerInfo2.setCreated_time(new GregorianCalendar(2019, Calendar.JANUARY, 1).getTime());
        customerInfo2.setSource("source");
        customerInfo2.setGender(false);
        customerInfo2.setCode_em_support("code_em_support");
        customerInfo2.setId(0);
        customerInfo2.setBirth_date(new GregorianCalendar(2019, Calendar.JANUARY, 1).getTime());
        customerInfo2.setAge(0);
        customerInfo2.setBirth_address("birth_address");
        when(customerInfoServiceUnderTest.customerInfoRepository.save(any(CustomerInfo.class))).thenReturn(customerInfo2);

        // Configure ContactAddressRepository.save(...).
        final ContactAddress contactAddress2 = new ContactAddress();
        contactAddress2.setConadd_id(0);
        contactAddress2.setConadd_no_street("conadd_no_street");
        contactAddress2.setConadd_city("conadd_city");
        contactAddress2.setConadd_district("conadd_district");
        contactAddress2.setConadd_wards("conadd_wards");
        when(customerInfoServiceUnderTest.contactAddressRepository.save(any(ContactAddress.class))).thenReturn(contactAddress2);

        // Configure CurrentAddressRepository.save(...).
        final CurrentAddress currentAddress2 = new CurrentAddress();
        currentAddress2.setCuradd_id(0);
        currentAddress2.setCuradd_no_street("curadd_no_street");
        currentAddress2.setCuradd_city("curadd_city");
        currentAddress2.setCuradd_district("curadd_district");
        currentAddress2.setCuradd_wards("curadd_wards");
        when(customerInfoServiceUnderTest.currentAddressRepository.save(any(CurrentAddress.class))).thenReturn(currentAddress2);

        // Configure PermanentAddressRepository.save(...).
        final PermanentAddress permanentAddress2 = new PermanentAddress();
        permanentAddress2.setPeradd_id(0);
        permanentAddress2.setPeradd_no_street("peradd_no_street");
        permanentAddress2.setPeradd_city("peradd_city");
        permanentAddress2.setPeradd_district("peradd_district");
        permanentAddress2.setPeradd_wards("peradd_wards");
        when(customerInfoServiceUnderTest.permanentAddressRepository.save(any(PermanentAddress.class))).thenReturn(permanentAddress2);

        // Configure WorkplaceRepository.save(...).
        final WorkplaceAddress workplaceAddress2 = new WorkplaceAddress();
        workplaceAddress2.setWorkadd_id(0);
        workplaceAddress2.setWorkadd_no_street("workadd_no_street");
        workplaceAddress2.setWorkadd_city("workadd_city");
        workplaceAddress2.setWorkadd_district("workadd_district");
        workplaceAddress2.setWorkadd_wards("workadd_wards");
        when(customerInfoServiceUnderTest.workplaceRepository.save(any(WorkplaceAddress.class))).thenReturn(workplaceAddress2);

        // Run the test
        customerInfoServiceUnderTest.updateCustomerInfo(customerDTO);

        // Verify the results
    }

    @Test
    void testUpdateCustomerInfo_CustomerInfoRepositoryFindByIdReturnsAbsent() {
        // Setup
        final CustomerDTO customerDTO = new CustomerDTO();
        customerDTO.setUpdated_time(new GregorianCalendar(2019, Calendar.JANUARY, 1).getTime());
        customerDTO.setMarital_status(false);
        customerDTO.setCreated_time(new GregorianCalendar(2019, Calendar.JANUARY, 1).getTime());
        customerDTO.setSource("source");
        customerDTO.setId(0);
        customerDTO.setBirth_date(new GregorianCalendar(2019, Calendar.JANUARY, 1).getTime());
        customerDTO.setAge(0);
        customerDTO.setBirth_address("birth_address");
        customerDTO.setTypes_identification("types_identification");
        customerDTO.setID_card("id_card");

        when(customerInfoServiceUnderTest.customerInfoRepository.findById(0)).thenReturn(Optional.empty());

        // Configure ContactAddressRepository.findById(...).
        final ContactAddress contactAddress1 = new ContactAddress();
        contactAddress1.setConadd_id(0);
        contactAddress1.setConadd_no_street("conadd_no_street");
        contactAddress1.setConadd_city("conadd_city");
        contactAddress1.setConadd_district("conadd_district");
        contactAddress1.setConadd_wards("conadd_wards");
        final Optional<ContactAddress> contactAddress = Optional.of(contactAddress1);
        when(customerInfoServiceUnderTest.contactAddressRepository.findById(0)).thenReturn(contactAddress);

        // Configure CurrentAddressRepository.findById(...).
        final CurrentAddress currentAddress1 = new CurrentAddress();
        currentAddress1.setCuradd_id(0);
        currentAddress1.setCuradd_no_street("curadd_no_street");
        currentAddress1.setCuradd_city("curadd_city");
        currentAddress1.setCuradd_district("curadd_district");
        currentAddress1.setCuradd_wards("curadd_wards");
        final Optional<CurrentAddress> currentAddress = Optional.of(currentAddress1);
        when(customerInfoServiceUnderTest.currentAddressRepository.findById(0)).thenReturn(currentAddress);

        // Configure PermanentAddressRepository.findById(...).
        final PermanentAddress permanentAddress1 = new PermanentAddress();
        permanentAddress1.setPeradd_id(0);
        permanentAddress1.setPeradd_no_street("peradd_no_street");
        permanentAddress1.setPeradd_city("peradd_city");
        permanentAddress1.setPeradd_district("peradd_district");
        permanentAddress1.setPeradd_wards("peradd_wards");
        final Optional<PermanentAddress> permanentAddress = Optional.of(permanentAddress1);
        when(customerInfoServiceUnderTest.permanentAddressRepository.findById(0)).thenReturn(permanentAddress);

        // Configure WorkplaceRepository.findById(...).
        final WorkplaceAddress workplaceAddress1 = new WorkplaceAddress();
        workplaceAddress1.setWorkadd_id(0);
        workplaceAddress1.setWorkadd_no_street("workadd_no_street");
        workplaceAddress1.setWorkadd_city("workadd_city");
        workplaceAddress1.setWorkadd_district("workadd_district");
        workplaceAddress1.setWorkadd_wards("workadd_wards");
        final Optional<WorkplaceAddress> workplaceAddress = Optional.of(workplaceAddress1);
        when(customerInfoServiceUnderTest.workplaceRepository.findById(0)).thenReturn(workplaceAddress);

        // Configure CustomerInfoRepository.save(...).
        final CustomerInfo customerInfo = new CustomerInfo();
        customerInfo.setUpdated_time(new GregorianCalendar(2019, Calendar.JANUARY, 1).getTime());
        customerInfo.setMarital_status(false);
        customerInfo.setCreated_time(new GregorianCalendar(2019, Calendar.JANUARY, 1).getTime());
        customerInfo.setSource("source");
        customerInfo.setGender(false);
        customerInfo.setCode_em_support("code_em_support");
        customerInfo.setId(0);
        customerInfo.setBirth_date(new GregorianCalendar(2019, Calendar.JANUARY, 1).getTime());
        customerInfo.setAge(0);
        customerInfo.setBirth_address("birth_address");
        when(customerInfoServiceUnderTest.customerInfoRepository.save(any(CustomerInfo.class))).thenReturn(customerInfo);

        // Configure ContactAddressRepository.save(...).
        final ContactAddress contactAddress2 = new ContactAddress();
        contactAddress2.setConadd_id(0);
        contactAddress2.setConadd_no_street("conadd_no_street");
        contactAddress2.setConadd_city("conadd_city");
        contactAddress2.setConadd_district("conadd_district");
        contactAddress2.setConadd_wards("conadd_wards");
        when(customerInfoServiceUnderTest.contactAddressRepository.save(any(ContactAddress.class))).thenReturn(contactAddress2);

        // Configure CurrentAddressRepository.save(...).
        final CurrentAddress currentAddress2 = new CurrentAddress();
        currentAddress2.setCuradd_id(0);
        currentAddress2.setCuradd_no_street("curadd_no_street");
        currentAddress2.setCuradd_city("curadd_city");
        currentAddress2.setCuradd_district("curadd_district");
        currentAddress2.setCuradd_wards("curadd_wards");
        when(customerInfoServiceUnderTest.currentAddressRepository.save(any(CurrentAddress.class))).thenReturn(currentAddress2);

        // Configure PermanentAddressRepository.save(...).
        final PermanentAddress permanentAddress2 = new PermanentAddress();
        permanentAddress2.setPeradd_id(0);
        permanentAddress2.setPeradd_no_street("peradd_no_street");
        permanentAddress2.setPeradd_city("peradd_city");
        permanentAddress2.setPeradd_district("peradd_district");
        permanentAddress2.setPeradd_wards("peradd_wards");
        when(customerInfoServiceUnderTest.permanentAddressRepository.save(any(PermanentAddress.class))).thenReturn(permanentAddress2);

        // Configure WorkplaceRepository.save(...).
        final WorkplaceAddress workplaceAddress2 = new WorkplaceAddress();
        workplaceAddress2.setWorkadd_id(0);
        workplaceAddress2.setWorkadd_no_street("workadd_no_street");
        workplaceAddress2.setWorkadd_city("workadd_city");
        workplaceAddress2.setWorkadd_district("workadd_district");
        workplaceAddress2.setWorkadd_wards("workadd_wards");
        when(customerInfoServiceUnderTest.workplaceRepository.save(any(WorkplaceAddress.class))).thenReturn(workplaceAddress2);

        // Run the test
        customerInfoServiceUnderTest.updateCustomerInfo(customerDTO);

        // Verify the results
    }

    @Test
    void testUpdateCustomerInfo_ContactAddressRepositoryFindByIdReturnsAbsent() {
        // Setup
        final CustomerDTO customerDTO = new CustomerDTO();
        customerDTO.setUpdated_time(new GregorianCalendar(2019, Calendar.JANUARY, 1).getTime());
        customerDTO.setMarital_status(false);
        customerDTO.setCreated_time(new GregorianCalendar(2019, Calendar.JANUARY, 1).getTime());
        customerDTO.setSource("source");
        customerDTO.setId(0);
        customerDTO.setBirth_date(new GregorianCalendar(2019, Calendar.JANUARY, 1).getTime());
        customerDTO.setAge(0);
        customerDTO.setBirth_address("birth_address");
        customerDTO.setTypes_identification("types_identification");
        customerDTO.setID_card("id_card");

        // Configure CustomerInfoRepository.findById(...).
        final CustomerInfo customerInfo1 = new CustomerInfo();
        customerInfo1.setUpdated_time(new GregorianCalendar(2019, Calendar.JANUARY, 1).getTime());
        customerInfo1.setMarital_status(false);
        customerInfo1.setCreated_time(new GregorianCalendar(2019, Calendar.JANUARY, 1).getTime());
        customerInfo1.setSource("source");
        customerInfo1.setGender(false);
        customerInfo1.setCode_em_support("code_em_support");
        customerInfo1.setId(0);
        customerInfo1.setBirth_date(new GregorianCalendar(2019, Calendar.JANUARY, 1).getTime());
        customerInfo1.setAge(0);
        customerInfo1.setBirth_address("birth_address");
        final Optional<CustomerInfo> customerInfo = Optional.of(customerInfo1);
        when(customerInfoServiceUnderTest.customerInfoRepository.findById(0)).thenReturn(customerInfo);

        when(customerInfoServiceUnderTest.contactAddressRepository.findById(0)).thenReturn(Optional.empty());

        // Configure CurrentAddressRepository.findById(...).
        final CurrentAddress currentAddress1 = new CurrentAddress();
        currentAddress1.setCuradd_id(0);
        currentAddress1.setCuradd_no_street("curadd_no_street");
        currentAddress1.setCuradd_city("curadd_city");
        currentAddress1.setCuradd_district("curadd_district");
        currentAddress1.setCuradd_wards("curadd_wards");
        final Optional<CurrentAddress> currentAddress = Optional.of(currentAddress1);
        when(customerInfoServiceUnderTest.currentAddressRepository.findById(0)).thenReturn(currentAddress);

        // Configure PermanentAddressRepository.findById(...).
        final PermanentAddress permanentAddress1 = new PermanentAddress();
        permanentAddress1.setPeradd_id(0);
        permanentAddress1.setPeradd_no_street("peradd_no_street");
        permanentAddress1.setPeradd_city("peradd_city");
        permanentAddress1.setPeradd_district("peradd_district");
        permanentAddress1.setPeradd_wards("peradd_wards");
        final Optional<PermanentAddress> permanentAddress = Optional.of(permanentAddress1);
        when(customerInfoServiceUnderTest.permanentAddressRepository.findById(0)).thenReturn(permanentAddress);

        // Configure WorkplaceRepository.findById(...).
        final WorkplaceAddress workplaceAddress1 = new WorkplaceAddress();
        workplaceAddress1.setWorkadd_id(0);
        workplaceAddress1.setWorkadd_no_street("workadd_no_street");
        workplaceAddress1.setWorkadd_city("workadd_city");
        workplaceAddress1.setWorkadd_district("workadd_district");
        workplaceAddress1.setWorkadd_wards("workadd_wards");
        final Optional<WorkplaceAddress> workplaceAddress = Optional.of(workplaceAddress1);
        when(customerInfoServiceUnderTest.workplaceRepository.findById(0)).thenReturn(workplaceAddress);

        // Configure CustomerInfoRepository.save(...).
        final CustomerInfo customerInfo2 = new CustomerInfo();
        customerInfo2.setUpdated_time(new GregorianCalendar(2019, Calendar.JANUARY, 1).getTime());
        customerInfo2.setMarital_status(false);
        customerInfo2.setCreated_time(new GregorianCalendar(2019, Calendar.JANUARY, 1).getTime());
        customerInfo2.setSource("source");
        customerInfo2.setGender(false);
        customerInfo2.setCode_em_support("code_em_support");
        customerInfo2.setId(0);
        customerInfo2.setBirth_date(new GregorianCalendar(2019, Calendar.JANUARY, 1).getTime());
        customerInfo2.setAge(0);
        customerInfo2.setBirth_address("birth_address");
        when(customerInfoServiceUnderTest.customerInfoRepository.save(any(CustomerInfo.class))).thenReturn(customerInfo2);

        // Configure ContactAddressRepository.save(...).
        final ContactAddress contactAddress = new ContactAddress();
        contactAddress.setConadd_id(0);
        contactAddress.setConadd_no_street("conadd_no_street");
        contactAddress.setConadd_city("conadd_city");
        contactAddress.setConadd_district("conadd_district");
        contactAddress.setConadd_wards("conadd_wards");
        when(customerInfoServiceUnderTest.contactAddressRepository.save(any(ContactAddress.class))).thenReturn(contactAddress);

        // Configure CurrentAddressRepository.save(...).
        final CurrentAddress currentAddress2 = new CurrentAddress();
        currentAddress2.setCuradd_id(0);
        currentAddress2.setCuradd_no_street("curadd_no_street");
        currentAddress2.setCuradd_city("curadd_city");
        currentAddress2.setCuradd_district("curadd_district");
        currentAddress2.setCuradd_wards("curadd_wards");
        when(customerInfoServiceUnderTest.currentAddressRepository.save(any(CurrentAddress.class))).thenReturn(currentAddress2);

        // Configure PermanentAddressRepository.save(...).
        final PermanentAddress permanentAddress2 = new PermanentAddress();
        permanentAddress2.setPeradd_id(0);
        permanentAddress2.setPeradd_no_street("peradd_no_street");
        permanentAddress2.setPeradd_city("peradd_city");
        permanentAddress2.setPeradd_district("peradd_district");
        permanentAddress2.setPeradd_wards("peradd_wards");
        when(customerInfoServiceUnderTest.permanentAddressRepository.save(any(PermanentAddress.class))).thenReturn(permanentAddress2);

        // Configure WorkplaceRepository.save(...).
        final WorkplaceAddress workplaceAddress2 = new WorkplaceAddress();
        workplaceAddress2.setWorkadd_id(0);
        workplaceAddress2.setWorkadd_no_street("workadd_no_street");
        workplaceAddress2.setWorkadd_city("workadd_city");
        workplaceAddress2.setWorkadd_district("workadd_district");
        workplaceAddress2.setWorkadd_wards("workadd_wards");
        when(customerInfoServiceUnderTest.workplaceRepository.save(any(WorkplaceAddress.class))).thenReturn(workplaceAddress2);

        // Run the test
        customerInfoServiceUnderTest.updateCustomerInfo(customerDTO);

        // Verify the results
    }

    @Test
    void testUpdateCustomerInfo_CurrentAddressRepositoryFindByIdReturnsAbsent() {
        // Setup
        final CustomerDTO customerDTO = new CustomerDTO();
        customerDTO.setUpdated_time(new GregorianCalendar(2019, Calendar.JANUARY, 1).getTime());
        customerDTO.setMarital_status(false);
        customerDTO.setCreated_time(new GregorianCalendar(2019, Calendar.JANUARY, 1).getTime());
        customerDTO.setSource("source");
        customerDTO.setId(0);
        customerDTO.setBirth_date(new GregorianCalendar(2019, Calendar.JANUARY, 1).getTime());
        customerDTO.setAge(0);
        customerDTO.setBirth_address("birth_address");
        customerDTO.setTypes_identification("types_identification");
        customerDTO.setID_card("id_card");

        // Configure CustomerInfoRepository.findById(...).
        final CustomerInfo customerInfo1 = new CustomerInfo();
        customerInfo1.setUpdated_time(new GregorianCalendar(2019, Calendar.JANUARY, 1).getTime());
        customerInfo1.setMarital_status(false);
        customerInfo1.setCreated_time(new GregorianCalendar(2019, Calendar.JANUARY, 1).getTime());
        customerInfo1.setSource("source");
        customerInfo1.setGender(false);
        customerInfo1.setCode_em_support("code_em_support");
        customerInfo1.setId(0);
        customerInfo1.setBirth_date(new GregorianCalendar(2019, Calendar.JANUARY, 1).getTime());
        customerInfo1.setAge(0);
        customerInfo1.setBirth_address("birth_address");
        final Optional<CustomerInfo> customerInfo = Optional.of(customerInfo1);
        when(customerInfoServiceUnderTest.customerInfoRepository.findById(0)).thenReturn(customerInfo);

        // Configure ContactAddressRepository.findById(...).
        final ContactAddress contactAddress1 = new ContactAddress();
        contactAddress1.setConadd_id(0);
        contactAddress1.setConadd_no_street("conadd_no_street");
        contactAddress1.setConadd_city("conadd_city");
        contactAddress1.setConadd_district("conadd_district");
        contactAddress1.setConadd_wards("conadd_wards");
        final Optional<ContactAddress> contactAddress = Optional.of(contactAddress1);
        when(customerInfoServiceUnderTest.contactAddressRepository.findById(0)).thenReturn(contactAddress);

        when(customerInfoServiceUnderTest.currentAddressRepository.findById(0)).thenReturn(Optional.empty());

        // Configure PermanentAddressRepository.findById(...).
        final PermanentAddress permanentAddress1 = new PermanentAddress();
        permanentAddress1.setPeradd_id(0);
        permanentAddress1.setPeradd_no_street("peradd_no_street");
        permanentAddress1.setPeradd_city("peradd_city");
        permanentAddress1.setPeradd_district("peradd_district");
        permanentAddress1.setPeradd_wards("peradd_wards");
        final Optional<PermanentAddress> permanentAddress = Optional.of(permanentAddress1);
        when(customerInfoServiceUnderTest.permanentAddressRepository.findById(0)).thenReturn(permanentAddress);

        // Configure WorkplaceRepository.findById(...).
        final WorkplaceAddress workplaceAddress1 = new WorkplaceAddress();
        workplaceAddress1.setWorkadd_id(0);
        workplaceAddress1.setWorkadd_no_street("workadd_no_street");
        workplaceAddress1.setWorkadd_city("workadd_city");
        workplaceAddress1.setWorkadd_district("workadd_district");
        workplaceAddress1.setWorkadd_wards("workadd_wards");
        final Optional<WorkplaceAddress> workplaceAddress = Optional.of(workplaceAddress1);
        when(customerInfoServiceUnderTest.workplaceRepository.findById(0)).thenReturn(workplaceAddress);

        // Configure CustomerInfoRepository.save(...).
        final CustomerInfo customerInfo2 = new CustomerInfo();
        customerInfo2.setUpdated_time(new GregorianCalendar(2019, Calendar.JANUARY, 1).getTime());
        customerInfo2.setMarital_status(false);
        customerInfo2.setCreated_time(new GregorianCalendar(2019, Calendar.JANUARY, 1).getTime());
        customerInfo2.setSource("source");
        customerInfo2.setGender(false);
        customerInfo2.setCode_em_support("code_em_support");
        customerInfo2.setId(0);
        customerInfo2.setBirth_date(new GregorianCalendar(2019, Calendar.JANUARY, 1).getTime());
        customerInfo2.setAge(0);
        customerInfo2.setBirth_address("birth_address");
        when(customerInfoServiceUnderTest.customerInfoRepository.save(any(CustomerInfo.class))).thenReturn(customerInfo2);

        // Configure ContactAddressRepository.save(...).
        final ContactAddress contactAddress2 = new ContactAddress();
        contactAddress2.setConadd_id(0);
        contactAddress2.setConadd_no_street("conadd_no_street");
        contactAddress2.setConadd_city("conadd_city");
        contactAddress2.setConadd_district("conadd_district");
        contactAddress2.setConadd_wards("conadd_wards");
        when(customerInfoServiceUnderTest.contactAddressRepository.save(any(ContactAddress.class))).thenReturn(contactAddress2);

        // Configure CurrentAddressRepository.save(...).
        final CurrentAddress currentAddress = new CurrentAddress();
        currentAddress.setCuradd_id(0);
        currentAddress.setCuradd_no_street("curadd_no_street");
        currentAddress.setCuradd_city("curadd_city");
        currentAddress.setCuradd_district("curadd_district");
        currentAddress.setCuradd_wards("curadd_wards");
        when(customerInfoServiceUnderTest.currentAddressRepository.save(any(CurrentAddress.class))).thenReturn(currentAddress);

        // Configure PermanentAddressRepository.save(...).
        final PermanentAddress permanentAddress2 = new PermanentAddress();
        permanentAddress2.setPeradd_id(0);
        permanentAddress2.setPeradd_no_street("peradd_no_street");
        permanentAddress2.setPeradd_city("peradd_city");
        permanentAddress2.setPeradd_district("peradd_district");
        permanentAddress2.setPeradd_wards("peradd_wards");
        when(customerInfoServiceUnderTest.permanentAddressRepository.save(any(PermanentAddress.class))).thenReturn(permanentAddress2);

        // Configure WorkplaceRepository.save(...).
        final WorkplaceAddress workplaceAddress2 = new WorkplaceAddress();
        workplaceAddress2.setWorkadd_id(0);
        workplaceAddress2.setWorkadd_no_street("workadd_no_street");
        workplaceAddress2.setWorkadd_city("workadd_city");
        workplaceAddress2.setWorkadd_district("workadd_district");
        workplaceAddress2.setWorkadd_wards("workadd_wards");
        when(customerInfoServiceUnderTest.workplaceRepository.save(any(WorkplaceAddress.class))).thenReturn(workplaceAddress2);

        // Run the test
        customerInfoServiceUnderTest.updateCustomerInfo(customerDTO);

        // Verify the results
    }

    @Test
    void testUpdateCustomerInfo_PermanentAddressRepositoryFindByIdReturnsAbsent() {
        // Setup
        final CustomerDTO customerDTO = new CustomerDTO();
        customerDTO.setUpdated_time(new GregorianCalendar(2019, Calendar.JANUARY, 1).getTime());
        customerDTO.setMarital_status(false);
        customerDTO.setCreated_time(new GregorianCalendar(2019, Calendar.JANUARY, 1).getTime());
        customerDTO.setSource("source");
        customerDTO.setId(0);
        customerDTO.setBirth_date(new GregorianCalendar(2019, Calendar.JANUARY, 1).getTime());
        customerDTO.setAge(0);
        customerDTO.setBirth_address("birth_address");
        customerDTO.setTypes_identification("types_identification");
        customerDTO.setID_card("id_card");

        // Configure CustomerInfoRepository.findById(...).
        final CustomerInfo customerInfo1 = new CustomerInfo();
        customerInfo1.setUpdated_time(new GregorianCalendar(2019, Calendar.JANUARY, 1).getTime());
        customerInfo1.setMarital_status(false);
        customerInfo1.setCreated_time(new GregorianCalendar(2019, Calendar.JANUARY, 1).getTime());
        customerInfo1.setSource("source");
        customerInfo1.setGender(false);
        customerInfo1.setCode_em_support("code_em_support");
        customerInfo1.setId(0);
        customerInfo1.setBirth_date(new GregorianCalendar(2019, Calendar.JANUARY, 1).getTime());
        customerInfo1.setAge(0);
        customerInfo1.setBirth_address("birth_address");
        final Optional<CustomerInfo> customerInfo = Optional.of(customerInfo1);
        when(customerInfoServiceUnderTest.customerInfoRepository.findById(0)).thenReturn(customerInfo);

        // Configure ContactAddressRepository.findById(...).
        final ContactAddress contactAddress1 = new ContactAddress();
        contactAddress1.setConadd_id(0);
        contactAddress1.setConadd_no_street("conadd_no_street");
        contactAddress1.setConadd_city("conadd_city");
        contactAddress1.setConadd_district("conadd_district");
        contactAddress1.setConadd_wards("conadd_wards");
        final Optional<ContactAddress> contactAddress = Optional.of(contactAddress1);
        when(customerInfoServiceUnderTest.contactAddressRepository.findById(0)).thenReturn(contactAddress);

        // Configure CurrentAddressRepository.findById(...).
        final CurrentAddress currentAddress1 = new CurrentAddress();
        currentAddress1.setCuradd_id(0);
        currentAddress1.setCuradd_no_street("curadd_no_street");
        currentAddress1.setCuradd_city("curadd_city");
        currentAddress1.setCuradd_district("curadd_district");
        currentAddress1.setCuradd_wards("curadd_wards");
        final Optional<CurrentAddress> currentAddress = Optional.of(currentAddress1);
        when(customerInfoServiceUnderTest.currentAddressRepository.findById(0)).thenReturn(currentAddress);

        when(customerInfoServiceUnderTest.permanentAddressRepository.findById(0)).thenReturn(Optional.empty());

        // Configure WorkplaceRepository.findById(...).
        final WorkplaceAddress workplaceAddress1 = new WorkplaceAddress();
        workplaceAddress1.setWorkadd_id(0);
        workplaceAddress1.setWorkadd_no_street("workadd_no_street");
        workplaceAddress1.setWorkadd_city("workadd_city");
        workplaceAddress1.setWorkadd_district("workadd_district");
        workplaceAddress1.setWorkadd_wards("workadd_wards");
        final Optional<WorkplaceAddress> workplaceAddress = Optional.of(workplaceAddress1);
        when(customerInfoServiceUnderTest.workplaceRepository.findById(0)).thenReturn(workplaceAddress);

        // Configure CustomerInfoRepository.save(...).
        final CustomerInfo customerInfo2 = new CustomerInfo();
        customerInfo2.setUpdated_time(new GregorianCalendar(2019, Calendar.JANUARY, 1).getTime());
        customerInfo2.setMarital_status(false);
        customerInfo2.setCreated_time(new GregorianCalendar(2019, Calendar.JANUARY, 1).getTime());
        customerInfo2.setSource("source");
        customerInfo2.setGender(false);
        customerInfo2.setCode_em_support("code_em_support");
        customerInfo2.setId(0);
        customerInfo2.setBirth_date(new GregorianCalendar(2019, Calendar.JANUARY, 1).getTime());
        customerInfo2.setAge(0);
        customerInfo2.setBirth_address("birth_address");
        when(customerInfoServiceUnderTest.customerInfoRepository.save(any(CustomerInfo.class))).thenReturn(customerInfo2);

        // Configure ContactAddressRepository.save(...).
        final ContactAddress contactAddress2 = new ContactAddress();
        contactAddress2.setConadd_id(0);
        contactAddress2.setConadd_no_street("conadd_no_street");
        contactAddress2.setConadd_city("conadd_city");
        contactAddress2.setConadd_district("conadd_district");
        contactAddress2.setConadd_wards("conadd_wards");
        when(customerInfoServiceUnderTest.contactAddressRepository.save(any(ContactAddress.class))).thenReturn(contactAddress2);

        // Configure CurrentAddressRepository.save(...).
        final CurrentAddress currentAddress2 = new CurrentAddress();
        currentAddress2.setCuradd_id(0);
        currentAddress2.setCuradd_no_street("curadd_no_street");
        currentAddress2.setCuradd_city("curadd_city");
        currentAddress2.setCuradd_district("curadd_district");
        currentAddress2.setCuradd_wards("curadd_wards");
        when(customerInfoServiceUnderTest.currentAddressRepository.save(any(CurrentAddress.class))).thenReturn(currentAddress2);

        // Configure PermanentAddressRepository.save(...).
        final PermanentAddress permanentAddress = new PermanentAddress();
        permanentAddress.setPeradd_id(0);
        permanentAddress.setPeradd_no_street("peradd_no_street");
        permanentAddress.setPeradd_city("peradd_city");
        permanentAddress.setPeradd_district("peradd_district");
        permanentAddress.setPeradd_wards("peradd_wards");
        when(customerInfoServiceUnderTest.permanentAddressRepository.save(any(PermanentAddress.class))).thenReturn(permanentAddress);

        // Configure WorkplaceRepository.save(...).
        final WorkplaceAddress workplaceAddress2 = new WorkplaceAddress();
        workplaceAddress2.setWorkadd_id(0);
        workplaceAddress2.setWorkadd_no_street("workadd_no_street");
        workplaceAddress2.setWorkadd_city("workadd_city");
        workplaceAddress2.setWorkadd_district("workadd_district");
        workplaceAddress2.setWorkadd_wards("workadd_wards");
        when(customerInfoServiceUnderTest.workplaceRepository.save(any(WorkplaceAddress.class))).thenReturn(workplaceAddress2);

        // Run the test
        customerInfoServiceUnderTest.updateCustomerInfo(customerDTO);

        // Verify the results
    }

    @Test
    void testUpdateCustomerInfo_WorkplaceRepositoryFindByIdReturnsAbsent() {
        // Setup
        final CustomerDTO customerDTO = new CustomerDTO();
        customerDTO.setUpdated_time(new GregorianCalendar(2019, Calendar.JANUARY, 1).getTime());
        customerDTO.setMarital_status(false);
        customerDTO.setCreated_time(new GregorianCalendar(2019, Calendar.JANUARY, 1).getTime());
        customerDTO.setSource("source");
        customerDTO.setId(0);
        customerDTO.setBirth_date(new GregorianCalendar(2019, Calendar.JANUARY, 1).getTime());
        customerDTO.setAge(0);
        customerDTO.setBirth_address("birth_address");
        customerDTO.setTypes_identification("types_identification");
        customerDTO.setID_card("id_card");

        // Configure CustomerInfoRepository.findById(...).
        final CustomerInfo customerInfo1 = new CustomerInfo();
        customerInfo1.setUpdated_time(new GregorianCalendar(2019, Calendar.JANUARY, 1).getTime());
        customerInfo1.setMarital_status(false);
        customerInfo1.setCreated_time(new GregorianCalendar(2019, Calendar.JANUARY, 1).getTime());
        customerInfo1.setSource("source");
        customerInfo1.setGender(false);
        customerInfo1.setCode_em_support("code_em_support");
        customerInfo1.setId(0);
        customerInfo1.setBirth_date(new GregorianCalendar(2019, Calendar.JANUARY, 1).getTime());
        customerInfo1.setAge(0);
        customerInfo1.setBirth_address("birth_address");
        final Optional<CustomerInfo> customerInfo = Optional.of(customerInfo1);
        when(customerInfoServiceUnderTest.customerInfoRepository.findById(0)).thenReturn(customerInfo);

        // Configure ContactAddressRepository.findById(...).
        final ContactAddress contactAddress1 = new ContactAddress();
        contactAddress1.setConadd_id(0);
        contactAddress1.setConadd_no_street("conadd_no_street");
        contactAddress1.setConadd_city("conadd_city");
        contactAddress1.setConadd_district("conadd_district");
        contactAddress1.setConadd_wards("conadd_wards");
        final Optional<ContactAddress> contactAddress = Optional.of(contactAddress1);
        when(customerInfoServiceUnderTest.contactAddressRepository.findById(0)).thenReturn(contactAddress);

        // Configure CurrentAddressRepository.findById(...).
        final CurrentAddress currentAddress1 = new CurrentAddress();
        currentAddress1.setCuradd_id(0);
        currentAddress1.setCuradd_no_street("curadd_no_street");
        currentAddress1.setCuradd_city("curadd_city");
        currentAddress1.setCuradd_district("curadd_district");
        currentAddress1.setCuradd_wards("curadd_wards");
        final Optional<CurrentAddress> currentAddress = Optional.of(currentAddress1);
        when(customerInfoServiceUnderTest.currentAddressRepository.findById(0)).thenReturn(currentAddress);

        // Configure PermanentAddressRepository.findById(...).
        final PermanentAddress permanentAddress1 = new PermanentAddress();
        permanentAddress1.setPeradd_id(0);
        permanentAddress1.setPeradd_no_street("peradd_no_street");
        permanentAddress1.setPeradd_city("peradd_city");
        permanentAddress1.setPeradd_district("peradd_district");
        permanentAddress1.setPeradd_wards("peradd_wards");
        final Optional<PermanentAddress> permanentAddress = Optional.of(permanentAddress1);
        when(customerInfoServiceUnderTest.permanentAddressRepository.findById(0)).thenReturn(permanentAddress);

        when(customerInfoServiceUnderTest.workplaceRepository.findById(0)).thenReturn(Optional.empty());

        // Configure CustomerInfoRepository.save(...).
        final CustomerInfo customerInfo2 = new CustomerInfo();
        customerInfo2.setUpdated_time(new GregorianCalendar(2019, Calendar.JANUARY, 1).getTime());
        customerInfo2.setMarital_status(false);
        customerInfo2.setCreated_time(new GregorianCalendar(2019, Calendar.JANUARY, 1).getTime());
        customerInfo2.setSource("source");
        customerInfo2.setGender(false);
        customerInfo2.setCode_em_support("code_em_support");
        customerInfo2.setId(0);
        customerInfo2.setBirth_date(new GregorianCalendar(2019, Calendar.JANUARY, 1).getTime());
        customerInfo2.setAge(0);
        customerInfo2.setBirth_address("birth_address");
        when(customerInfoServiceUnderTest.customerInfoRepository.save(any(CustomerInfo.class))).thenReturn(customerInfo2);

        // Configure ContactAddressRepository.save(...).
        final ContactAddress contactAddress2 = new ContactAddress();
        contactAddress2.setConadd_id(0);
        contactAddress2.setConadd_no_street("conadd_no_street");
        contactAddress2.setConadd_city("conadd_city");
        contactAddress2.setConadd_district("conadd_district");
        contactAddress2.setConadd_wards("conadd_wards");
        when(customerInfoServiceUnderTest.contactAddressRepository.save(any(ContactAddress.class))).thenReturn(contactAddress2);

        // Configure CurrentAddressRepository.save(...).
        final CurrentAddress currentAddress2 = new CurrentAddress();
        currentAddress2.setCuradd_id(0);
        currentAddress2.setCuradd_no_street("curadd_no_street");
        currentAddress2.setCuradd_city("curadd_city");
        currentAddress2.setCuradd_district("curadd_district");
        currentAddress2.setCuradd_wards("curadd_wards");
        when(customerInfoServiceUnderTest.currentAddressRepository.save(any(CurrentAddress.class))).thenReturn(currentAddress2);

        // Configure PermanentAddressRepository.save(...).
        final PermanentAddress permanentAddress2 = new PermanentAddress();
        permanentAddress2.setPeradd_id(0);
        permanentAddress2.setPeradd_no_street("peradd_no_street");
        permanentAddress2.setPeradd_city("peradd_city");
        permanentAddress2.setPeradd_district("peradd_district");
        permanentAddress2.setPeradd_wards("peradd_wards");
        when(customerInfoServiceUnderTest.permanentAddressRepository.save(any(PermanentAddress.class))).thenReturn(permanentAddress2);

        // Configure WorkplaceRepository.save(...).
        final WorkplaceAddress workplaceAddress = new WorkplaceAddress();
        workplaceAddress.setWorkadd_id(0);
        workplaceAddress.setWorkadd_no_street("workadd_no_street");
        workplaceAddress.setWorkadd_city("workadd_city");
        workplaceAddress.setWorkadd_district("workadd_district");
        workplaceAddress.setWorkadd_wards("workadd_wards");
        when(customerInfoServiceUnderTest.workplaceRepository.save(any(WorkplaceAddress.class))).thenReturn(workplaceAddress);

        // Run the test
        customerInfoServiceUnderTest.updateCustomerInfo(customerDTO);

        // Verify the results
    }

    @Test
    void testAddCustomerInfo() {
        // Setup
        final CustomerDTO customerDTO = new CustomerDTO();
        customerDTO.setUpdated_time(new GregorianCalendar(2019, Calendar.JANUARY, 1).getTime());
        customerDTO.setMarital_status(false);
        customerDTO.setCreated_time(new GregorianCalendar(2019, Calendar.JANUARY, 1).getTime());
        customerDTO.setSource("source");
        customerDTO.setId(0);
        customerDTO.setBirth_date(new GregorianCalendar(2019, Calendar.JANUARY, 1).getTime());
        customerDTO.setAge(0);
        customerDTO.setBirth_address("birth_address");
        customerDTO.setTypes_identification("types_identification");
        customerDTO.setID_card("id_card");

        // Configure CustomerAccRepository.save(...).
        final CustomerAcc customerAcc = new CustomerAcc();
        customerAcc.setId(0);
        customerAcc.setCode("code");
        customerAcc.setPass("pass");
        customerAcc.setStatus(false);
        when(customerInfoServiceUnderTest.customerAccRepository.save(any(CustomerAcc.class))).thenReturn(customerAcc);

        // Configure ContactAddressRepository.save(...).
        final ContactAddress contactAddress = new ContactAddress();
        contactAddress.setConadd_id(0);
        contactAddress.setConadd_no_street("conadd_no_street");
        contactAddress.setConadd_city("conadd_city");
        contactAddress.setConadd_district("conadd_district");
        contactAddress.setConadd_wards("conadd_wards");
        when(customerInfoServiceUnderTest.contactAddressRepository.save(any(ContactAddress.class))).thenReturn(contactAddress);

        // Configure CurrentAddressRepository.save(...).
        final CurrentAddress currentAddress = new CurrentAddress();
        currentAddress.setCuradd_id(0);
        currentAddress.setCuradd_no_street("curadd_no_street");
        currentAddress.setCuradd_city("curadd_city");
        currentAddress.setCuradd_district("curadd_district");
        currentAddress.setCuradd_wards("curadd_wards");
        when(customerInfoServiceUnderTest.currentAddressRepository.save(any(CurrentAddress.class))).thenReturn(currentAddress);

        // Configure PermanentAddressRepository.save(...).
        final PermanentAddress permanentAddress = new PermanentAddress();
        permanentAddress.setPeradd_id(0);
        permanentAddress.setPeradd_no_street("peradd_no_street");
        permanentAddress.setPeradd_city("peradd_city");
        permanentAddress.setPeradd_district("peradd_district");
        permanentAddress.setPeradd_wards("peradd_wards");
        when(customerInfoServiceUnderTest.permanentAddressRepository.save(any(PermanentAddress.class))).thenReturn(permanentAddress);

        // Configure WorkplaceRepository.save(...).
        final WorkplaceAddress workplaceAddress = new WorkplaceAddress();
        workplaceAddress.setWorkadd_id(0);
        workplaceAddress.setWorkadd_no_street("workadd_no_street");
        workplaceAddress.setWorkadd_city("workadd_city");
        workplaceAddress.setWorkadd_district("workadd_district");
        workplaceAddress.setWorkadd_wards("workadd_wards");
        when(customerInfoServiceUnderTest.workplaceRepository.save(any(WorkplaceAddress.class))).thenReturn(workplaceAddress);

        // Configure CustomerInfoRepository.save(...).
        final CustomerInfo customerInfo = new CustomerInfo();
        customerInfo.setUpdated_time(new GregorianCalendar(2019, Calendar.JANUARY, 1).getTime());
        customerInfo.setMarital_status(false);
        customerInfo.setCreated_time(new GregorianCalendar(2019, Calendar.JANUARY, 1).getTime());
        customerInfo.setSource("source");
        customerInfo.setGender(false);
        customerInfo.setCode_em_support("code_em_support");
        customerInfo.setId(0);
        customerInfo.setBirth_date(new GregorianCalendar(2019, Calendar.JANUARY, 1).getTime());
        customerInfo.setAge(0);
        customerInfo.setBirth_address("birth_address");
        when(customerInfoServiceUnderTest.customerInfoRepository.save(any(CustomerInfo.class))).thenReturn(customerInfo);

        // Run the test
        customerInfoServiceUnderTest.addCustomerInfo(customerDTO);

        // Verify the results
    }

    @Test
    void testGetOneInfo() {
        // Setup

        // Configure CustomerDTORepository.getCustomerInfobyID(...).
        final CustomerDTO customerDTO = new CustomerDTO();
        customerDTO.setUpdated_time(new GregorianCalendar(2019, Calendar.JANUARY, 1).getTime());
        customerDTO.setMarital_status(false);
        customerDTO.setCreated_time(new GregorianCalendar(2019, Calendar.JANUARY, 1).getTime());
        customerDTO.setSource("source");
        customerDTO.setId(0);
        customerDTO.setBirth_date(new GregorianCalendar(2019, Calendar.JANUARY, 1).getTime());
        customerDTO.setAge(0);
        customerDTO.setBirth_address("birth_address");
        customerDTO.setTypes_identification("types_identification");
        customerDTO.setID_card("id_card");
        when(customerInfoServiceUnderTest.customerDTORepository.getCustomerInfobyID(0, "code")).thenReturn(customerDTO);

        // Run the test
        final CustomerDTO result = customerInfoServiceUnderTest.getOneInfo(0, "code");

        // Verify the results
    }

    @Test
    void testFindAll() {
        // Setup

        // Configure CustomerDTORepository.getAllCustomerInfo(...).
        final CustomerDTO customerDTO = new CustomerDTO();
        customerDTO.setUpdated_time(new GregorianCalendar(2019, Calendar.JANUARY, 1).getTime());
        customerDTO.setMarital_status(false);
        customerDTO.setCreated_time(new GregorianCalendar(2019, Calendar.JANUARY, 1).getTime());
        customerDTO.setSource("source");
        customerDTO.setId(0);
        customerDTO.setBirth_date(new GregorianCalendar(2019, Calendar.JANUARY, 1).getTime());
        customerDTO.setAge(0);
        customerDTO.setBirth_address("birth_address");
        customerDTO.setTypes_identification("types_identification");
        customerDTO.setID_card("id_card");
        final List<CustomerDTO> customerDTOS = Arrays.asList(customerDTO);
        when(customerInfoServiceUnderTest.customerDTORepository.getAllCustomerInfo()).thenReturn(customerDTOS);

        // Run the test
        final List<CustomerDTO> result = customerInfoServiceUnderTest.findAll();

        // Verify the results
    }

    @Test
    void testFindAll_CustomerDTORepositoryReturnsNoItems() {
        // Setup
        when(customerInfoServiceUnderTest.customerDTORepository.getAllCustomerInfo()).thenReturn(Collections.emptyList());

        // Run the test
        final List<CustomerDTO> result = customerInfoServiceUnderTest.findAll();

        // Verify the results
    }
}
