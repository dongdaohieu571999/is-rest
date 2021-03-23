package com.is.issystem.controller;

import com.is.issystem.dto.ContractDTO;
import com.is.issystem.entities.Contract;
import com.is.issystem.service.ContractService;
import org.junit.Assert;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.http.ResponseEntity;

import java.sql.Date;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
class ContractControllerTest {

    @Mock
    private ContractService mockContractService;

    @InjectMocks
    private ContractController contractControllerUnderTest;

    @Test
    void testAddContract() {
        // Setup
        final Contract contract = new Contract();
        contract.setId(0);
        contract.setId_customer(0);
        contract.setName_contract_owner("name_contract_owner");
        contract.setPayment_period("payment_period");
        contract.setInsurance_type("insurance_type");
        contract.setId_main_interest(0);
        contract.setId_illustration(0);
        contract.setStart_time(new Date(0L));
        contract.setEnd_time(new Date(0L));
        contract.setDate_next_payment(new Date(0L));

        // Run the test
        final ResponseEntity<?> result = contractControllerUnderTest.addContract(contract);

        // Verify the results
    }

    @Test
    void testGetAllContract() {
        // Setup

        // Run the test
        final List<ContractDTO> result = contractControllerUnderTest.getAllContract();

        // Verify the results
        Assert.assertNotNull(result);
    }

    @Test
    void testGetAllContract_ContractServiceReturnsNoItems() {
        // Setup
        when(mockContractService.getAllContract()).thenReturn(Collections.emptyList());

        // Run the test
        final List<ContractDTO> result = contractControllerUnderTest.getAllContract();

        // Verify the results
        Assert.assertNull(result);
    }

    @Test
    void testGetDetailContract() {
        // Setup

        // Configure ContractService.getDetailContract(...).
        final ContractDTO contractDTO = new ContractDTO();
        when(mockContractService.getDetailContract(3)).thenReturn(contractDTO);

        // Run the test
        final ContractDTO result = contractControllerUnderTest.getDetailContract(3);

        // Verify the results
        Assert.assertNotNull(result);
        Assert.assertEquals(contractDTO, result);
    }
}
