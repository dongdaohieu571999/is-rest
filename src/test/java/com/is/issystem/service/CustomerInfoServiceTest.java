package com.is.issystem.service;

import com.is.issystem.dto.CustomerDTO;
import com.is.issystem.entities.*;
import com.is.issystem.repository.entity_dto_repository.CustomerDTORepository;
import com.is.issystem.repository.entity_repository.*;
import org.junit.Assert;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.text.ParseException;
import java.util.*;

import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;
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
        customerInfoServiceUnderTest.contractRepository = mock(ContractRepository.class);
        customerInfoServiceUnderTest.permanentAddressRepository = mock(PermanentAddressRepository.class);
        customerInfoServiceUnderTest.contactAddressRepository = mock(ContactAddressRepository.class);
        customerInfoServiceUnderTest.currentAddressRepository = mock(CurrentAddressRepository.class);
        customerInfoServiceUnderTest.workplaceRepository = mock(WorkplaceRepository.class);
        customerInfoServiceUnderTest.customerAccRepository = mock(CustomerAccRepository.class);
    }

    @Test
    void testUpdateCustomerInfo() {
        // Setup
        final CustomerDTO customerDTO = new CustomerDTO(0L, new GregorianCalendar(2020, Calendar.JANUARY, 1).getTime(), 0L, "birth_address", "types_identification", "id_card", "nationality_1", "nationality_2", "nation", "job", "career", "position", "occupation_group", "company_name", "main_business", "specific_work", 0.0f, "email", "phone_1", "phone_2", 0L, "full_name", "code", 0L, "conadd_no_street", "conadd_city", "conadd_district", "conadd_wards", "curadd_no_street", "curadd_city", "curadd_district", "curadd_wards", "peradd_no_street", "peradd_city", "peradd_district", "peradd_wards", "workadd_no_street", "workadd_city", "workadd_district", "workadd_wards", 0L, 0L, "code_em_support", 0L, 0L, 0L, 0L, 0L, new GregorianCalendar(2020, Calendar.JANUARY, 1).getTime(), 0L, new GregorianCalendar(2020, Calendar.JANUARY, 1).getTime(), "source");

        // Configure CustomerInfoRepository.findById(...).
        final CustomerInfo customerInfo1 = new CustomerInfo();
        customerInfo1.setId(0);
        customerInfo1.setBirth_date(new GregorianCalendar(2020, Calendar.JANUARY, 1).getTime());
        customerInfo1.setAge(0L);
        customerInfo1.setBirth_address("birth_address");
        customerInfo1.setTypes_identification("types_identification");
        customerInfo1.setId_card("id_card");
        customerInfo1.setNationality_1("nationality_1");
        customerInfo1.setNationality_2("nationality_2");
        customerInfo1.setNation("nation");
        customerInfo1.setJob("job");
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
        customerInfo2.setId(0);
        customerInfo2.setBirth_date(new GregorianCalendar(2020, Calendar.JANUARY, 1).getTime());
        customerInfo2.setAge(0L);
        customerInfo2.setBirth_address("birth_address");
        customerInfo2.setTypes_identification("types_identification");
        customerInfo2.setId_card("id_card");
        customerInfo2.setNationality_1("nationality_1");
        customerInfo2.setNationality_2("nationality_2");
        customerInfo2.setNation("nation");
        customerInfo2.setJob("job");
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
        final CustomerDTO customerDTO = new CustomerDTO(0L, new GregorianCalendar(2020, Calendar.JANUARY, 1).getTime(), 0L, "birth_address", "types_identification", "id_card", "nationality_1", "nationality_2", "nation", "job", "career", "position", "occupation_group", "company_name", "main_business", "specific_work", 0.0f, "email", "phone_1", "phone_2", 0L, "full_name", "code", 0L, "conadd_no_street", "conadd_city", "conadd_district", "conadd_wards", "curadd_no_street", "curadd_city", "curadd_district", "curadd_wards", "peradd_no_street", "peradd_city", "peradd_district", "peradd_wards", "workadd_no_street", "workadd_city", "workadd_district", "workadd_wards", 0L, 0L, "code_em_support", 0L, 0L, 0L, 0L, 0L, new GregorianCalendar(2020, Calendar.JANUARY, 1).getTime(), 0L, new GregorianCalendar(2020, Calendar.JANUARY, 1).getTime(), "source");
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
        customerInfo.setId(0);
        customerInfo.setBirth_date(new GregorianCalendar(2020, Calendar.JANUARY, 1).getTime());
        customerInfo.setAge(0L);
        customerInfo.setBirth_address("birth_address");
        customerInfo.setTypes_identification("types_identification");
        customerInfo.setId_card("id_card");
        customerInfo.setNationality_1("nationality_1");
        customerInfo.setNationality_2("nationality_2");
        customerInfo.setNation("nation");
        customerInfo.setJob("job");
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
        final CustomerDTO customerDTO = new CustomerDTO(0L, new GregorianCalendar(2020, Calendar.JANUARY, 1).getTime(), 0L, "birth_address", "types_identification", "id_card", "nationality_1", "nationality_2", "nation", "job", "career", "position", "occupation_group", "company_name", "main_business", "specific_work", 0.0f, "email", "phone_1", "phone_2", 0L, "full_name", "code", 0L, "conadd_no_street", "conadd_city", "conadd_district", "conadd_wards", "curadd_no_street", "curadd_city", "curadd_district", "curadd_wards", "peradd_no_street", "peradd_city", "peradd_district", "peradd_wards", "workadd_no_street", "workadd_city", "workadd_district", "workadd_wards", 0L, 0L, "code_em_support", 0L, 0L, 0L, 0L, 0L, new GregorianCalendar(2020, Calendar.JANUARY, 1).getTime(), 0L, new GregorianCalendar(2020, Calendar.JANUARY, 1).getTime(), "source");

        // Configure CustomerInfoRepository.findById(...).
        final CustomerInfo customerInfo1 = new CustomerInfo();
        customerInfo1.setId(0);
        customerInfo1.setBirth_date(new GregorianCalendar(2020, Calendar.JANUARY, 1).getTime());
        customerInfo1.setAge(0L);
        customerInfo1.setBirth_address("birth_address");
        customerInfo1.setTypes_identification("types_identification");
        customerInfo1.setId_card("id_card");
        customerInfo1.setNationality_1("nationality_1");
        customerInfo1.setNationality_2("nationality_2");
        customerInfo1.setNation("nation");
        customerInfo1.setJob("job");
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
        customerInfo2.setId(0);
        customerInfo2.setBirth_date(new GregorianCalendar(2020, Calendar.JANUARY, 1).getTime());
        customerInfo2.setAge(0L);
        customerInfo2.setBirth_address("birth_address");
        customerInfo2.setTypes_identification("types_identification");
        customerInfo2.setId_card("id_card");
        customerInfo2.setNationality_1("nationality_1");
        customerInfo2.setNationality_2("nationality_2");
        customerInfo2.setNation("nation");
        customerInfo2.setJob("job");
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
        final CustomerDTO customerDTO = new CustomerDTO(0L, new GregorianCalendar(2020, Calendar.JANUARY, 1).getTime(), 0L, "birth_address", "types_identification", "id_card", "nationality_1", "nationality_2", "nation", "job", "career", "position", "occupation_group", "company_name", "main_business", "specific_work", 0.0f, "email", "phone_1", "phone_2", 0L, "full_name", "code", 0L, "conadd_no_street", "conadd_city", "conadd_district", "conadd_wards", "curadd_no_street", "curadd_city", "curadd_district", "curadd_wards", "peradd_no_street", "peradd_city", "peradd_district", "peradd_wards", "workadd_no_street", "workadd_city", "workadd_district", "workadd_wards", 0L, 0L, "code_em_support", 0L, 0L, 0L, 0L, 0L, new GregorianCalendar(2020, Calendar.JANUARY, 1).getTime(), 0L, new GregorianCalendar(2020, Calendar.JANUARY, 1).getTime(), "source");

        // Configure CustomerInfoRepository.findById(...).
        final CustomerInfo customerInfo1 = new CustomerInfo();
        customerInfo1.setId(0);
        customerInfo1.setBirth_date(new GregorianCalendar(2020, Calendar.JANUARY, 1).getTime());
        customerInfo1.setAge(0L);
        customerInfo1.setBirth_address("birth_address");
        customerInfo1.setTypes_identification("types_identification");
        customerInfo1.setId_card("id_card");
        customerInfo1.setNationality_1("nationality_1");
        customerInfo1.setNationality_2("nationality_2");
        customerInfo1.setNation("nation");
        customerInfo1.setJob("job");
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
        customerInfo2.setId(0);
        customerInfo2.setBirth_date(new GregorianCalendar(2020, Calendar.JANUARY, 1).getTime());
        customerInfo2.setAge(0L);
        customerInfo2.setBirth_address("birth_address");
        customerInfo2.setTypes_identification("types_identification");
        customerInfo2.setId_card("id_card");
        customerInfo2.setNationality_1("nationality_1");
        customerInfo2.setNationality_2("nationality_2");
        customerInfo2.setNation("nation");
        customerInfo2.setJob("job");
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
        final CustomerDTO customerDTO = new CustomerDTO(0L, new GregorianCalendar(2020, Calendar.JANUARY, 1).getTime(), 0L, "birth_address", "types_identification", "id_card", "nationality_1", "nationality_2", "nation", "job", "career", "position", "occupation_group", "company_name", "main_business", "specific_work", 0.0f, "email", "phone_1", "phone_2", 0L, "full_name", "code", 0L, "conadd_no_street", "conadd_city", "conadd_district", "conadd_wards", "curadd_no_street", "curadd_city", "curadd_district", "curadd_wards", "peradd_no_street", "peradd_city", "peradd_district", "peradd_wards", "workadd_no_street", "workadd_city", "workadd_district", "workadd_wards", 0L, 0L, "code_em_support", 0L, 0L, 0L, 0L, 0L, new GregorianCalendar(2020, Calendar.JANUARY, 1).getTime(), 0L, new GregorianCalendar(2020, Calendar.JANUARY, 1).getTime(), "source");

        // Configure CustomerInfoRepository.findById(...).
        final CustomerInfo customerInfo1 = new CustomerInfo();
        customerInfo1.setId(0);
        customerInfo1.setBirth_date(new GregorianCalendar(2020, Calendar.JANUARY, 1).getTime());
        customerInfo1.setAge(0L);
        customerInfo1.setBirth_address("birth_address");
        customerInfo1.setTypes_identification("types_identification");
        customerInfo1.setId_card("id_card");
        customerInfo1.setNationality_1("nationality_1");
        customerInfo1.setNationality_2("nationality_2");
        customerInfo1.setNation("nation");
        customerInfo1.setJob("job");
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
        customerInfo2.setId(0);
        customerInfo2.setBirth_date(new GregorianCalendar(2020, Calendar.JANUARY, 1).getTime());
        customerInfo2.setAge(0L);
        customerInfo2.setBirth_address("birth_address");
        customerInfo2.setTypes_identification("types_identification");
        customerInfo2.setId_card("id_card");
        customerInfo2.setNationality_1("nationality_1");
        customerInfo2.setNationality_2("nationality_2");
        customerInfo2.setNation("nation");
        customerInfo2.setJob("job");
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
        final CustomerDTO customerDTO = new CustomerDTO(0L, new GregorianCalendar(2020, Calendar.JANUARY, 1).getTime(), 0L, "birth_address", "types_identification", "id_card", "nationality_1", "nationality_2", "nation", "job", "career", "position", "occupation_group", "company_name", "main_business", "specific_work", 0.0f, "email", "phone_1", "phone_2", 0L, "full_name", "code", 0L, "conadd_no_street", "conadd_city", "conadd_district", "conadd_wards", "curadd_no_street", "curadd_city", "curadd_district", "curadd_wards", "peradd_no_street", "peradd_city", "peradd_district", "peradd_wards", "workadd_no_street", "workadd_city", "workadd_district", "workadd_wards", 0L, 0L, "code_em_support", 0L, 0L, 0L, 0L, 0L, new GregorianCalendar(2020, Calendar.JANUARY, 1).getTime(), 0L, new GregorianCalendar(2020, Calendar.JANUARY, 1).getTime(), "source");

        // Configure CustomerInfoRepository.findById(...).
        final CustomerInfo customerInfo1 = new CustomerInfo();
        customerInfo1.setId(0);
        customerInfo1.setBirth_date(new GregorianCalendar(2020, Calendar.JANUARY, 1).getTime());
        customerInfo1.setAge(0L);
        customerInfo1.setBirth_address("birth_address");
        customerInfo1.setTypes_identification("types_identification");
        customerInfo1.setId_card("id_card");
        customerInfo1.setNationality_1("nationality_1");
        customerInfo1.setNationality_2("nationality_2");
        customerInfo1.setNation("nation");
        customerInfo1.setJob("job");
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
        customerInfo2.setId(0);
        customerInfo2.setBirth_date(new GregorianCalendar(2020, Calendar.JANUARY, 1).getTime());
        customerInfo2.setAge(0L);
        customerInfo2.setBirth_address("birth_address");
        customerInfo2.setTypes_identification("types_identification");
        customerInfo2.setId_card("id_card");
        customerInfo2.setNationality_1("nationality_1");
        customerInfo2.setNationality_2("nationality_2");
        customerInfo2.setNation("nation");
        customerInfo2.setJob("job");
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
        final CustomerDTO customerDTO = new CustomerDTO(0L, new GregorianCalendar(2020, Calendar.JANUARY, 1).getTime(), 0L, "birth_address", "types_identification", "id_card", "nationality_1", "nationality_2", "nation", "job", "career", "position", "occupation_group", "company_name", "main_business", "specific_work", 0.0f, "email", "phone_1", "phone_2", 0L, "full_name", "code", 0L, "conadd_no_street", "conadd_city", "conadd_district", "conadd_wards", "curadd_no_street", "curadd_city", "curadd_district", "curadd_wards", "peradd_no_street", "peradd_city", "peradd_district", "peradd_wards", "workadd_no_street", "workadd_city", "workadd_district", "workadd_wards", 0L, 0L, "code_em_support", 0L, 0L, 0L, 0L, 0L, new GregorianCalendar(2020, Calendar.JANUARY, 1).getTime(), 0L, new GregorianCalendar(2020, Calendar.JANUARY, 1).getTime(), "source");

        // Configure CustomerInfoRepository.findAll(...).
        final CustomerInfo customerInfo = new CustomerInfo();
        customerInfo.setId(0);
        customerInfo.setBirth_date(new GregorianCalendar(2020, Calendar.JANUARY, 1).getTime());
        customerInfo.setAge(0L);
        customerInfo.setBirth_address("birth_address");
        customerInfo.setTypes_identification("types_identification");
        customerInfo.setId_card("id_card");
        customerInfo.setNationality_1("nationality_1");
        customerInfo.setNationality_2("nationality_2");
        customerInfo.setNation("nation");
        customerInfo.setJob("job");
        final List<CustomerInfo> customerInfos = Arrays.asList(customerInfo);
        when(customerInfoServiceUnderTest.customerInfoRepository.findAll()).thenReturn(customerInfos);

        // Configure CustomerAccRepository.save(...).
        final CustomerAcc customerAcc = new CustomerAcc();
        customerAcc.setId(0);
        customerAcc.setCode("code");
        customerAcc.setPass("pass");
        customerAcc.setStatus(false);
        when(customerInfoServiceUnderTest.customerAccRepository.save(any(CustomerAcc.class))).thenReturn(customerAcc);

        // Configure CustomerAccRepository.findById(...).
        final CustomerAcc customerAcc2 = new CustomerAcc();
        customerAcc2.setId(0);
        customerAcc2.setCode("code");
        customerAcc2.setPass("pass");
        customerAcc2.setStatus(false);
        final Optional<CustomerAcc> customerAcc1 = Optional.of(customerAcc2);
        when(customerInfoServiceUnderTest.customerAccRepository.findById(0)).thenReturn(customerAcc1);

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
        final CustomerInfo customerInfo1 = new CustomerInfo();
        customerInfo1.setId(0);
        customerInfo1.setBirth_date(new GregorianCalendar(2020, Calendar.JANUARY, 1).getTime());
        customerInfo1.setAge(0L);
        customerInfo1.setBirth_address("birth_address");
        customerInfo1.setTypes_identification("types_identification");
        customerInfo1.setId_card("id_card");
        customerInfo1.setNationality_1("nationality_1");
        customerInfo1.setNationality_2("nationality_2");
        customerInfo1.setNation("nation");
        customerInfo1.setJob("job");
        when(customerInfoServiceUnderTest.customerInfoRepository.save(any(CustomerInfo.class))).thenReturn(customerInfo1);

        // Run the test
        final boolean result = customerInfoServiceUnderTest.addCustomerInfo(customerDTO);

        // Verify the results
        assertTrue(result);
    }

    @Test
    void testAddCustomerInfo_CustomerInfoRepositoryFindAllReturnsNoItems() {
        // Setup
        final CustomerDTO customerDTO = new CustomerDTO(0L, new GregorianCalendar(2020, Calendar.JANUARY, 1).getTime(), 0L, "birth_address", "types_identification", "id_card", "nationality_1", "nationality_2", "nation", "job", "career", "position", "occupation_group", "company_name", "main_business", "specific_work", 0.0f, "email", "phone_1", "phone_2", 0L, "full_name", "code", 0L, "conadd_no_street", "conadd_city", "conadd_district", "conadd_wards", "curadd_no_street", "curadd_city", "curadd_district", "curadd_wards", "peradd_no_street", "peradd_city", "peradd_district", "peradd_wards", "workadd_no_street", "workadd_city", "workadd_district", "workadd_wards", 0L, 0L, "code_em_support", 0L, 0L, 0L, 0L, 0L, new GregorianCalendar(2020, Calendar.JANUARY, 1).getTime(), 0L, new GregorianCalendar(2020, Calendar.JANUARY, 1).getTime(), "source");
        when(customerInfoServiceUnderTest.customerInfoRepository.findAll()).thenReturn(Collections.emptyList());

        // Configure CustomerAccRepository.save(...).
        final CustomerAcc customerAcc = new CustomerAcc();
        customerAcc.setId(0);
        customerAcc.setCode("code");
        customerAcc.setPass("pass");
        customerAcc.setStatus(false);
        when(customerInfoServiceUnderTest.customerAccRepository.save(any(CustomerAcc.class))).thenReturn(customerAcc);

        // Configure CustomerAccRepository.findById(...).
        final CustomerAcc customerAcc2 = new CustomerAcc();
        customerAcc2.setId(0);
        customerAcc2.setCode("code");
        customerAcc2.setPass("pass");
        customerAcc2.setStatus(false);
        final Optional<CustomerAcc> customerAcc1 = Optional.of(customerAcc2);
        when(customerInfoServiceUnderTest.customerAccRepository.findById(0)).thenReturn(customerAcc1);

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
        customerInfo.setId(0);
        customerInfo.setBirth_date(new GregorianCalendar(2020, Calendar.JANUARY, 1).getTime());
        customerInfo.setAge(0L);
        customerInfo.setBirth_address("birth_address");
        customerInfo.setTypes_identification("types_identification");
        customerInfo.setId_card("id_card");
        customerInfo.setNationality_1("nationality_1");
        customerInfo.setNationality_2("nationality_2");
        customerInfo.setNation("nation");
        customerInfo.setJob("job");
        when(customerInfoServiceUnderTest.customerInfoRepository.save(any(CustomerInfo.class))).thenReturn(customerInfo);

        // Run the test
        final boolean result = customerInfoServiceUnderTest.addCustomerInfo(customerDTO);

        // Verify the results
        assertTrue(result);
    }

    @Test
    void testAddCustomerInfo_CustomerAccRepositoryFindByIdReturnsAbsent() {
        // Setup
        final CustomerDTO customerDTO = new CustomerDTO(0L, new GregorianCalendar(2020, Calendar.JANUARY, 1).getTime(), 0L, "birth_address", "types_identification", "id_card", "nationality_1", "nationality_2", "nation", "job", "career", "position", "occupation_group", "company_name", "main_business", "specific_work", 0.0f, "email", "phone_1", "phone_2", 0L, "full_name", "code", 0L, "conadd_no_street", "conadd_city", "conadd_district", "conadd_wards", "curadd_no_street", "curadd_city", "curadd_district", "curadd_wards", "peradd_no_street", "peradd_city", "peradd_district", "peradd_wards", "workadd_no_street", "workadd_city", "workadd_district", "workadd_wards", 0L, 0L, "code_em_support", 0L, 0L, 0L, 0L, 0L, new GregorianCalendar(2020, Calendar.JANUARY, 1).getTime(), 0L, new GregorianCalendar(2020, Calendar.JANUARY, 1).getTime(), "source");

        // Configure CustomerInfoRepository.findAll(...).
        final CustomerInfo customerInfo = new CustomerInfo();
        customerInfo.setId(0);
        customerInfo.setBirth_date(new GregorianCalendar(2020, Calendar.JANUARY, 1).getTime());
        customerInfo.setAge(0L);
        customerInfo.setBirth_address("birth_address");
        customerInfo.setTypes_identification("types_identification");
        customerInfo.setId_card("id_card");
        customerInfo.setNationality_1("nationality_1");
        customerInfo.setNationality_2("nationality_2");
        customerInfo.setNation("nation");
        customerInfo.setJob("job");
        final List<CustomerInfo> customerInfos = Arrays.asList(customerInfo);
        when(customerInfoServiceUnderTest.customerInfoRepository.findAll()).thenReturn(customerInfos);

        // Configure CustomerAccRepository.save(...).
        final CustomerAcc customerAcc = new CustomerAcc();
        customerAcc.setId(0);
        customerAcc.setCode("code");
        customerAcc.setPass("pass");
        customerAcc.setStatus(false);
        when(customerInfoServiceUnderTest.customerAccRepository.save(any(CustomerAcc.class))).thenReturn(customerAcc);

        when(customerInfoServiceUnderTest.customerAccRepository.findById(0)).thenReturn(Optional.empty());

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
        final CustomerInfo customerInfo1 = new CustomerInfo();
        customerInfo1.setId(0);
        customerInfo1.setBirth_date(new GregorianCalendar(2020, Calendar.JANUARY, 1).getTime());
        customerInfo1.setAge(0L);
        customerInfo1.setBirth_address("birth_address");
        customerInfo1.setTypes_identification("types_identification");
        customerInfo1.setId_card("id_card");
        customerInfo1.setNationality_1("nationality_1");
        customerInfo1.setNationality_2("nationality_2");
        customerInfo1.setNation("nation");
        customerInfo1.setJob("job");
        when(customerInfoServiceUnderTest.customerInfoRepository.save(any(CustomerInfo.class))).thenReturn(customerInfo1);

        // Run the test
        final boolean result = customerInfoServiceUnderTest.addCustomerInfo(customerDTO);

        // Verify the results
        assertTrue(result);
    }

    @Test
    void testGetOneInfo1() {
        // Setup

        // Configure CustomerDTORepository.getCustomerInfobyIDAndCodeEmSupport(...).
        final List<CustomerDTO> customerDTOS = Arrays.asList(new CustomerDTO(20L));
        when(customerInfoServiceUnderTest.customerDTORepository.getCustomerInfobyIDAndCodeEmSupport(20, "cuong")).thenReturn(customerDTOS);

        // Run the test
        final List<CustomerDTO> result = customerInfoServiceUnderTest.getOneInfo(20, "cuong");

        // Verify the results
        Assert.assertEquals(result, customerDTOS.get(0));
    }

    @Test
    void testGetOneInfo1_CustomerDTORepositoryReturnsNoItems() {
        // Setup
        when(customerInfoServiceUnderTest.customerDTORepository.getCustomerInfobyIDAndCodeEmSupport(0, "code")).thenReturn(Collections.emptyList());

        // Run the test
        final List<CustomerDTO> result = customerInfoServiceUnderTest.getOneInfo(0, "code_em_suport");

        // Verify the results
    }

    @Test
    void testGetOneInfo2() {
        // Setup

        // Configure CustomerDTORepository.getCustomerInfobyIdCustomer(...).
        final List<CustomerDTO> customerDTOS = Arrays.asList(new CustomerDTO(0L, new GregorianCalendar(2020, Calendar.JANUARY, 1).getTime(), 0L, "birth_address", "types_identification", "id_card", "nationality_1", "nationality_2", "nation", "job", "career", "position", "occupation_group", "company_name", "main_business", "specific_work", 0.0f, "email", "phone_1", "phone_2", 0L, "full_name", "code", 0L, "conadd_no_street", "conadd_city", "conadd_district", "conadd_wards", "curadd_no_street", "curadd_city", "curadd_district", "curadd_wards", "peradd_no_street", "peradd_city", "peradd_district", "peradd_wards", "workadd_no_street", "workadd_city", "workadd_district", "workadd_wards", 0L, 0L, "code_em_support", 0L, 0L, 0L, 0L, 0L, new GregorianCalendar(2020, Calendar.JANUARY, 1).getTime(), 0L, new GregorianCalendar(2020, Calendar.JANUARY, 1).getTime(), "source"));
        when(customerInfoServiceUnderTest.customerDTORepository.getCustomerInfobyIdCustomer(0)).thenReturn(customerDTOS);

        // Run the test
        final List<CustomerDTO> result = customerInfoServiceUnderTest.getOneInfo(0);

        // Verify the results
    }

    @Test
    void testGetOneInfo2_CustomerDTORepositoryReturnsNoItems() {
        // Setup
        when(customerInfoServiceUnderTest.customerDTORepository.getCustomerInfobyIdCustomer(0)).thenReturn(Collections.emptyList());

        // Run the test
        final List<CustomerDTO> result = customerInfoServiceUnderTest.getOneInfo(0);

        // Verify the results
    }

    @Test
    void testFindAll() {
        // Setup

        // Configure CustomerDTORepository.getAllCustomerInfo(...).
        final List<CustomerDTO> customerDTOS = Arrays.asList(new CustomerDTO(0L, new GregorianCalendar(2020, Calendar.JANUARY, 1).getTime(), 0L, "birth_address", "types_identification", "id_card", "nationality_1", "nationality_2", "nation", "job", "career", "position", "occupation_group", "company_name", "main_business", "specific_work", 0.0f, "email", "phone_1", "phone_2", 0L, "full_name", "code", 0L, "conadd_no_street", "conadd_city", "conadd_district", "conadd_wards", "curadd_no_street", "curadd_city", "curadd_district", "curadd_wards", "peradd_no_street", "peradd_city", "peradd_district", "peradd_wards", "workadd_no_street", "workadd_city", "workadd_district", "workadd_wards", 0L, 0L, "code_em_support", 0L, 0L, 0L, 0L, 0L, new GregorianCalendar(2020, Calendar.JANUARY, 1).getTime(), 0L, new GregorianCalendar(2020, Calendar.JANUARY, 1).getTime(), "source"));
        when(customerInfoServiceUnderTest.customerDTORepository.getAllCustomerInfo("code_em_support")).thenReturn(customerDTOS);

        // Run the test
        final List<CustomerDTO> result = customerInfoServiceUnderTest.findAll("code_em_support");

        // Verify the results
    }

    @Test
    void testFindAll_CustomerDTORepositoryReturnsNoItems() {
        // Setup
        when(customerInfoServiceUnderTest.customerDTORepository.getAllCustomerInfo("code_em_support")).thenReturn(Collections.emptyList());

        // Run the test
        final List<CustomerDTO> result = customerInfoServiceUnderTest.findAll("code_em_support");

        // Verify the results
    }

    @Test
    void testFindAllSearch() throws Exception {
        // Setup

        // Configure CustomerDTORepository.getAllCustomerInfoSearch(...).
        final List<CustomerDTO> customerDTOS = Arrays.asList(new CustomerDTO(0L, new GregorianCalendar(2020, Calendar.JANUARY, 1).getTime(), 0L, "birth_address", "types_identification", "id_card", "nationality_1", "nationality_2", "nation", "job", "career", "position", "occupation_group", "company_name", "main_business", "specific_work", 0.0f, "email", "phone_1", "phone_2", 0L, "full_name", "code", 0L, "conadd_no_street", "conadd_city", "conadd_district", "conadd_wards", "curadd_no_street", "curadd_city", "curadd_district", "curadd_wards", "peradd_no_street", "peradd_city", "peradd_district", "peradd_wards", "workadd_no_street", "workadd_city", "workadd_district", "workadd_wards", 0L, 0L, "code_em_support", 0L, 0L, 0L, 0L, 0L, new GregorianCalendar(2020, Calendar.JANUARY, 1).getTime(), 0L, new GregorianCalendar(2020, Calendar.JANUARY, 1).getTime(), "source"));
        when(customerInfoServiceUnderTest.customerDTORepository.getAllCustomerInfoSearch("code_em_support", "dateFrom", "dateTo", "searchValue")).thenReturn(customerDTOS);

        // Run the test
        final List<CustomerDTO> result = customerInfoServiceUnderTest.findAllSearch("code_em_support", "dateFrom", "dateTo", "searchValue");

        // Verify the results
    }

    @Test
    void testFindAllSearch_CustomerDTORepositoryReturnsNoItems() throws Exception {
        // Setup
        when(customerInfoServiceUnderTest.customerDTORepository.getAllCustomerInfoSearch("code_em_support", "dateFrom", "dateTo", "searchValue")).thenReturn(Collections.emptyList());

        // Run the test
        final List<CustomerDTO> result = customerInfoServiceUnderTest.findAllSearch("code_em_support", "dateFrom", "dateTo", "searchValue");

        // Verify the results
    }

    @Test
    void testFindAllSearch_ThrowsParseException() {
        // Setup

        // Configure CustomerDTORepository.getAllCustomerInfoSearch(...).
        final List<CustomerDTO> customerDTOS = Arrays.asList(new CustomerDTO(0L, new GregorianCalendar(2020, Calendar.JANUARY, 1).getTime(), 0L, "birth_address", "types_identification", "id_card", "nationality_1", "nationality_2", "nation", "job", "career", "position", "occupation_group", "company_name", "main_business", "specific_work", 0.0f, "email", "phone_1", "phone_2", 0L, "full_name", "code", 0L, "conadd_no_street", "conadd_city", "conadd_district", "conadd_wards", "curadd_no_street", "curadd_city", "curadd_district", "curadd_wards", "peradd_no_street", "peradd_city", "peradd_district", "peradd_wards", "workadd_no_street", "workadd_city", "workadd_district", "workadd_wards", 0L, 0L, "code_em_support", 0L, 0L, 0L, 0L, 0L, new GregorianCalendar(2020, Calendar.JANUARY, 1).getTime(), 0L, new GregorianCalendar(2020, Calendar.JANUARY, 1).getTime(), "source"));
        when(customerInfoServiceUnderTest.customerDTORepository.getAllCustomerInfoSearch("code_em_support", "dateFrom", "dateTo", "searchValue")).thenReturn(customerDTOS);

        // Run the test
        assertThrows(ParseException.class, () -> customerInfoServiceUnderTest.findAllSearch("code_em_support", "dateFrom", "dateTo", "searchValue"));
    }

    @Test
    void testFindAllCust() {
        // Setup

        // Configure CustomerDTORepository.getCustomerInfobySaler(...).
        final List<CustomerDTO> customerDTOS = Arrays.asList(new CustomerDTO(0L, new GregorianCalendar(2020, Calendar.JANUARY, 1).getTime(), 0L, "birth_address", "types_identification", "id_card", "nationality_1", "nationality_2", "nation", "job", "career", "position", "occupation_group", "company_name", "main_business", "specific_work", 0.0f, "email", "phone_1", "phone_2", 0L, "full_name", "code", 0L, "conadd_no_street", "conadd_city", "conadd_district", "conadd_wards", "curadd_no_street", "curadd_city", "curadd_district", "curadd_wards", "peradd_no_street", "peradd_city", "peradd_district", "peradd_wards", "workadd_no_street", "workadd_city", "workadd_district", "workadd_wards", 0L, 0L, "code_em_support", 0L, 0L, 0L, 0L, 0L, new GregorianCalendar(2020, Calendar.JANUARY, 1).getTime(), 0L, new GregorianCalendar(2020, Calendar.JANUARY, 1).getTime(), "source"));
        when(customerInfoServiceUnderTest.customerDTORepository.getCustomerInfobySaler("code")).thenReturn(customerDTOS);

        // Run the test
        final List<CustomerDTO> result = customerInfoServiceUnderTest.findAllCust("code_em_support");

        // Verify the results
    }

    @Test
    void testFindAllCust_CustomerDTORepositoryReturnsNoItems() {
        // Setup
        when(customerInfoServiceUnderTest.customerDTORepository.getCustomerInfobySaler("code")).thenReturn(Collections.emptyList());

        // Run the test
        final List<CustomerDTO> result = customerInfoServiceUnderTest.findAllCust("code_em_support");

        // Verify the results
    }

    @Test
    void testGetAllCustomerInfoAdmin() {
        // Setup

        // Configure CustomerDTORepository.getAllCustomerInfoAdmin(...).
        final List<CustomerDTO> customerDTOS = Arrays.asList(new CustomerDTO(0L, new GregorianCalendar(2020, Calendar.JANUARY, 1).getTime(), 0L, "birth_address", "types_identification", "id_card", "nationality_1", "nationality_2", "nation", "job", "career", "position", "occupation_group", "company_name", "main_business", "specific_work", 0.0f, "email", "phone_1", "phone_2", 0L, "full_name", "code", 0L, "conadd_no_street", "conadd_city", "conadd_district", "conadd_wards", "curadd_no_street", "curadd_city", "curadd_district", "curadd_wards", "peradd_no_street", "peradd_city", "peradd_district", "peradd_wards", "workadd_no_street", "workadd_city", "workadd_district", "workadd_wards", 0L, 0L, "code_em_support", 0L, 0L, 0L, 0L, 0L, new GregorianCalendar(2020, Calendar.JANUARY, 1).getTime(), 0L, new GregorianCalendar(2020, Calendar.JANUARY, 1).getTime(), "source"));
        when(customerInfoServiceUnderTest.customerDTORepository.getAllCustomerInfoAdmin()).thenReturn(customerDTOS);

        // Run the test
        final List<CustomerDTO> result = customerInfoServiceUnderTest.getAllCustomerInfoAdmin();

        // Verify the results
    }

    @Test
    void testGetAllCustomerInfoAdmin_CustomerDTORepositoryReturnsNoItems() {
        // Setup
        when(customerInfoServiceUnderTest.customerDTORepository.getAllCustomerInfoAdmin()).thenReturn(Collections.emptyList());

        // Run the test
        final List<CustomerDTO> result = customerInfoServiceUnderTest.getAllCustomerInfoAdmin();

        // Verify the results
    }

    @Test
    void testSearchAllCustomerInfoAdmin() {
        // Setup

        // Configure CustomerDTORepository.searchAllCustomerInfoAdmin(...).
        final List<CustomerDTO> customerDTOS = Arrays.asList(new CustomerDTO(0L, new GregorianCalendar(2020, Calendar.JANUARY, 1).getTime(), 0L, "birth_address", "types_identification", "id_card", "nationality_1", "nationality_2", "nation", "job", "career", "position", "occupation_group", "company_name", "main_business", "specific_work", 0.0f, "email", "phone_1", "phone_2", 0L, "full_name", "code", 0L, "conadd_no_street", "conadd_city", "conadd_district", "conadd_wards", "curadd_no_street", "curadd_city", "curadd_district", "curadd_wards", "peradd_no_street", "peradd_city", "peradd_district", "peradd_wards", "workadd_no_street", "workadd_city", "workadd_district", "workadd_wards", 0L, 0L, "code_em_support", 0L, 0L, 0L, 0L, 0L, new GregorianCalendar(2020, Calendar.JANUARY, 1).getTime(), 0L, new GregorianCalendar(2020, Calendar.JANUARY, 1).getTime(), "source"));
        when(customerInfoServiceUnderTest.customerDTORepository.searchAllCustomerInfoAdmin("dateFrom", "dateTo", "searchValue")).thenReturn(customerDTOS);

        // Run the test
        final List<CustomerDTO> result = customerInfoServiceUnderTest.searchAllCustomerInfoAdmin("dateFrom", "dateTo", "searchValue");

        // Verify the results
    }

    @Test
    void testSearchAllCustomerInfoAdmin_CustomerDTORepositoryReturnsNoItems() {
        // Setup
        when(customerInfoServiceUnderTest.customerDTORepository.searchAllCustomerInfoAdmin("dateFrom", "dateTo", "searchValue")).thenReturn(Collections.emptyList());

        // Run the test
        final List<CustomerDTO> result = customerInfoServiceUnderTest.searchAllCustomerInfoAdmin("dateFrom", "dateTo", "searchValue");

        // Verify the results
    }
}
