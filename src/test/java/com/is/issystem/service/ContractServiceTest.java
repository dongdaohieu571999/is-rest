package com.is.issystem.service;

import com.is.issystem.dto.ContractDTO;
import com.is.issystem.entities.*;
import com.is.issystem.repository.entity_dto_repository.ContractDTORepository;
import com.is.issystem.repository.entity_repository.*;
import org.junit.Assert;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.sql.Date;
import java.util.*;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
class ContractServiceTest {

    @Mock
    private ContractRepository mockContractRepository;
    @Mock
    private ContractDTORepository mockContractDTORepository;
    @Mock
    private ContractChangeHistoryRepository mockContractChangeHistoryRepository;
    @Mock
    private FeePaymentHistoryRepository mockFeePaymentHistoryRepository;
    @Mock
    private BenifitPaymentHistoryRepository mockBenifitPaymentHistoryRepository;
    @Mock
    private RequestRepository mockRequestRepository;

    @InjectMocks
    private ContractService contractServiceUnderTest;

    @Test
    void testGetAllContract() {
        // Setup

        // Configure ContractDTORepository.getAllContractDTO(...).
        final ContractDTO contractDTO = new ContractDTO();
        contractDTO.setId(0);
        contractDTO.setId_customer(0);
        contractDTO.setName_contract_owner("name_contract_owner");
        contractDTO.setPayment_period_id(0);
        contractDTO.setInsurance_type("insurance_type");
        contractDTO.setId_main_benifit(0);
        contractDTO.setId_illustration(0);
        contractDTO.setStart_time(new Date(0L));
        contractDTO.setEnd_time(new Date(0L));
        contractDTO.setCreate_time(new Date(0L));
        final List<ContractDTO> contractDTOS = Arrays.asList(contractDTO);
        when(mockContractDTORepository.getAllContractDTO("code_em_support")).thenReturn(contractDTOS);

        // Run the test
        final List<ContractDTO> result = contractServiceUnderTest.getAllContract("code_em_support");

        // Verify the results
        Assert.assertEquals(result.get(0).getId(), contractDTOS.get(0).getId());
    }

    @Test
    void testGetAllContract001() {
        // Setup

        // Configure ContractDTORepository.getAllContractDTO(...).
        final ContractDTO contractDTO = new ContractDTO();
        contractDTO.setId(0);
        contractDTO.setId_customer(0);
        contractDTO.setName_contract_owner("name_contract_owner");
        contractDTO.setPayment_period_id(0);
        contractDTO.setInsurance_type("insurance_type");
        contractDTO.setId_main_benifit(0);
        contractDTO.setId_illustration(0);
        contractDTO.setStart_time(new Date(0L));
        contractDTO.setEnd_time(new Date(0L));
        contractDTO.setCreate_time(new Date(0L));
        final List<ContractDTO> contractDTOS = Arrays.asList(contractDTO);
        when(mockContractDTORepository.getAllContractDTO("code_em_support")).thenReturn(contractDTOS);

        // Run the test
        final List<ContractDTO> result = contractServiceUnderTest.getAllContract("code_em_support");

        // Verify the results
        Assert.assertEquals(result.get(0).getId_customer(), contractDTOS.get(0).getId_customer());
    }

    @Test
    void testGetAllContract002() {
        // Setup

        // Configure ContractDTORepository.getAllContractDTO(...).
        final ContractDTO contractDTO = new ContractDTO();
        contractDTO.setId(0);
        contractDTO.setId_customer(0);
        contractDTO.setName_contract_owner("name_contract_owner");
        contractDTO.setPayment_period_id(0);
        contractDTO.setInsurance_type("insurance_type");
        contractDTO.setId_main_benifit(0);
        contractDTO.setId_illustration(0);
        contractDTO.setStart_time(new Date(0L));
        contractDTO.setEnd_time(new Date(0L));
        contractDTO.setCreate_time(new Date(0L));
        final List<ContractDTO> contractDTOS = Arrays.asList(contractDTO);
        when(mockContractDTORepository.getAllContractDTO("code_em_support")).thenReturn(contractDTOS);

        // Run the test
        final List<ContractDTO> result = contractServiceUnderTest.getAllContract("code_em_support");

        // Verify the results
        Assert.assertEquals(result.get(0).getName_contract_owner(), contractDTOS.get(0).getName_contract_owner());
    }

    @Test
    void testGetAllContract003() {
        // Setup

        // Configure ContractDTORepository.getAllContractDTO(...).
        final ContractDTO contractDTO = new ContractDTO();
        contractDTO.setId(0);
        contractDTO.setId_customer(0);
        contractDTO.setName_contract_owner("name_contract_owner");
        contractDTO.setPayment_period_id(0);
        contractDTO.setInsurance_type("insurance_type");
        contractDTO.setId_main_benifit(0);
        contractDTO.setId_illustration(0);
        contractDTO.setStart_time(new Date(0L));
        contractDTO.setEnd_time(new Date(0L));
        contractDTO.setCreate_time(new Date(0L));
        final List<ContractDTO> contractDTOS = Arrays.asList(contractDTO);
        when(mockContractDTORepository.getAllContractDTO("code_em_support")).thenReturn(contractDTOS);

        // Run the test
        final List<ContractDTO> result = contractServiceUnderTest.getAllContract("code_em_support");

        // Verify the results
        Assert.assertEquals(result.get(0).getPayment_period_id(), contractDTOS.get(0).getPayment_period_id());
    }

    @Test
    void testGetAllContract004() {
        // Setup

        // Configure ContractDTORepository.getAllContractDTO(...).
        final ContractDTO contractDTO = new ContractDTO();
        contractDTO.setId(0);
        contractDTO.setId_customer(0);
        contractDTO.setName_contract_owner("name_contract_owner");
        contractDTO.setPayment_period_id(0);
        contractDTO.setInsurance_type("insurance_type");
        contractDTO.setId_main_benifit(0);
        contractDTO.setId_illustration(0);
        contractDTO.setStart_time(new Date(0L));
        contractDTO.setEnd_time(new Date(0L));
        contractDTO.setCreate_time(new Date(0L));
        final List<ContractDTO> contractDTOS = Arrays.asList(contractDTO);
        when(mockContractDTORepository.getAllContractDTO("code_em_support")).thenReturn(contractDTOS);

        // Run the test
        final List<ContractDTO> result = contractServiceUnderTest.getAllContract("code_em_support");

        // Verify the results
        Assert.assertEquals(result.get(0).getInsurance_type(), contractDTOS.get(0).getInsurance_type());
    }

