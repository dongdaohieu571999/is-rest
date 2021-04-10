package com.is.issystem.service;

import com.is.issystem.entities.EmployeeAcc;
import com.is.issystem.repository.EmployeeAccRepository;
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

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
class EmployeeAccServiceTest {

    @Mock
    private EmployeeAccRepository mockEmployeeAccRepository;

    @InjectMocks
    private EmployeeAccService employeeAccServiceUnderTest;

    @Test
    void testFindAll() {
        // Setup

        // Run the test
        final List<EmployeeAcc> result = employeeAccServiceUnderTest.findAll();

        // Verify the results
        Assert.assertNotNull(result);
    }

    @Test
    void testFindAll_EmployeeAccRepositoryReturnsNoItems() {
        // Setup
        when(mockEmployeeAccRepository.findAll()).thenReturn(Collections.emptyList());

        // Run the test
        final List<EmployeeAcc> result = employeeAccServiceUnderTest.findAll();

        // Verify the results
    }

    //addEmployeeAccount missing return boolean
    @Test
    void testAddEmployeeAccount() {
        // Setup
        final EmployeeAcc employee_acc = new EmployeeAcc();
        employee_acc.setId_role(0);
        employee_acc.setId(0);
        employee_acc.setCode("code");
        employee_acc.setPass("pass");
        employee_acc.setStatus(false);

        // Configure EmployeeAccRepository.save(...).
        final EmployeeAcc employeeAcc = new EmployeeAcc();
        employeeAcc.setId_role(0);
        employeeAcc.setId(0);
        employeeAcc.setCode("code");
        employeeAcc.setPass("pass");
        employeeAcc.setStatus(false);
//        when(mockEmployeeAccRepository.save(any(EmployeeAcc.class))).thenReturn(employeeAcc);

        // Run the test
//        employeeAccServiceUnderTest.addEmployeeAccount(employee_acc);

        // Verify the results
    }

    @Test
    void testFindEmployeeAccountByID() {
        // Setup

        // Configure EmployeeAccRepository.findById(...).
        final EmployeeAcc employeeAcc1 = new EmployeeAcc();
        employeeAcc1.setId_role(1);
        employeeAcc1.setId(59);
        employeeAcc1.setCode("manh");
        employeeAcc1.setPass("manh");
        employeeAcc1.setStatus(true);
        final Optional<EmployeeAcc> employeeAcc = Optional.of(employeeAcc1);
        when(mockEmployeeAccRepository.findById(59)).thenReturn(employeeAcc);

        // Run the test
        final Optional<EmployeeAcc> result = employeeAccServiceUnderTest.findEmployeeAccountByID(59);

        // Verify the results
        Assert.assertEquals(employeeAcc, result);
    }

    @Test
    void testFindEmployeeAccountByID01() {
        // Setup

        // Configure EmployeeAccRepository.findById(...).
        final EmployeeAcc employeeAcc1 = new EmployeeAcc();
        employeeAcc1.setId_role(1);
        employeeAcc1.setId(59);
        employeeAcc1.setCode("manh");
        employeeAcc1.setPass("123");
        employeeAcc1.setStatus(true);
        final Optional<EmployeeAcc> employeeAcc = Optional.of(employeeAcc1);
        when(mockEmployeeAccRepository.findById(59)).thenReturn(employeeAcc);

        // Run the test
        final Optional<EmployeeAcc> result = employeeAccServiceUnderTest.findEmployeeAccountByID(59);

        // Verify the results
        Assert.assertEquals(employeeAcc, result);
    }

    @Test
    void testFindEmployeeAccountByID_EmployeeAccRepositoryReturnsAbsent() {
        // Setup
        when(mockEmployeeAccRepository.findById(0)).thenReturn(Optional.empty());

        // Run the test
        final Optional<EmployeeAcc> result = employeeAccServiceUnderTest.findEmployeeAccountByID(0);

        // Verify the results
    }

