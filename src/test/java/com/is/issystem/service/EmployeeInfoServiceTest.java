package com.is.issystem.service;

import com.is.issystem.dto.EmployeeDTO;
import com.is.issystem.entities.EmployeeInfo;
import com.is.issystem.repository.EmployeeInfoAccRepository;
import com.is.issystem.repository.EmployeeInfoRepository;
import org.junit.Assert;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.*;

import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
class EmployeeInfoServiceTest {

    @Mock
    private EmployeeInfoRepository mockEmployeeInfoRepository;
    @Mock
    private EmployeeInfoAccRepository mockEmployeeInfoAccRepository;

    @InjectMocks
    private EmployeeInfoService employeeInfoServiceUnderTest;

    @Test
    void testFindAll() {
        // Setup

        // Run the test
        final List<EmployeeInfo> result = employeeInfoServiceUnderTest.findAll();

        // Verify the results
        Assert.assertNotNull(result);
    }

    @Test
    void testFindAll_EmployeeInfoRepositoryReturnsNoItems() {
        // Setup
        when(mockEmployeeInfoRepository.findAll()).thenReturn(Collections.emptyList());

        // Run the test
        final List<EmployeeInfo> result = employeeInfoServiceUnderTest.findAll();

        // Verify the results
    }

    @Test
    void testAddEmployeeInfo() {
        // Setup
        final EmployeeInfo employee_info = new EmployeeInfo();
        employee_info.setId(0);
        employee_info.setName("name");
        employee_info.setAddress("address");
        employee_info.setDate_of_birth(new GregorianCalendar(2019, Calendar.JANUARY, 1).getTime());
        employee_info.setEmail("email");
        employee_info.setPhone("phone");
        employee_info.setID_card("ID_card");
        employee_info.setId_certificate(0);
        employee_info.setStart_time(new GregorianCalendar(2019, Calendar.JANUARY, 1).getTime());
        employee_info.setEnd_time(new GregorianCalendar(2019, Calendar.JANUARY, 1).getTime());

        // Configure EmployeeInfoRepository.save(...).
        final EmployeeInfo employeeInfo = new EmployeeInfo();
        employeeInfo.setId(0);
        employeeInfo.setName("name");
        employeeInfo.setAddress("address");
        employeeInfo.setDate_of_birth(new GregorianCalendar(2019, Calendar.JANUARY, 1).getTime());
        employeeInfo.setEmail("email");
        employeeInfo.setPhone("phone");
        employeeInfo.setID_card("ID_card");
        employeeInfo.setId_certificate(0);
        employeeInfo.setStart_time(new GregorianCalendar(2019, Calendar.JANUARY, 1).getTime());
        employeeInfo.setEnd_time(new GregorianCalendar(2019, Calendar.JANUARY, 1).getTime());
        when(mockEmployeeInfoRepository.save(any(EmployeeInfo.class))).thenReturn(employeeInfo);

        // Run the test
        employeeInfoServiceUnderTest.addEmployeeInfo(employee_info);

        // Verify the results
    }

    @Test
    void testFindEmployeeInfoByID() {
        // Setup

        // Configure EmployeeInfoRepository.findById(...).
        final EmployeeInfo employeeInfo1 = new EmployeeInfo();
        employeeInfo1.setId(1261);
        employeeInfo1.setName("Lê Mai Anh");
        employeeInfo1.setAddress("121 thai ha");
        employeeInfo1.setDate_of_birth(new GregorianCalendar(2021, Calendar.MARCH, 21).getTime());
        employeeInfo1.setEmail("eechooo789@gmail.com");
        employeeInfo1.setPhone("09123456789");
        employeeInfo1.setID_card("123456789");
        employeeInfo1.setId_certificate(1);
        employeeInfo1.setStart_time(new GregorianCalendar(2021, Calendar.MARCH, 21).getTime());
        employeeInfo1.setEnd_time(new GregorianCalendar(2021, Calendar.MARCH, 21).getTime());
        final Optional<EmployeeInfo> employeeInfo = Optional.of(employeeInfo1);
        when(mockEmployeeInfoRepository.findById(1261)).thenReturn(employeeInfo);

        // Run the test
        final Optional<EmployeeInfo> result = employeeInfoServiceUnderTest.findEmployeeInfoByID(1261);

        // Verify the results
        Assert.assertEquals(employeeInfo, result);
    }