    @Test
    void testGetAllContract005() {
        // Setup

        // Configure ContractDTORepository.getAllContractDTO(...).
        final ContractDTO contractDTO = new ContractDTO();
        contractDTO.setId(0);
        contractDTO.setId_customer(0);
        contractDTO.setName_contract_owner("name_contract_owner");
        contractDTO.setPayment_period_id(0);
        contractDTO.setInsurance_type("insurance_type");
        contractDTO.setId_main_benifit(0);
        contractDTO.setId_illustration(0);
        contractDTO.setStart_time(new Date(0L));
        contractDTO.setEnd_time(new Date(0L));
        contractDTO.setCreate_time(new Date(0L));
        final List<ContractDTO> contractDTOS = Arrays.asList(contractDTO);
        when(mockContractDTORepository.getAllContractDTO("code_em_support")).thenReturn(contractDTOS);

        // Run the test
        final List<ContractDTO> result = contractServiceUnderTest.getAllContract("code_em_support");

        // Verify the results
        Assert.assertEquals(result.get(0).getId_main_benifit(), contractDTOS.get(0).getId_main_benifit());
    }

    @Test
    void testGetAllContract006() {
        // Setup

        // Configure ContractDTORepository.getAllContractDTO(...).
        final ContractDTO contractDTO = new ContractDTO();
        contractDTO.setId(0);
        contractDTO.setId_customer(0);
        contractDTO.setName_contract_owner("name_contract_owner");
        contractDTO.setPayment_period_id(0);
        contractDTO.setInsurance_type("insurance_type");
        contractDTO.setId_main_benifit(0);
        contractDTO.setId_illustration(0);
        contractDTO.setStart_time(new Date(0L));
        contractDTO.setEnd_time(new Date(0L));
        contractDTO.setCreate_time(new Date(0L));
        final List<ContractDTO> contractDTOS = Arrays.asList(contractDTO);
        when(mockContractDTORepository.getAllContractDTO("code_em_support")).thenReturn(contractDTOS);

        // Run the test
        final List<ContractDTO> result = contractServiceUnderTest.getAllContract("code_em_support");

        // Verify the results
        Assert.assertEquals(result.get(0).getId_illustration(), contractDTOS.get(0).getId_illustration());
    }

    @Test
    void testGetAllContract007() {
        // Setup

        // Configure ContractDTORepository.getAllContractDTO(...).
        final ContractDTO contractDTO = new ContractDTO();
        contractDTO.setId(0);
        contractDTO.setId_customer(0);
        contractDTO.setName_contract_owner("name_contract_owner");
        contractDTO.setPayment_period_id(0);
        contractDTO.setInsurance_type("insurance_type");
        contractDTO.setId_main_benifit(0);
        contractDTO.setId_illustration(0);
        contractDTO.setStart_time(new Date(0L));
        contractDTO.setEnd_time(new Date(0L));
        contractDTO.setCreate_time(new Date(0L));
        final List<ContractDTO> contractDTOS = Arrays.asList(contractDTO);
        when(mockContractDTORepository.getAllContractDTO("code_em_support")).thenReturn(contractDTOS);

        // Run the test
        final List<ContractDTO> result = contractServiceUnderTest.getAllContract("code_em_support");

        // Verify the results
        Assert.assertEquals(result.get(0).getStart_time(), contractDTOS.get(0).getStart_time());
    }

    @Test
    void testGetAllContract008() {
        // Setup

        // Configure ContractDTORepository.getAllContractDTO(...).
        final ContractDTO contractDTO = new ContractDTO();
        contractDTO.setId(0);
        contractDTO.setId_customer(0);
        contractDTO.setName_contract_owner("name_contract_owner");
        contractDTO.setPayment_period_id(0);
        contractDTO.setInsurance_type("insurance_type");
        contractDTO.setId_main_benifit(0);
        contractDTO.setId_illustration(0);
        contractDTO.setStart_time(new Date(0L));
        contractDTO.setEnd_time(new Date(0L));
        contractDTO.setCreate_time(new Date(0L));
        final List<ContractDTO> contractDTOS = Arrays.asList(contractDTO);
        when(mockContractDTORepository.getAllContractDTO("code_em_support")).thenReturn(contractDTOS);

        // Run the test
        final List<ContractDTO> result = contractServiceUnderTest.getAllContract("code_em_support");

        // Verify the results
        Assert.assertEquals(result.get(0).getEnd_time(), contractDTOS.get(0).getEnd_time());
    }

    @Test
    void testGetAllContract009() {
        // Setup

        // Configure ContractDTORepository.getAllContractDTO(...).
        final ContractDTO contractDTO = new ContractDTO();
        contractDTO.setId(0);
        contractDTO.setId_customer(0);
        contractDTO.setName_contract_owner("name_contract_owner");
        contractDTO.setPayment_period_id(0);
        contractDTO.setInsurance_type("insurance_type");
        contractDTO.setId_main_benifit(0);
        contractDTO.setId_illustration(0);
        contractDTO.setStart_time(new Date(0L));
        contractDTO.setEnd_time(new Date(0L));
        contractDTO.setCreate_time(new Date(0L));
        final List<ContractDTO> contractDTOS = Arrays.asList(contractDTO);
        when(mockContractDTORepository.getAllContractDTO("code_em_support")).thenReturn(contractDTOS);

        // Run the test
        final List<ContractDTO> result = contractServiceUnderTest.getAllContract("code_em_support");

        // Verify the results
        Assert.assertEquals(result.get(0).getCreate_time(), contractDTOS.get(0).getCreate_time());
    }

    @Test
    void testGetAllContract010() {
        // Setup

        // Configure ContractDTORepository.getAllContractDTO(...).
        final ContractDTO contractDTO = new ContractDTO();
        contractDTO.setId(0);
        contractDTO.setId_customer(0);
        contractDTO.setName_contract_owner("name_contract_owner");
        contractDTO.setPayment_period_id(0);
        contractDTO.setInsurance_type("insurance_type");
        contractDTO.setId_main_benifit(0);
        contractDTO.setId_illustration(0);
        contractDTO.setStart_time(new Date(0L));
        contractDTO.setEnd_time(new Date(0L));
        contractDTO.setCreate_time(new Date(0L));
        final List<ContractDTO> contractDTOS = Arrays.asList(contractDTO);
        when(mockContractDTORepository.getAllContractDTO("code_em_support")).thenReturn(contractDTOS);

        // Run the test
        final List<ContractDTO> result = contractServiceUnderTest.getAllContract("code_em_support");

        // Verify the results
        Assert.assertNotNull(result);
    }

