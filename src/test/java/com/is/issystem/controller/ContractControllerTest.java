package com.is.issystem.controller;

<<<<<<< HEAD
import com.is.issystem.dto.ContractDTO;
import com.is.issystem.entities.Contract;
import com.is.issystem.service.ContractService;
import org.junit.Assert;
=======
import com.is.issystem.entities.Contract;
import com.is.issystem.entities.ContractChangeHistory;
import com.is.issystem.entities.FeePaymentHistory;
import com.is.issystem.entities.IntersetPaymentHistory;
import com.is.issystem.repository.entity_repository.ContractRepository;
import com.is.issystem.service.ContractService;
>>>>>>> hieu
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
<<<<<<< HEAD
import org.mockito.Mockito;
=======
>>>>>>> hieu
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.http.ResponseEntity;

import java.sql.Date;
<<<<<<< HEAD
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

=======
import java.time.LocalDate;
import java.util.*;

import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.verify;
>>>>>>> hieu
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
class ContractControllerTest {

    @Mock
    private ContractService mockContractService;
<<<<<<< HEAD
=======
    @Mock
    private ContractRepository mockContractRepository;
>>>>>>> hieu

    @InjectMocks
    private ContractController contractControllerUnderTest;

    @Test
<<<<<<< HEAD
=======
    void testSetActiveContract() {
        // Setup

        // Run the test
        final ResponseEntity<?> result = contractControllerUnderTest.setActiveContract("data1");

        // Verify the results
        verify(mockContractService).setUpdateContract(0, 0, "description", "approval_status");
    }

    @Test
>>>>>>> hieu
    void testAddContract() {
        // Setup
        final Contract contract = new Contract();
        contract.setId(0);
        contract.setId_customer(0);
        contract.setName_contract_owner("name_contract_owner");
<<<<<<< HEAD
        contract.setPayment_period("payment_period");
        contract.setInsurance_type("insurance_type");
        contract.setId_main_interest(0);
        contract.setId_illustration(0);
        contract.setStart_time(new Date(0L));
        contract.setEnd_time(new Date(0L));
        contract.setDate_next_payment(new Date(0L));
=======
        contract.setPayment_period_id(0);
        contract.setInsurance_type("insurance_type");
        contract.setId_main_interest(0);
        contract.setId_illustration(0);
        contract.setStart_time(Date.valueOf(LocalDate.of(2020, 1, 1)));
        contract.setEnd_time(Date.valueOf(LocalDate.of(2020, 1, 1)));
        contract.setCreate_time(Date.valueOf(LocalDate.of(2020, 1, 1)));

        // Configure ContractRepository.save(...).
        final Contract contract1 = new Contract();
        contract1.setId(0);
        contract1.setId_customer(0);
        contract1.setName_contract_owner("name_contract_owner");
        contract1.setPayment_period_id(0);
        contract1.setInsurance_type("insurance_type");
        contract1.setId_main_interest(0);
        contract1.setId_illustration(0);
        contract1.setStart_time(Date.valueOf(LocalDate.of(2020, 1, 1)));
        contract1.setEnd_time(Date.valueOf(LocalDate.of(2020, 1, 1)));
        contract1.setCreate_time(Date.valueOf(LocalDate.of(2020, 1, 1)));
        when(mockContractRepository.save(any(Contract.class))).thenReturn(contract1);
>>>>>>> hieu

        // Run the test
        final ResponseEntity<?> result = contractControllerUnderTest.addContract(contract);

        // Verify the results
    }