    @Test
    void testFindEmployeeAccountByCode() {
        // Setup
        when(mockEmployeeAccRepository.getOneAcc("code")).thenReturn("result");

        // Run the test
        final EmployeeAcc result = employeeAccServiceUnderTest.findEmployeeAccountByCode("token_id");

        // Verify the results
    }

    @Test
    void testUpdateEmployeeAccount() {
        // Setup
        final EmployeeAcc employee_acc = new EmployeeAcc();
        employee_acc.setId_role(0);
        employee_acc.setId(0);
        employee_acc.setCode("code");
        employee_acc.setPass("pass");
        employee_acc.setStatus(false);

        // Configure EmployeeAccRepository.findById(...).
        final EmployeeAcc employeeAcc1 = new EmployeeAcc();
        employeeAcc1.setId_role(0);
        employeeAcc1.setId(0);
        employeeAcc1.setCode("code");
        employeeAcc1.setPass("pass");
        employeeAcc1.setStatus(false);
        final Optional<EmployeeAcc> employeeAcc = Optional.of(employeeAcc1);
        when(mockEmployeeAccRepository.findById(0)).thenReturn(employeeAcc);

        // Configure EmployeeAccRepository.save(...).
        final EmployeeAcc employeeAcc2 = new EmployeeAcc();
        employeeAcc2.setId_role(0);
        employeeAcc2.setId(0);
        employeeAcc2.setCode("code");
        employeeAcc2.setPass("pass");
        employeeAcc2.setStatus(false);
        when(mockEmployeeAccRepository.save(any(EmployeeAcc.class))).thenReturn(employeeAcc2);

        // Run the test
        final EmployeeAcc result = employeeAccServiceUnderTest.updateEmployeeAccount(employee_acc);

        // Verify the results
    }

    @Test
    void testUpdateEmployeeAccount_EmployeeAccRepositoryFindByIdReturnsAbsent() {
        // Setup
        final EmployeeAcc employee_acc = new EmployeeAcc();
        employee_acc.setId_role(0);
        employee_acc.setId(0);
        employee_acc.setCode("code");
        employee_acc.setPass("pass");
        employee_acc.setStatus(false);

        when(mockEmployeeAccRepository.findById(0)).thenReturn(Optional.empty());

        // Configure EmployeeAccRepository.save(...).
        final EmployeeAcc employeeAcc = new EmployeeAcc();
        employeeAcc.setId_role(0);
        employeeAcc.setId(0);
        employeeAcc.setCode("code");
        employeeAcc.setPass("pass");
        employeeAcc.setStatus(false);
        when(mockEmployeeAccRepository.save(any(EmployeeAcc.class))).thenReturn(employeeAcc);

        // Run the test
        final EmployeeAcc result = employeeAccServiceUnderTest.updateEmployeeAccount(employee_acc);

        // Verify the results
    }

    @Test
    void testCheckExistEmployeeAccount() {
        // Setup
        final EmployeeAcc employee_acc = new EmployeeAcc();
        employee_acc.setId_role(1);
        employee_acc.setId(59);
        employee_acc.setCode("manh");
        employee_acc.setPass("manh");
        employee_acc.setStatus(true);

        when(mockEmployeeAccRepository.existsById(59)).thenReturn(true);

        // Run the test
        final boolean result = employeeAccServiceUnderTest.checkExistEmployeeAccount(employee_acc);

        // Verify the results
        assertTrue(result);
    }

    @Test
    void testCheckExistEmployeeAccount01() {
        // Setup
        final EmployeeAcc employee_acc = new EmployeeAcc();
        employee_acc.setId_role(1);
        employee_acc.setId(100);
        employee_acc.setCode("manh");
        employee_acc.setPass("manh");
        employee_acc.setStatus(true);

        when(mockEmployeeAccRepository.existsById(100)).thenReturn(false);

        // Run the test
        final boolean result = employeeAccServiceUnderTest.checkExistEmployeeAccount(employee_acc);

        // Verify the results
        assertFalse(result);
    }
}