    @Test
    void testGetAllContract_ContractDTORepositoryReturnsNoItems() {
        // Setup
        when(mockContractDTORepository.getAllContractDTO("code_em_support")).thenReturn(Collections.emptyList());

        // Run the test
        final List<ContractDTO> result = contractServiceUnderTest.getAllContract("code_em_support");

        // Verify the results
        Assert.assertNull(result);
    }

    @Test
    void testGetAllContractForCustomer() {
        // Setup

        // Configure ContractDTORepository.getAllContractDTOForCustomer(...).
        final ContractDTO contractDTO = new ContractDTO();
        contractDTO.setId(0);
        contractDTO.setId_customer(0);
        contractDTO.setName_contract_owner("name_contract_owner");
        contractDTO.setPayment_period_id(0);
        contractDTO.setInsurance_type("insurance_type");
        contractDTO.setId_main_benifit(0);
        contractDTO.setId_illustration(0);
        contractDTO.setStart_time(new Date(0L));
        contractDTO.setEnd_time(new Date(0L));
        contractDTO.setCreate_time(new Date(0L));
        final List<ContractDTO> contractDTOS = Arrays.asList(contractDTO);
        when(mockContractDTORepository.getAllContractDTOForCustomer(0)).thenReturn(contractDTOS);

        // Run the test
        final List<ContractDTO> result = contractServiceUnderTest.getAllContractForCustomer(0);

        // Verify the results
        Assert.assertEquals(result.get(0).getId(), contractDTOS.get(0).getId());
    }

    @Test
    void testGetAllContractForCustomer001() {
        // Setup

        // Configure ContractDTORepository.getAllContractDTOForCustomer(...).
        final ContractDTO contractDTO = new ContractDTO();
        contractDTO.setId(0);
        contractDTO.setId_customer(0);
        contractDTO.setName_contract_owner("name_contract_owner");
        contractDTO.setPayment_period_id(0);
        contractDTO.setInsurance_type("insurance_type");
        contractDTO.setId_main_benifit(0);
        contractDTO.setId_illustration(0);
        contractDTO.setStart_time(new Date(0L));
        contractDTO.setEnd_time(new Date(0L));
        contractDTO.setCreate_time(new Date(0L));
        final List<ContractDTO> contractDTOS = Arrays.asList(contractDTO);
        when(mockContractDTORepository.getAllContractDTOForCustomer(0)).thenReturn(contractDTOS);

        // Run the test
        final List<ContractDTO> result = contractServiceUnderTest.getAllContractForCustomer(0);

        // Verify the results
        Assert.assertEquals(result.get(0).getId_customer(), contractDTOS.get(0).getId_customer());
    }

    @Test
    void testGetAllContractForCustomer002() {
        // Setup

        // Configure ContractDTORepository.getAllContractDTOForCustomer(...).
        final ContractDTO contractDTO = new ContractDTO();
        contractDTO.setId(0);
        contractDTO.setId_customer(0);
        contractDTO.setName_contract_owner("name_contract_owner");
        contractDTO.setPayment_period_id(0);
        contractDTO.setInsurance_type("insurance_type");
        contractDTO.setId_main_benifit(0);
        contractDTO.setId_illustration(0);
        contractDTO.setStart_time(new Date(0L));
        contractDTO.setEnd_time(new Date(0L));
        contractDTO.setCreate_time(new Date(0L));
        final List<ContractDTO> contractDTOS = Arrays.asList(contractDTO);
        when(mockContractDTORepository.getAllContractDTOForCustomer(0)).thenReturn(contractDTOS);

        // Run the test
        final List<ContractDTO> result = contractServiceUnderTest.getAllContractForCustomer(0);

        // Verify the results
        Assert.assertEquals(result.get(0).getName_contract_owner(), contractDTOS.get(0).getName_contract_owner());
    }

    @Test
    void testGetAllContractForCustomer003() {
        // Setup

        // Configure ContractDTORepository.getAllContractDTOForCustomer(...).
        final ContractDTO contractDTO = new ContractDTO();
        contractDTO.setId(0);
        contractDTO.setId_customer(0);
        contractDTO.setName_contract_owner("name_contract_owner");
        contractDTO.setPayment_period_id(0);
        contractDTO.setInsurance_type("insurance_type");
        contractDTO.setId_main_benifit(0);
        contractDTO.setId_illustration(0);
        contractDTO.setStart_time(new Date(0L));
        contractDTO.setEnd_time(new Date(0L));
        contractDTO.setCreate_time(new Date(0L));
        final List<ContractDTO> contractDTOS = Arrays.asList(contractDTO);
        when(mockContractDTORepository.getAllContractDTOForCustomer(0)).thenReturn(contractDTOS);

        // Run the test
        final List<ContractDTO> result = contractServiceUnderTest.getAllContractForCustomer(0);

        // Verify the results
        Assert.assertEquals(result.get(0).getPayment_period_id(), contractDTOS.get(0).getPayment_period_id());
    }

    @Test
    void testGetAllContractForCustomer004() {
        // Setup

        // Configure ContractDTORepository.getAllContractDTOForCustomer(...).
        final ContractDTO contractDTO = new ContractDTO();
        contractDTO.setId(0);
        contractDTO.setId_customer(0);
        contractDTO.setName_contract_owner("name_contract_owner");
        contractDTO.setPayment_period_id(0);
        contractDTO.setInsurance_type("insurance_type");
        contractDTO.setId_main_benifit(0);
        contractDTO.setId_illustration(0);
        contractDTO.setStart_time(new Date(0L));
        contractDTO.setEnd_time(new Date(0L));
        contractDTO.setCreate_time(new Date(0L));
        final List<ContractDTO> contractDTOS = Arrays.asList(contractDTO);
        when(mockContractDTORepository.getAllContractDTOForCustomer(0)).thenReturn(contractDTOS);

        // Run the test
        final List<ContractDTO> result = contractServiceUnderTest.getAllContractForCustomer(0);

        // Verify the results
        Assert.assertEquals(result.get(0).getInsurance_type(), contractDTOS.get(0).getInsurance_type());
    }