    @Test
    void testFindEmployeeInfoByID01() {
        // Setup

        // Configure EmployeeInfoRepository.findById(...).
        final EmployeeInfo employeeInfo1 = new EmployeeInfo();
        employeeInfo1.setId(1262);
        employeeInfo1.setName("Lê Mai Anh");
        employeeInfo1.setAddress("121 thai ha");
        employeeInfo1.setDate_of_birth(new GregorianCalendar(2021, Calendar.MARCH, 21).getTime());
        employeeInfo1.setEmail("eechooo789@gmail.com");
        employeeInfo1.setPhone("09123456789");
        employeeInfo1.setID_card("123456789");
        employeeInfo1.setId_certificate(1);
        employeeInfo1.setStart_time(new GregorianCalendar(2021, Calendar.MARCH, 21).getTime());
        employeeInfo1.setEnd_time(new GregorianCalendar(2021, Calendar.MARCH, 21).getTime());
        final Optional<EmployeeInfo> employeeInfo = Optional.of(employeeInfo1);
        when(mockEmployeeInfoRepository.findById(1262)).thenReturn(employeeInfo);

        // Run the test
        final Optional<EmployeeInfo> result = employeeInfoServiceUnderTest.findEmployeeInfoByID(1261);

        // Verify the results
        Assert.assertEquals(employeeInfo, result);
    }

    @Test
    void testFindEmployeeInfoByID_EmployeeInfoRepositoryReturnsAbsent() {
        // Setup
        when(mockEmployeeInfoRepository.findById(0)).thenReturn(Optional.empty());

        // Run the test
        final Optional<EmployeeInfo> result = employeeInfoServiceUnderTest.findEmployeeInfoByID(0);

        // Verify the results
    }

    @Test
    void testUpdateEmployeeInfo() {
        // Setup
        final EmployeeInfo employee_info = new EmployeeInfo();
        employee_info.setId(0);
        employee_info.setName("name");
        employee_info.setAddress("address");
        employee_info.setDate_of_birth(new GregorianCalendar(2019, Calendar.JANUARY, 1).getTime());
        employee_info.setEmail("email");
        employee_info.setPhone("phone");
        employee_info.setID_card("ID_card");
        employee_info.setId_certificate(0);
        employee_info.setStart_time(new GregorianCalendar(2019, Calendar.JANUARY, 1).getTime());
        employee_info.setEnd_time(new GregorianCalendar(2019, Calendar.JANUARY, 1).getTime());

        // Configure EmployeeInfoRepository.findById(...).
        final EmployeeInfo employeeInfo1 = new EmployeeInfo();
        employeeInfo1.setId(0);
        employeeInfo1.setName("name");
        employeeInfo1.setAddress("address");
        employeeInfo1.setDate_of_birth(new GregorianCalendar(2019, Calendar.JANUARY, 1).getTime());
        employeeInfo1.setEmail("email");
        employeeInfo1.setPhone("phone");
        employeeInfo1.setID_card("ID_card");
        employeeInfo1.setId_certificate(0);
        employeeInfo1.setStart_time(new GregorianCalendar(2019, Calendar.JANUARY, 1).getTime());
        employeeInfo1.setEnd_time(new GregorianCalendar(2019, Calendar.JANUARY, 1).getTime());
        final Optional<EmployeeInfo> employeeInfo = Optional.of(employeeInfo1);
        when(mockEmployeeInfoRepository.findById(0)).thenReturn(employeeInfo);

        // Configure EmployeeInfoRepository.save(...).
        final EmployeeInfo employeeInfo2 = new EmployeeInfo();
        employeeInfo2.setId(0);
        employeeInfo2.setName("name");
        employeeInfo2.setAddress("address");
        employeeInfo2.setDate_of_birth(new GregorianCalendar(2019, Calendar.JANUARY, 1).getTime());
        employeeInfo2.setEmail("email");
        employeeInfo2.setPhone("phone");
        employeeInfo2.setID_card("ID_card");
        employeeInfo2.setId_certificate(0);
        employeeInfo2.setStart_time(new GregorianCalendar(2019, Calendar.JANUARY, 1).getTime());
        employeeInfo2.setEnd_time(new GregorianCalendar(2019, Calendar.JANUARY, 1).getTime());
        when(mockEmployeeInfoRepository.save(any(EmployeeInfo.class))).thenReturn(employeeInfo2);

        // Run the test
        final EmployeeInfo result = employeeInfoServiceUnderTest.updateEmployeeInfo(employee_info);

        // Verify the results
    }