    @Test
<<<<<<< HEAD
    void testGetAllContract() {
        // Setup

        // Run the test
        final List<ContractDTO> result = contractControllerUnderTest.getAllContract();

        // Verify the results
        Assert.assertNotNull(result);
=======
    void testEditContract() {
        // Setup
        final Contract contract = new Contract();
        contract.setId(0);
        contract.setId_customer(0);
        contract.setName_contract_owner("name_contract_owner");
        contract.setPayment_period_id(0);
        contract.setInsurance_type("insurance_type");
        contract.setId_main_interest(0);
        contract.setId_illustration(0);
        contract.setStart_time(Date.valueOf(LocalDate.of(2020, 1, 1)));
        contract.setEnd_time(Date.valueOf(LocalDate.of(2020, 1, 1)));
        contract.setCreate_time(Date.valueOf(LocalDate.of(2020, 1, 1)));

        // Run the test
        final ResponseEntity<?> result = contractControllerUnderTest.editContract(contract);

        // Verify the results
        verify(mockContractService).updateContract(any(Contract.class));
    }

    @Test
    void testGetAllContract() {
        // Setup

        // Configure ContractService.getAllContract(...).
        final Contract contract = new Contract();
        contract.setId(0);
        contract.setId_customer(0);
        contract.setName_contract_owner("name_contract_owner");
        contract.setPayment_period_id(0);
        contract.setInsurance_type("insurance_type");
        contract.setId_main_interest(0);
        contract.setId_illustration(0);
        contract.setStart_time(Date.valueOf(LocalDate.of(2020, 1, 1)));
        contract.setEnd_time(Date.valueOf(LocalDate.of(2020, 1, 1)));
        contract.setCreate_time(Date.valueOf(LocalDate.of(2020, 1, 1)));
        final List<Contract> contracts = Arrays.asList(contract);
        when(mockContractService.getAllContract("code_em_support")).thenReturn(contracts);

        // Run the test
        final List<Contract> result = contractControllerUnderTest.getAllContract("code_em_support");

        // Verify the results
>>>>>>> hieu
    }

    @Test
    void testGetAllContract_ContractServiceReturnsNoItems() {
        // Setup
<<<<<<< HEAD
        when(mockContractService.getAllContract()).thenReturn(Collections.emptyList());

        // Run the test
        final List<ContractDTO> result = contractControllerUnderTest.getAllContract();

        // Verify the results
        Assert.assertNull(result);
=======
        when(mockContractService.getAllContract("code_em_support")).thenReturn(Collections.emptyList());

        // Run the test
        final List<Contract> result = contractControllerUnderTest.getAllContract("code_em_support");

        // Verify the results
    }

    @Test
    void testGetAllContractHistory() {
        // Setup

        // Configure ContractService.getAllContractHistory(...).
        final ContractChangeHistory contractChangeHistory = new ContractChangeHistory();
        contractChangeHistory.setId(0);
        contractChangeHistory.setId_contract(0);
        contractChangeHistory.setId_customer(0);
        contractChangeHistory.setCreate_time(Date.valueOf(LocalDate.of(2020, 1, 1)));
        contractChangeHistory.setId_request(0);
        contractChangeHistory.setName_contract_owner("name_contract_owner");
        contractChangeHistory.setPayment_period_id(0);
        contractChangeHistory.setInsurance_type("insurance_type");
        contractChangeHistory.setId_main_interest(0);
        contractChangeHistory.setId_illustration(0);
        final List<ContractChangeHistory> contractChangeHistories = Arrays.asList(contractChangeHistory);
        when(mockContractService.getAllContractHistory(0)).thenReturn(contractChangeHistories);

        // Run the test
        final List<ContractChangeHistory> result = contractControllerUnderTest.getAllContractHistory(0);

        // Verify the results
    }

    @Test
    void testGetAllContractHistory_ContractServiceReturnsNoItems() {
        // Setup
        when(mockContractService.getAllContractHistory(0)).thenReturn(Collections.emptyList());

        // Run the test
        final List<ContractChangeHistory> result = contractControllerUnderTest.getAllContractHistory(0);

        // Verify the results
    }

    @Test
    void testGetAllFeePaymentHistory() {
        // Setup

        // Configure ContractService.getAllFeePaymentHistory(...).
        final FeePaymentHistory feePaymentHistory = new FeePaymentHistory();
        feePaymentHistory.setId(0);
        feePaymentHistory.setId_contract(0);
        feePaymentHistory.setId_invoice(0);
        feePaymentHistory.setPayment_amount("payment_amount");
        feePaymentHistory.setPayment_method("payment_method");
        feePaymentHistory.setId_collecter(0);
        feePaymentHistory.setCreated_time(new GregorianCalendar(2020, Calendar.JANUARY, 1).getTime());
        final List<FeePaymentHistory> feePaymentHistories = Arrays.asList(feePaymentHistory);
        when(mockContractService.getAllFeePaymentHistory(0)).thenReturn(feePaymentHistories);

        // Run the test
        final List<FeePaymentHistory> result = contractControllerUnderTest.getAllFeePaymentHistory(0);

        // Verify the results
    }

    @Test
    void testGetAllFeePaymentHistory_ContractServiceReturnsNoItems() {
        // Setup
        when(mockContractService.getAllFeePaymentHistory(0)).thenReturn(Collections.emptyList());

        // Run the test
        final List<FeePaymentHistory> result = contractControllerUnderTest.getAllFeePaymentHistory(0);

        // Verify the results
    }

    @Test
    void testGetAllIntersetPaymentHistory() {
        // Setup

        // Configure ContractService.getAllIntersetPaymentHistory(...).
        final IntersetPaymentHistory intersetPaymentHistory = new IntersetPaymentHistory();
        intersetPaymentHistory.setApprove_status("approve_status");
        intersetPaymentHistory.setId(0);
        intersetPaymentHistory.setId_contract(0);
        intersetPaymentHistory.setId_main_interest(0);
        intersetPaymentHistory.setId_bill_issuer(0);
        intersetPaymentHistory.setId_attachment(0);
        intersetPaymentHistory.setPayment_amount("payment_amount");
        intersetPaymentHistory.setCreated_time(new GregorianCalendar(2020, Calendar.JANUARY, 1).getTime());
        final List<IntersetPaymentHistory> intersetPaymentHistories = Arrays.asList(intersetPaymentHistory);
        when(mockContractService.getAllIntersetPaymentHistory(0)).thenReturn(intersetPaymentHistories);

        // Run the test
        final List<IntersetPaymentHistory> result = contractControllerUnderTest.getAllIntersetPaymentHistory(0);

        // Verify the results
    }

    @Test
    void testGetAllIntersetPaymentHistory_ContractServiceReturnsNoItems() {
        // Setup
        when(mockContractService.getAllIntersetPaymentHistory(0)).thenReturn(Collections.emptyList());

        // Run the test
        final List<IntersetPaymentHistory> result = contractControllerUnderTest.getAllIntersetPaymentHistory(0);

        // Verify the results
>>>>>>> hieu
    }

    @Test
    void testGetDetailContract() {
        // Setup

        // Configure ContractService.getDetailContract(...).
<<<<<<< HEAD
        final ContractDTO contractDTO = new ContractDTO();
        when(mockContractService.getDetailContract(3)).thenReturn(contractDTO);

        // Run the test
        final ContractDTO result = contractControllerUnderTest.getDetailContract(3);

        // Verify the results
        Assert.assertNotNull(result);
        Assert.assertEquals(contractDTO, result);
=======
        final Contract contract = new Contract();
        contract.setId(0);
        contract.setId_customer(0);
        contract.setName_contract_owner("name_contract_owner");
        contract.setPayment_period_id(0);
        contract.setInsurance_type("insurance_type");
        contract.setId_main_interest(0);
        contract.setId_illustration(0);
        contract.setStart_time(Date.valueOf(LocalDate.of(2020, 1, 1)));
        contract.setEnd_time(Date.valueOf(LocalDate.of(2020, 1, 1)));
        contract.setCreate_time(Date.valueOf(LocalDate.of(2020, 1, 1)));
        when(mockContractService.getDetailContract(0)).thenReturn(contract);

        // Run the test
        final Contract result = contractControllerUnderTest.getDetailContract(0);

        // Verify the results
    }

    @Test
    void testGetDetailContractChange() {
        // Setup

        // Configure ContractService.getDetailContractChange(...).
        final ContractChangeHistory contractChangeHistory1 = new ContractChangeHistory();
        contractChangeHistory1.setId(0);
        contractChangeHistory1.setId_contract(0);
        contractChangeHistory1.setId_customer(0);
        contractChangeHistory1.setCreate_time(Date.valueOf(LocalDate.of(2020, 1, 1)));
        contractChangeHistory1.setId_request(0);
        contractChangeHistory1.setName_contract_owner("name_contract_owner");
        contractChangeHistory1.setPayment_period_id(0);
        contractChangeHistory1.setInsurance_type("insurance_type");
        contractChangeHistory1.setId_main_interest(0);
        contractChangeHistory1.setId_illustration(0);
        final Optional<ContractChangeHistory> contractChangeHistory = Optional.of(contractChangeHistory1);
        when(mockContractService.getDetailContractChange(0)).thenReturn(contractChangeHistory);

        // Run the test
        final Optional<ContractChangeHistory> result = contractControllerUnderTest.getDetailContractChange(0);

        // Verify the results
    }

    @Test
    void testGetDetailContractChange_ContractServiceReturnsAbsent() {
        // Setup
        when(mockContractService.getDetailContractChange(0)).thenReturn(Optional.empty());

        // Run the test
        final Optional<ContractChangeHistory> result = contractControllerUnderTest.getDetailContractChange(0);

        // Verify the results
>>>>>>> hieu
    }
}