    @Test
    void testGetAllContractForCustomer005() {
        // Setup

        // Configure ContractDTORepository.getAllContractDTOForCustomer(...).
        final ContractDTO contractDTO = new ContractDTO();
        contractDTO.setId(0);
        contractDTO.setId_customer(0);
        contractDTO.setName_contract_owner("name_contract_owner");
        contractDTO.setPayment_period_id(0);
        contractDTO.setInsurance_type("insurance_type");
        contractDTO.setId_main_benifit(0);
        contractDTO.setId_illustration(0);
        contractDTO.setStart_time(new Date(0L));
        contractDTO.setEnd_time(new Date(0L));
        contractDTO.setCreate_time(new Date(0L));
        final List<ContractDTO> contractDTOS = Arrays.asList(contractDTO);
        when(mockContractDTORepository.getAllContractDTOForCustomer(0)).thenReturn(contractDTOS);

        // Run the test
        final List<ContractDTO> result = contractServiceUnderTest.getAllContractForCustomer(0);

        // Verify the results
        Assert.assertEquals(result.get(0).getId_main_benifit(), contractDTOS.get(0).getId_main_benifit());
    }

    @Test
    void testGetAllContractForCustomer006() {
        // Setup

        // Configure ContractDTORepository.getAllContractDTOForCustomer(...).
        final ContractDTO contractDTO = new ContractDTO();
        contractDTO.setId(0);
        contractDTO.setId_customer(0);
        contractDTO.setName_contract_owner("name_contract_owner");
        contractDTO.setPayment_period_id(0);
        contractDTO.setInsurance_type("insurance_type");
        contractDTO.setId_main_benifit(0);
        contractDTO.setId_illustration(0);
        contractDTO.setStart_time(new Date(0L));
        contractDTO.setEnd_time(new Date(0L));
        contractDTO.setCreate_time(new Date(0L));
        final List<ContractDTO> contractDTOS = Arrays.asList(contractDTO);
        when(mockContractDTORepository.getAllContractDTOForCustomer(0)).thenReturn(contractDTOS);

        // Run the test
        final List<ContractDTO> result = contractServiceUnderTest.getAllContractForCustomer(0);

        // Verify the results
        Assert.assertEquals(result.get(0).getId_illustration(), contractDTOS.get(0).getId_illustration());
    }

    @Test
    void testGetAllContractForCustomer007() {
        // Setup

        // Configure ContractDTORepository.getAllContractDTOForCustomer(...).
        final ContractDTO contractDTO = new ContractDTO();
        contractDTO.setId(0);
        contractDTO.setId_customer(0);
        contractDTO.setName_contract_owner("name_contract_owner");
        contractDTO.setPayment_period_id(0);
        contractDTO.setInsurance_type("insurance_type");
        contractDTO.setId_main_benifit(0);
        contractDTO.setId_illustration(0);
        contractDTO.setStart_time(new Date(0L));
        contractDTO.setEnd_time(new Date(0L));
        contractDTO.setCreate_time(new Date(0L));
        final List<ContractDTO> contractDTOS = Arrays.asList(contractDTO);
        when(mockContractDTORepository.getAllContractDTOForCustomer(0)).thenReturn(contractDTOS);

        // Run the test
        final List<ContractDTO> result = contractServiceUnderTest.getAllContractForCustomer(0);

        // Verify the results
        Assert.assertEquals(result.get(0).getStart_time(), contractDTOS.get(0).getStart_time());
    }

    @Test
    void testGetAllContractForCustomer008() {
        // Setup

        // Configure ContractDTORepository.getAllContractDTOForCustomer(...).
        final ContractDTO contractDTO = new ContractDTO();
        contractDTO.setId(0);
        contractDTO.setId_customer(0);
        contractDTO.setName_contract_owner("name_contract_owner");
        contractDTO.setPayment_period_id(0);
        contractDTO.setInsurance_type("insurance_type");
        contractDTO.setId_main_benifit(0);
        contractDTO.setId_illustration(0);
        contractDTO.setStart_time(new Date(0L));
        contractDTO.setEnd_time(new Date(0L));
        contractDTO.setCreate_time(new Date(0L));
        final List<ContractDTO> contractDTOS = Arrays.asList(contractDTO);
        when(mockContractDTORepository.getAllContractDTOForCustomer(0)).thenReturn(contractDTOS);

        // Run the test
        final List<ContractDTO> result = contractServiceUnderTest.getAllContractForCustomer(0);

        // Verify the results
        Assert.assertEquals(result.get(0).getEnd_time(), contractDTOS.get(0).getEnd_time());
    }

    @Test
    void testGetAllContractForCustomer009() {
        // Setup

        // Configure ContractDTORepository.getAllContractDTOForCustomer(...).
        final ContractDTO contractDTO = new ContractDTO();
        contractDTO.setId(0);
        contractDTO.setId_customer(0);
        contractDTO.setName_contract_owner("name_contract_owner");
        contractDTO.setPayment_period_id(0);
        contractDTO.setInsurance_type("insurance_type");
        contractDTO.setId_main_benifit(0);
        contractDTO.setId_illustration(0);
        contractDTO.setStart_time(new Date(0L));
        contractDTO.setEnd_time(new Date(0L));
        contractDTO.setCreate_time(new Date(0L));
        final List<ContractDTO> contractDTOS = Arrays.asList(contractDTO);
        when(mockContractDTORepository.getAllContractDTOForCustomer(0)).thenReturn(contractDTOS);

        // Run the test
        final List<ContractDTO> result = contractServiceUnderTest.getAllContractForCustomer(0);

        // Verify the results
        Assert.assertEquals(result.get(0).getCreate_time(), contractDTOS.get(0).getCreate_time());
    }

