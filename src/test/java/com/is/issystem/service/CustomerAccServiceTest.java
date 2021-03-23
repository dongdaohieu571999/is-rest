package com.is.issystem.service;

import com.is.issystem.entities.CustomerAcc;
import com.is.issystem.repository.CustomerAccRepository;
import org.junit.Assert;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
class CustomerAccServiceTest {

    @Mock
    private CustomerAccRepository mockCustomerInfoRepository;

    @InjectMocks
    private CustomerAccService customerAccServiceUnderTest;

    @Test
    void testFindAll() {
        // Setup

        // Configure CustomerAccRepository.findAll(...).
//        final CustomerAcc customerAcc = new CustomerAcc();
//        customerAcc.setId(0);
//        customerAcc.setCode("code");
//        customerAcc.setPass("pass");
//        customerAcc.setStatus(false);
//        final List<CustomerAcc> customerAccs = Arrays.asList(customerAcc);
//        when(mockCustomerInfoRepository.findAll()).thenReturn(customerAccs);

        // Run the test
        final List<CustomerAcc> result = customerAccServiceUnderTest.findAll();

        // Verify the results
        Assert.assertNotNull(result);
    }

    @Test
    void testFindAll_CustomerAccRepositoryReturnsNoItems() {
        // Setup
        when(mockCustomerInfoRepository.findAll()).thenReturn(Collections.emptyList());

        // Run the test
        final List<CustomerAcc> result = customerAccServiceUnderTest.findAll();

        // Verify the results
        Assert.assertNull(result);
    }

    //addCustomerAccount missing return boolean
    @Test
    void testAddCustomerAccount() {
        // Setup
        final CustomerAcc customerAcc = new CustomerAcc();
        customerAcc.setId(0);
        customerAcc.setCode("code");
        customerAcc.setPass("pass");
        customerAcc.setStatus(false);

        // Configure CustomerAccRepository.save(...).
        final CustomerAcc customerAcc1 = new CustomerAcc();
        customerAcc1.setId(0);
        customerAcc1.setCode("code");
        customerAcc1.setPass("pass");
        customerAcc1.setStatus(false);
        when(mockCustomerInfoRepository.save(any(CustomerAcc.class))).thenReturn(customerAcc1);

        // Run the test
        customerAccServiceUnderTest.addCustomerAccount(customerAcc);

        // Verify the results
    }

    //findCustomerAccountById missing return object
    @Test
    void testFindCustomerAccountById() {
        // Setup

        // Configure CustomerAccRepository.findById(...).
        final CustomerAcc customerAcc1 = new CustomerAcc();
        customerAcc1.setId(0);
        customerAcc1.setCode("code");
        customerAcc1.setPass("pass");
        customerAcc1.setStatus(false);
        final Optional<CustomerAcc> customerAcc = Optional.of(customerAcc1);
        when(mockCustomerInfoRepository.findById(0)).thenReturn(customerAcc);

        // Run the test
        customerAccServiceUnderTest.findCustomerAccountById(0);

        // Verify the results
    }

    @Test
    void testFindCustomerAccountById_CustomerAccRepositoryReturnsAbsent() {
        // Setup
        when(mockCustomerInfoRepository.findById(0)).thenReturn(Optional.empty());

        // Run the test
        customerAccServiceUnderTest.findCustomerAccountById(0);

        // Verify the results
    }

    @Test
    void testCheckExistCustomerAccount() {
        // Setup
        final CustomerAcc customerAcc = new CustomerAcc();
        customerAcc.setId(59);
        customerAcc.setCode("manh");
        customerAcc.setPass("manh");
        customerAcc.setStatus(false);

//        when(mockCustomerInfoRepository.getIdExist("manh")).thenReturn("59");

        // Run the test
        final boolean result = customerAccServiceUnderTest.checkExistCustomerAccount(customerAcc);

        // Verify the results
        assertTrue(result);
    }

    @Test
    void testCheckExistCustomerAccount01() {
        // Setup
        final CustomerAcc customerAcc = new CustomerAcc();
        customerAcc.setId(59);
        customerAcc.setCode("manh");
        customerAcc.setPass("123");
        customerAcc.setStatus(false);

//        when(mockCustomerInfoRepository.getIdExist("manh")).thenReturn("manh");

        // Run the test
        final boolean result = customerAccServiceUnderTest.checkExistCustomerAccount(customerAcc);

        // Verify the results
        assertTrue(result);
    }
}