    @Test
    void testUpdateEmployeeInfo_EmployeeInfoRepositoryFindByIdReturnsAbsent() {
        // Setup
        final EmployeeInfo employee_info = new EmployeeInfo();
        employee_info.setId(0);
        employee_info.setName("name");
        employee_info.setAddress("address");
        employee_info.setDate_of_birth(new GregorianCalendar(2019, Calendar.JANUARY, 1).getTime());
        employee_info.setEmail("email");
        employee_info.setPhone("phone");
        employee_info.setID_card("ID_card");
        employee_info.setId_certificate(0);
        employee_info.setStart_time(new GregorianCalendar(2019, Calendar.JANUARY, 1).getTime());
        employee_info.setEnd_time(new GregorianCalendar(2019, Calendar.JANUARY, 1).getTime());

        when(mockEmployeeInfoRepository.findById(0)).thenReturn(Optional.empty());

        // Configure EmployeeInfoRepository.save(...).
        final EmployeeInfo employeeInfo = new EmployeeInfo();
        employeeInfo.setId(0);
        employeeInfo.setName("name");
        employeeInfo.setAddress("address");
        employeeInfo.setDate_of_birth(new GregorianCalendar(2019, Calendar.JANUARY, 1).getTime());
        employeeInfo.setEmail("email");
        employeeInfo.setPhone("phone");
        employeeInfo.setID_card("ID_card");
        employeeInfo.setId_certificate(0);
        employeeInfo.setStart_time(new GregorianCalendar(2019, Calendar.JANUARY, 1).getTime());
        employeeInfo.setEnd_time(new GregorianCalendar(2019, Calendar.JANUARY, 1).getTime());
        when(mockEmployeeInfoRepository.save(any(EmployeeInfo.class))).thenReturn(employeeInfo);

        // Run the test
        final EmployeeInfo result = employeeInfoServiceUnderTest.updateEmployeeInfo(employee_info);

        // Verify the results
    }

    @Test
    void testCheckExistEmployeeInfo() {
        // Setup
        final EmployeeInfo employeeInfo1 = new EmployeeInfo();
        employeeInfo1.setId(1261);
        employeeInfo1.setName("Lê Mai Anh");
        employeeInfo1.setAddress("121 thai ha");
        employeeInfo1.setDate_of_birth(new GregorianCalendar(2021, Calendar.MARCH, 21).getTime());
        employeeInfo1.setEmail("eechooo789@gmail.com");
        employeeInfo1.setPhone("09123456789");
        employeeInfo1.setID_card("123456789");
        employeeInfo1.setId_certificate(1);
        employeeInfo1.setStart_time(new GregorianCalendar(2021, Calendar.MARCH, 21).getTime());
        employeeInfo1.setEnd_time(new GregorianCalendar(2021, Calendar.MARCH, 21).getTime());

        when(mockEmployeeInfoRepository.existsById(1261)).thenReturn(true);

        // Run the test
        final boolean result = employeeInfoServiceUnderTest.checkExistEmployeeInfo(employeeInfo1);

        // Verify the results
        assertTrue(result);
    }

    @Test
    void testCheckExistEmployeeInfo01() {
        // Setup
        final EmployeeInfo employeeInfo1 = new EmployeeInfo();
        employeeInfo1.setId(1262);
        employeeInfo1.setName("Lê Mai Anh");
        employeeInfo1.setAddress("121 thai ha");
        employeeInfo1.setDate_of_birth(new GregorianCalendar(2021, Calendar.MARCH, 21).getTime());
        employeeInfo1.setEmail("eechooo789@gmail.com");
        employeeInfo1.setPhone("09123456789");
        employeeInfo1.setID_card("123456789");
        employeeInfo1.setId_certificate(1);
        employeeInfo1.setStart_time(new GregorianCalendar(2021, Calendar.MARCH, 21).getTime());
        employeeInfo1.setEnd_time(new GregorianCalendar(2021, Calendar.MARCH, 21).getTime());

        when(mockEmployeeInfoRepository.existsById(1262)).thenReturn(false);

        // Run the test
        final boolean result = employeeInfoServiceUnderTest.checkExistEmployeeInfo(employeeInfo1);

        // Verify the results
        assertTrue(result);
    }

    @Test
    void testGetAllEmployee() {
        // Setup

        // Run the test
        final List<EmployeeDTO> result = employeeInfoServiceUnderTest.getAllEmployee();

        // Verify the results
        Assert.assertNotNull(result);
    }

    @Test
    void testGetAllEmployee_EmployeeInfoAccRepositoryReturnsNoItems() {
        // Setup
        when(mockEmployeeInfoAccRepository.getEmployeeInfo()).thenReturn(Collections.emptyList());

        // Run the test
        final List<EmployeeDTO> result = employeeInfoServiceUnderTest.getAllEmployee();

        // Verify the results
        Assert.assertNull(result);
    }
}