    @Test
    void testGetAllContractForCustomer010() {
        // Setup

        // Configure ContractDTORepository.getAllContractDTOForCustomer(...).
        final ContractDTO contractDTO = new ContractDTO();
        contractDTO.setId(0);
        contractDTO.setId_customer(0);
        contractDTO.setName_contract_owner("name_contract_owner");
        contractDTO.setPayment_period_id(0);
        contractDTO.setInsurance_type("insurance_type");
        contractDTO.setId_main_benifit(0);
        contractDTO.setId_illustration(0);
        contractDTO.setStart_time(new Date(0L));
        contractDTO.setEnd_time(new Date(0L));
        contractDTO.setCreate_time(new Date(0L));
        final List<ContractDTO> contractDTOS = Arrays.asList(contractDTO);
        when(mockContractDTORepository.getAllContractDTOForCustomer(0)).thenReturn(contractDTOS);

        // Run the test
        final List<ContractDTO> result = contractServiceUnderTest.getAllContractForCustomer(0);

        // Verify the results
        Assert.assertNotNull(result);
    }

    @Test
    void testGetAllContractForCustomer_ContractDTORepositoryReturnsNoItems() {
        // Setup
        when(mockContractDTORepository.getAllContractDTOForCustomer(0)).thenReturn(Collections.emptyList());

        // Run the test
        final List<ContractDTO> result = contractServiceUnderTest.getAllContractForCustomer(0);

        // Verify the results
        Assert.assertNull(result);
    }

    @Test
    void testSearchAllContractForCustomer() {
        // Setup

        // Configure ContractDTORepository.searchAllContractDTOForCustomer(...).
        final ContractDTO contractDTO = new ContractDTO();
        contractDTO.setId(0);
        contractDTO.setId_customer(0);
        contractDTO.setName_contract_owner("name_contract_owner");
        contractDTO.setPayment_period_id(0);
        contractDTO.setInsurance_type("insurance_type");
        contractDTO.setId_main_benifit(0);
        contractDTO.setId_illustration(0);
        contractDTO.setStart_time(new Date(0L));
        contractDTO.setEnd_time(new Date(0L));
        contractDTO.setCreate_time(new Date(0L));
        final List<ContractDTO> contractDTOS = Arrays.asList(contractDTO);
        when(mockContractDTORepository.searchAllContractDTOForCustomer(0, "dateFrom", "dateTo", "searchValue")).thenReturn(contractDTOS);

        // Run the test
        final List<ContractDTO> result = contractServiceUnderTest.searchAllContractForCustomer(0, "dateFrom", "dateTo", "searchValue");

        // Verify the results
        Assert.assertEquals(result.get(0).getId(), contractDTOS.get(0).getId());
    }

    @Test
    void testSearchAllContractForCustomer001() {
        // Setup

        // Configure ContractDTORepository.searchAllContractDTOForCustomer(...).
        final ContractDTO contractDTO = new ContractDTO();
        contractDTO.setId(0);
        contractDTO.setId_customer(0);
        contractDTO.setName_contract_owner("name_contract_owner");
        contractDTO.setPayment_period_id(0);
        contractDTO.setInsurance_type("insurance_type");
        contractDTO.setId_main_benifit(0);
        contractDTO.setId_illustration(0);
        contractDTO.setStart_time(new Date(0L));
        contractDTO.setEnd_time(new Date(0L));
        contractDTO.setCreate_time(new Date(0L));
        final List<ContractDTO> contractDTOS = Arrays.asList(contractDTO);
        when(mockContractDTORepository.searchAllContractDTOForCustomer(0, "dateFrom", "dateTo", "searchValue")).thenReturn(contractDTOS);

        // Run the test
        final List<ContractDTO> result = contractServiceUnderTest.searchAllContractForCustomer(0, "dateFrom", "dateTo", "searchValue");

        // Verify the results
        Assert.assertEquals(result.get(0).getId_customer(), contractDTOS.get(0).getId_customer());
    }

    @Test
    void testSearchAllContractForCustomer002() {
        // Setup

        // Configure ContractDTORepository.searchAllContractDTOForCustomer(...).
        final ContractDTO contractDTO = new ContractDTO();
        contractDTO.setId(0);
        contractDTO.setId_customer(0);
        contractDTO.setName_contract_owner("name_contract_owner");
        contractDTO.setPayment_period_id(0);
        contractDTO.setInsurance_type("insurance_type");
        contractDTO.setId_main_benifit(0);
        contractDTO.setId_illustration(0);
        contractDTO.setStart_time(new Date(0L));
        contractDTO.setEnd_time(new Date(0L));
        contractDTO.setCreate_time(new Date(0L));
        final List<ContractDTO> contractDTOS = Arrays.asList(contractDTO);
        when(mockContractDTORepository.searchAllContractDTOForCustomer(0, "dateFrom", "dateTo", "searchValue")).thenReturn(contractDTOS);

        // Run the test
        final List<ContractDTO> result = contractServiceUnderTest.searchAllContractForCustomer(0, "dateFrom", "dateTo", "searchValue");

        // Verify the results
        Assert.assertEquals(result.get(0).getName_contract_owner(), contractDTOS.get(0).getName_contract_owner());
    }

    @Test
    void testSearchAllContractForCustomer_ContractDTORepositoryReturnsNoItems() {
        // Setup
        when(mockContractDTORepository.searchAllContractDTOForCustomer(0, "dateFrom", "dateTo", "searchValue")).thenReturn(Collections.emptyList());

        // Run the test
        final List<ContractDTO> result = contractServiceUnderTest.searchAllContractForCustomer(0, "dateFrom", "dateTo", "searchValue");

        // Verify the results
        Assert.assertNull(result);
    }

    @Test
    void testSearchAllContract() {
        // Setup

        // Configure ContractDTORepository.searchAllContractDTO(...).
        final ContractDTO contractDTO = new ContractDTO();
        contractDTO.setId(0);
        contractDTO.setId_customer(0);
        contractDTO.setName_contract_owner("name_contract_owner");
        contractDTO.setPayment_period_id(0);
        contractDTO.setInsurance_type("insurance_type");
        contractDTO.setId_main_benifit(0);
        contractDTO.setId_illustration(0);
        contractDTO.setStart_time(new Date(0L));
        contractDTO.setEnd_time(new Date(0L));
        contractDTO.setCreate_time(new Date(0L));
        final List<ContractDTO> contractDTOS = Arrays.asList(contractDTO);
        when(mockContractDTORepository.searchAllContractDTO("code_em_support", "dateFrom", "dateTo", "searchValue")).thenReturn(contractDTOS);

        // Run the test
        final List<ContractDTO> result = contractServiceUnderTest.searchAllContract("code_em_support", "dateFrom", "dateTo", "searchValue");

        // Verify the results
    }

