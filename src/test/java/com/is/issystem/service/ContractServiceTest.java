package com.is.issystem.service;

import com.is.issystem.dto.ContractDTO;
import com.is.issystem.repository.ContractDTORepository;
import org.junit.Assert;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.sql.Date;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static org.mockito.ArgumentMatchers.isNull;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
class ContractServiceTest {

    @Mock
    private ContractDTORepository mockContractDTORepository;

    @InjectMocks
    private ContractService contractServiceUnderTest;

    @Test
    void testGetAllContract() {
        // Setup

        // Run the test
        final List<ContractDTO> result = contractServiceUnderTest.getAllContract();

        // Verify the results
        Assert.assertNotNull(result);
        System.out.println(result.toString());
    }

    @Test
    void testGetAllContract_ContractDTORepositoryReturnsNoItems() {
        // Setup
        when(mockContractDTORepository.getAllContract()).thenReturn(Collections.emptyList());

        // Run the test
        final List<ContractDTO> result = contractServiceUnderTest.getAllContract();

        // Verify the results
        Assert.assertNull(result);
    }

    //missing description column in contract table
    @Test
    void testGetDetailContract() {
        // Setup

        // Configure ContractDTORepository.getDetailContract(...).
        final ContractDTO contractDTO = new ContractDTO();
        contractDTO.setPayment_amount_interset("payment_amount_interset");
        contractDTO.setPayment_amount_fee("payment_amount_fee");
        contractDTO.setId(0);
        contractDTO.setId_customer(0);
        contractDTO.setName_contract_owner("name_contract_owner");
        contractDTO.setPayment_period("payment_period");
        contractDTO.setInsurance_type("insurance_type");
        contractDTO.setId_main_interest(0);
        contractDTO.setId_illustration(0);
        contractDTO.setStart_time(new Date(0L));
        when(mockContractDTORepository.getDetailContract(isNull())).thenReturn(contractDTO);

        // Run the test
        final ContractDTO result = contractServiceUnderTest.getDetailContract(isNull());

        // Verify the results
        Assert.assertEquals(contractDTO, result);
    }
}