    @Test
    void testSearchAllContract_ContractDTORepositoryReturnsNoItems() {
        // Setup
        when(mockContractDTORepository.searchAllContractDTO("code_em_support", "dateFrom", "dateTo", "searchValue")).thenReturn(Collections.emptyList());

        // Run the test
        final List<ContractDTO> result = contractServiceUnderTest.searchAllContract("code_em_support", "dateFrom", "dateTo", "searchValue");

        // Verify the results
    }

    @Test
    void testGetCountNewContract() {
        // Setup
        when(mockContractRepository.getAllContractCount("code_em_support", 1)).thenReturn(0);

        // Run the test
        final Integer result = contractServiceUnderTest.getCountNewContract("code_em_support", 1);

        // Verify the results
        assertEquals(0, result);
    }

    @Test
    void testGetDetailContractForSaler() {
        // Setup

        // Configure ContractDTORepository.getDetailContractForSaler(...).
        final ContractDTO contractDTO = new ContractDTO();
        contractDTO.setId(0);
        contractDTO.setId_customer(0);
        contractDTO.setName_contract_owner("name_contract_owner");
        contractDTO.setPayment_period_id(0);
        contractDTO.setInsurance_type("insurance_type");
        contractDTO.setId_main_benifit(0);
        contractDTO.setId_illustration(0);
        contractDTO.setStart_time(new Date(0L));
        contractDTO.setEnd_time(new Date(0L));
        contractDTO.setCreate_time(new Date(0L));
        when(mockContractDTORepository.getDetailContractForSaler("code", 0)).thenReturn(contractDTO);

        // Run the test
        final ContractDTO result = contractServiceUnderTest.getDetailContractForSaler("code_em_support", 0);

        // Verify the results
    }

    @Test
    void testGetDetailContractForCustomer() {
        // Setup

        // Configure ContractDTORepository.getDetailContractForCustomer(...).
        final ContractDTO contractDTO = new ContractDTO();
        contractDTO.setId(0);
        contractDTO.setId_customer(0);
        contractDTO.setName_contract_owner("name_contract_owner");
        contractDTO.setPayment_period_id(0);
        contractDTO.setInsurance_type("insurance_type");
        contractDTO.setId_main_benifit(0);
        contractDTO.setId_illustration(0);
        contractDTO.setStart_time(new Date(0L));
        contractDTO.setEnd_time(new Date(0L));
        contractDTO.setCreate_time(new Date(0L));
        when(mockContractDTORepository.getDetailContractForCustomer(0)).thenReturn(contractDTO);

        // Run the test
        final ContractDTO result = contractServiceUnderTest.getDetailContractForCustomer(0);

        // Verify the results
    }

    @Test
    void testGetDetailContractChange() {
        // Setup

        // Configure ContractChangeHistoryRepository.findById(...).
        final ContractChangeHistory contractChangeHistory1 = new ContractChangeHistory();
        contractChangeHistory1.setId(0);
        contractChangeHistory1.setId_contract(0);
        contractChangeHistory1.setId_customer(0);
        contractChangeHistory1.setCreate_time(new Date(0L));
        contractChangeHistory1.setId_request(0);
        contractChangeHistory1.setName_contract_owner("name_contract_owner");
        contractChangeHistory1.setPayment_period_id(0);
        contractChangeHistory1.setInsurance_type("insurance_type");
        contractChangeHistory1.setId_main_benifitt(0);
        contractChangeHistory1.setId_illustration(0);
        final Optional<ContractChangeHistory> contractChangeHistory = Optional.of(contractChangeHistory1);
        when(mockContractChangeHistoryRepository.findById(0)).thenReturn(contractChangeHistory);

        // Run the test
        final Optional<ContractChangeHistory> result = contractServiceUnderTest.getDetailContractChange(0);

        // Verify the results
    }

    @Test
    void testGetDetailContractChange_ContractChangeHistoryRepositoryReturnsAbsent() {
        // Setup
        when(mockContractChangeHistoryRepository.findById(0)).thenReturn(Optional.empty());

        // Run the test
        final Optional<ContractChangeHistory> result = contractServiceUnderTest.getDetailContractChange(0);

        // Verify the results
    }

    @Test
    void testGetAllContractHistory() {
        // Setup

        // Configure ContractChangeHistoryRepository.getAllContractChange(...).
        final ContractChangeHistory contractChangeHistory = new ContractChangeHistory();
        contractChangeHistory.setId(0);
        contractChangeHistory.setId_contract(0);
        contractChangeHistory.setId_customer(0);
        contractChangeHistory.setCreate_time(new Date(0L));
        contractChangeHistory.setId_request(0);
        contractChangeHistory.setName_contract_owner("name_contract_owner");
        contractChangeHistory.setPayment_period_id(0);
        contractChangeHistory.setInsurance_type("insurance_type");
        contractChangeHistory.setId_main_benifitt(0);
        contractChangeHistory.setId_illustration(0);
        final List<ContractChangeHistory> contractChangeHistories = Arrays.asList(contractChangeHistory);
        when(mockContractChangeHistoryRepository.getAllContractChange(0)).thenReturn(contractChangeHistories);

        // Run the test
        final List<ContractChangeHistory> result = contractServiceUnderTest.getAllContractHistory(0);

        // Verify the results
    }

    @Test
    void testGetAllContractHistory_ContractChangeHistoryRepositoryReturnsNoItems() {
        // Setup
        when(mockContractChangeHistoryRepository.getAllContractChange(0)).thenReturn(Collections.emptyList());

        // Run the test
        final List<ContractChangeHistory> result = contractServiceUnderTest.getAllContractHistory(0);

        // Verify the results
    }

    @Test
    void testGetAllFeePaymentHistory() {
        // Setup

        // Configure FeePaymentHistoryRepository.getAllFeePayment(...).
        final FeePaymentHistory feePaymentHistory = new FeePaymentHistory();
        feePaymentHistory.setId(0);
        feePaymentHistory.setId_contract(0);
        feePaymentHistory.setId_invoice(0);
        feePaymentHistory.setPayment_amount("payment_amount");
        feePaymentHistory.setPayment_method("payment_method");
        feePaymentHistory.setId_collecter(0);
        feePaymentHistory.setCreated_time(new GregorianCalendar(2019, Calendar.JANUARY, 1).getTime());
        final List<FeePaymentHistory> feePaymentHistories = Arrays.asList(feePaymentHistory);
        when(mockFeePaymentHistoryRepository.getAllFeePayment(0)).thenReturn(feePaymentHistories);

        // Run the test
        final List<FeePaymentHistory> result = contractServiceUnderTest.getAllFeePaymentHistory(0);

        // Verify the results
    }

    @Test
    void testGetAllFeePaymentHistory_FeePaymentHistoryRepositoryReturnsNoItems() {
        // Setup
        when(mockFeePaymentHistoryRepository.getAllFeePayment(0)).thenReturn(Collections.emptyList());

        // Run the test
        final List<FeePaymentHistory> result = contractServiceUnderTest.getAllFeePaymentHistory(0);

        // Verify the results
    }

    @Test
    void testGetAllIntersetPaymentHistory() {
        // Setup

        // Configure BenifitPaymentHistoryRepository.getAllIntersetPayment(...).
        final BenifitPaymentHistory benifitPaymentHistory = new BenifitPaymentHistory();
        benifitPaymentHistory.setId(0);
        benifitPaymentHistory.setId_contract(0);
        benifitPaymentHistory.setId_main_benifit(0);
        benifitPaymentHistory.setId_bill_issuer(0);
        benifitPaymentHistory.setId_attachment(0);
        benifitPaymentHistory.setPayment_amount("payment_amount");
        benifitPaymentHistory.setApprove_status("approve_status");
        benifitPaymentHistory.setCreated_time(new GregorianCalendar(2019, Calendar.JANUARY, 1).getTime());
        final List<BenifitPaymentHistory> benifitPaymentHistories = Arrays.asList(benifitPaymentHistory);
        when(mockBenifitPaymentHistoryRepository.getAllIntersetPayment(0)).thenReturn(benifitPaymentHistories);

        // Run the test
        final List<BenifitPaymentHistory> result = contractServiceUnderTest.getAllIntersetPaymentHistory(0);

        // Verify the results
    }

    @Test
    void testGetAllIntersetPaymentHistory_BenifitPaymentHistoryRepositoryReturnsNoItems() {
        // Setup
        when(mockBenifitPaymentHistoryRepository.getAllIntersetPayment(0)).thenReturn(Collections.emptyList());

        // Run the test
        final List<BenifitPaymentHistory> result = contractServiceUnderTest.getAllIntersetPaymentHistory(0);

        // Verify the results
    }

    @Test
    void testSetUpdateContract() {
        // Setup

        // Configure ContractRepository.findById(...).
        final Contract contract1 = new Contract();
        contract1.setId(0);
        contract1.setId_customer(0);
        contract1.setName_contract_owner("name_contract_owner");
        contract1.setPayment_period_id(0);
        contract1.setInsurance_type("insurance_type");
        contract1.setId_main_benifit(0);
        contract1.setId_illustration(0);
        contract1.setStart_time(new Date(0L));
        contract1.setEnd_time(new Date(0L));
        contract1.setCreate_time(new Date(0L));
        final Optional<Contract> contract = Optional.of(contract1);
        when(mockContractRepository.findById(0)).thenReturn(contract);

        // Configure ContractRepository.save(...).
        final Contract contract2 = new Contract();
        contract2.setId(0);
        contract2.setId_customer(0);
        contract2.setName_contract_owner("name_contract_owner");
        contract2.setPayment_period_id(0);
        contract2.setInsurance_type("insurance_type");
        contract2.setId_main_benifit(0);
        contract2.setId_illustration(0);
        contract2.setStart_time(new Date(0L));
        contract2.setEnd_time(new Date(0L));
        contract2.setCreate_time(new Date(0L));
        when(mockContractRepository.save(any(Contract.class))).thenReturn(contract2);

        // Configure RequestRepository.findById(...).
        final Request request1 = new Request();
        request1.setId(0);
        request1.setName("name");
        request1.setId_type(0);
        request1.setDate(new GregorianCalendar(2019, Calendar.JANUARY, 1).getTime());
        request1.setRequestcol(0);
        request1.setCode_sender("code_sender");
        request1.setCode_reciever("code_reciever");
        request1.setDescription("description");
        request1.setPriority("priority");
        request1.setId_contract(0);
        final Optional<Request> request = Optional.of(request1);
        when(mockRequestRepository.findById(0)).thenReturn(request);

        // Configure RequestRepository.save(...).
        final Request request2 = new Request();
        request2.setId(0);
        request2.setName("name");
        request2.setId_type(0);
        request2.setDate(new GregorianCalendar(2019, Calendar.JANUARY, 1).getTime());
        request2.setRequestcol(0);
        request2.setCode_sender("code_sender");
        request2.setCode_reciever("code_reciever");
        request2.setDescription("description");
        request2.setPriority("priority");
        request2.setId_contract(0);
        when(mockRequestRepository.save(any(Request.class))).thenReturn(request2);

        // Run the test
        contractServiceUnderTest.setUpdateContract(0, 0, "description", "approval_status");

        // Verify the results
    }

    @Test
    void testSetUpdateContract_ContractRepositoryFindByIdReturnsAbsent() {
        // Setup
        when(mockContractRepository.findById(0)).thenReturn(Optional.empty());

        // Configure ContractRepository.save(...).
        final Contract contract = new Contract();
        contract.setId(0);
        contract.setId_customer(0);
        contract.setName_contract_owner("name_contract_owner");
        contract.setPayment_period_id(0);
        contract.setInsurance_type("insurance_type");
        contract.setId_main_benifit(0);
        contract.setId_illustration(0);
        contract.setStart_time(new Date(0L));
        contract.setEnd_time(new Date(0L));
        contract.setCreate_time(new Date(0L));
        when(mockContractRepository.save(any(Contract.class))).thenReturn(contract);

        // Configure RequestRepository.findById(...).
        final Request request1 = new Request();
        request1.setId(0);
        request1.setName("name");
        request1.setId_type(0);
        request1.setDate(new GregorianCalendar(2019, Calendar.JANUARY, 1).getTime());
        request1.setRequestcol(0);
        request1.setCode_sender("code_sender");
        request1.setCode_reciever("code_reciever");
        request1.setDescription("description");
        request1.setPriority("priority");
        request1.setId_contract(0);
        final Optional<Request> request = Optional.of(request1);
        when(mockRequestRepository.findById(0)).thenReturn(request);

        // Configure RequestRepository.save(...).
        final Request request2 = new Request();
        request2.setId(0);
        request2.setName("name");
        request2.setId_type(0);
        request2.setDate(new GregorianCalendar(2019, Calendar.JANUARY, 1).getTime());
        request2.setRequestcol(0);
        request2.setCode_sender("code_sender");
        request2.setCode_reciever("code_reciever");
        request2.setDescription("description");
        request2.setPriority("priority");
        request2.setId_contract(0);
        when(mockRequestRepository.save(any(Request.class))).thenReturn(request2);

        // Run the test
        contractServiceUnderTest.setUpdateContract(0, 0, "description", "approval_status");

        // Verify the results
    }

    @Test
    void testSetUpdateContract_RequestRepositoryFindByIdReturnsAbsent() {
        // Setup

        // Configure ContractRepository.findById(...).
        final Contract contract1 = new Contract();
        contract1.setId(0);
        contract1.setId_customer(0);
        contract1.setName_contract_owner("name_contract_owner");
        contract1.setPayment_period_id(0);
        contract1.setInsurance_type("insurance_type");
        contract1.setId_main_benifit(0);
        contract1.setId_illustration(0);
        contract1.setStart_time(new Date(0L));
        contract1.setEnd_time(new Date(0L));
        contract1.setCreate_time(new Date(0L));
        final Optional<Contract> contract = Optional.of(contract1);
        when(mockContractRepository.findById(0)).thenReturn(contract);

        // Configure ContractRepository.save(...).
        final Contract contract2 = new Contract();
        contract2.setId(0);
        contract2.setId_customer(0);
        contract2.setName_contract_owner("name_contract_owner");
        contract2.setPayment_period_id(0);
        contract2.setInsurance_type("insurance_type");
        contract2.setId_main_benifit(0);
        contract2.setId_illustration(0);
        contract2.setStart_time(new Date(0L));
        contract2.setEnd_time(new Date(0L));
        contract2.setCreate_time(new Date(0L));
        when(mockContractRepository.save(any(Contract.class))).thenReturn(contract2);

        when(mockRequestRepository.findById(0)).thenReturn(Optional.empty());

        // Configure RequestRepository.save(...).
        final Request request = new Request();
        request.setId(0);
        request.setName("name");
        request.setId_type(0);
        request.setDate(new GregorianCalendar(2019, Calendar.JANUARY, 1).getTime());
        request.setRequestcol(0);
        request.setCode_sender("code_sender");
        request.setCode_reciever("code_reciever");
        request.setDescription("description");
        request.setPriority("priority");
        request.setId_contract(0);
        when(mockRequestRepository.save(any(Request.class))).thenReturn(request);

        // Run the test
        contractServiceUnderTest.setUpdateContract(0, 0, "description", "approval_status");

        // Verify the results
    }

    @Test
    void testUpdateContract() {
        // Setup
        final Contract cont = new Contract();
        cont.setId(0);
        cont.setId_customer(0);
        cont.setName_contract_owner("name_contract_owner");
        cont.setPayment_period_id(0);
        cont.setInsurance_type("insurance_type");
        cont.setId_main_benifit(0);
        cont.setId_illustration(0);
        cont.setStart_time(new Date(0L));
        cont.setEnd_time(new Date(0L));
        cont.setCreate_time(new Date(0L));

        // Configure ContractRepository.findById(...).
        final Contract contract1 = new Contract();
        contract1.setId(0);
        contract1.setId_customer(0);
        contract1.setName_contract_owner("name_contract_owner");
        contract1.setPayment_period_id(0);
        contract1.setInsurance_type("insurance_type");
        contract1.setId_main_benifit(0);
        contract1.setId_illustration(0);
        contract1.setStart_time(new Date(0L));
        contract1.setEnd_time(new Date(0L));
        contract1.setCreate_time(new Date(0L));
        final Optional<Contract> contract = Optional.of(contract1);
        when(mockContractRepository.findById(0)).thenReturn(contract);

        // Configure ContractChangeHistoryRepository.save(...).
        final ContractChangeHistory contractChangeHistory = new ContractChangeHistory();
        contractChangeHistory.setId(0);
        contractChangeHistory.setId_contract(0);
        contractChangeHistory.setId_customer(0);
        contractChangeHistory.setCreate_time(new Date(0L));
        contractChangeHistory.setId_request(0);
        contractChangeHistory.setName_contract_owner("name_contract_owner");
        contractChangeHistory.setPayment_period_id(0);
        contractChangeHistory.setInsurance_type("insurance_type");
        contractChangeHistory.setId_main_benifitt(0);
        contractChangeHistory.setId_illustration(0);
        when(mockContractChangeHistoryRepository.save(any(ContractChangeHistory.class))).thenReturn(contractChangeHistory);

        // Run the test
        contractServiceUnderTest.updateContract(cont);

        // Verify the results
    }

    @Test
    void testUpdateContract_ContractRepositoryReturnsAbsent() {
        // Setup
        final Contract cont = new Contract();
        cont.setId(0);
        cont.setId_customer(0);
        cont.setName_contract_owner("name_contract_owner");
        cont.setPayment_period_id(0);
        cont.setInsurance_type("insurance_type");
        cont.setId_main_benifit(0);
        cont.setId_illustration(0);
        cont.setStart_time(new Date(0L));
        cont.setEnd_time(new Date(0L));
        cont.setCreate_time(new Date(0L));

        when(mockContractRepository.findById(0)).thenReturn(Optional.empty());

        // Configure ContractChangeHistoryRepository.save(...).
        final ContractChangeHistory contractChangeHistory = new ContractChangeHistory();
        contractChangeHistory.setId(0);
        contractChangeHistory.setId_contract(0);
        contractChangeHistory.setId_customer(0);
        contractChangeHistory.setCreate_time(new Date(0L));
        contractChangeHistory.setId_request(0);
        contractChangeHistory.setName_contract_owner("name_contract_owner");
        contractChangeHistory.setPayment_period_id(0);
        contractChangeHistory.setInsurance_type("insurance_type");
        contractChangeHistory.setId_main_benifitt(0);
        contractChangeHistory.setId_illustration(0);
        when(mockContractChangeHistoryRepository.save(any(ContractChangeHistory.class))).thenReturn(contractChangeHistory);

        // Run the test
        contractServiceUnderTest.updateContract(cont);

        // Verify the results
    }
}
