//package com.is.issystem.service;
//
//<<<<<<< HEAD
//import com.is.issystem.dto.ContractDTO;
//import com.is.issystem.repository.ContractDTORepository;
//import org.junit.Assert;
//=======
//import com.is.issystem.entities.*;
//import com.is.issystem.repository.entity_repository.*;
//import com.sun.tools.javac.util.Assert;
//>>>>>>> hieu
//import org.junit.jupiter.api.Test;
//import org.junit.jupiter.api.extension.ExtendWith;
//import org.mockito.InjectMocks;
//import org.mockito.Mock;
//import org.mockito.junit.jupiter.MockitoExtension;
//<<<<<<< HEAD
//
//import java.sql.Date;
//import java.util.Arrays;
//import java.util.Collections;
//import java.util.List;
//
//import static org.mockito.ArgumentMatchers.isNull;
//=======
//import org.junit
//
//import java.sql.Date;
//import java.time.LocalDate;
//import java.util.*;
//
//import static org.mockito.ArgumentMatchers.any;
//>>>>>>> hieu
//import static org.mockito.Mockito.when;
//
//@ExtendWith(MockitoExtension.class)
//class ContractServiceTest {
//
//    @Mock
//    private ContractDTORepository mockContractDTORepository;
//<<<<<<< HEAD
//=======
//    @Mock
//    private ContractRepository mockContractRepository;
//    @Mock
//    private ContractChangeHistoryRepository mockContractChangeHistoryRepository;
//    @Mock
//    private FeePaymentHistoryRepository mockFeePaymentHistoryRepository;
//    @Mock
//    private IntersetPaymentHistoryRepository mockIntersetPaymentHistoryRepository;
//    @Mock
//    private RequestRepository mockRequestRepository;
//>>>>>>> hieu
//
//    @InjectMocks
//    private ContractService contractServiceUnderTest;
//
//    @Test
//    void testGetAllContract() {
//        // Setup
//
//<<<<<<< HEAD
//        // Run the test
//        final List<ContractDTO> result = contractServiceUnderTest.getAllContract();
//
//        // Verify the results
//        Assert.assertNotNull(result);
//        System.out.println(result.toString());
//    }
//
//    @Test
//    void testGetAllContract_ContractDTORepositoryReturnsNoItems() {
//        // Setup
//        when(mockContractDTORepository.getAllContract()).thenReturn(Collections.emptyList());
//
//        // Run the test
//        final List<ContractDTO> result = contractServiceUnderTest.getAllContract();
//
//        // Verify the results
//        Assert.assertNull(result);
//    }
//
//    //missing description column in contract table
//=======
//        // Configure ContractRepository.getAllContract(...).
//        final Contract contract = new Contract();
//        contract.setId(0);
//        contract.setId_customer(0);
//        contract.setName_contract_owner("name_contract_owner");
//        contract.setPayment_period_id(0);
//        contract.setInsurance_type("insurance_type");
//        contract.setId_main_interest(0);
//        contract.setId_illustration(0);
//        contract.setStart_time(Date.valueOf(LocalDate.of(2020, 1, 1)));
//        contract.setEnd_time(Date.valueOf(LocalDate.of(2020, 1, 1)));
//        contract.setCreate_time(Date.valueOf(LocalDate.of(2020, 1, 1)));
//        final List<Contract> contracts = Arrays.asList(contract);
//        when(mockContractRepository.getAllContract("code_em_support")).thenReturn(contracts);
//
//        // Run the test
//        final List<Contract> result = contractServiceUnderTest.getAllContract("code_em_support");
//
//        // Verify the results
//        Assert.
//        System.out.println(result.toArray());
//    }
//
//    @Test
//    void testGetAllContract_ContractRepositoryReturnsNoItems() {
//        // Setup
//        when(mockContractRepository.getAllContract("code_em_support")).thenReturn(Collections.emptyList());
//
//        // Run the test
//        final List<Contract> result = contractServiceUnderTest.getAllContract("code_em_support");
//
//        // Verify the results
//    }
//
//>>>>>>> hieu
//    @Test
//    void testGetDetailContract() {
//        // Setup
//
//<<<<<<< HEAD
//        // Configure ContractDTORepository.getDetailContract(...).
//        final ContractDTO contractDTO = new ContractDTO();
//        contractDTO.setPayment_amount_interset("payment_amount_interset");
//        contractDTO.setPayment_amount_fee("payment_amount_fee");
//        contractDTO.setId(0);
//        contractDTO.setId_customer(0);
//        contractDTO.setName_contract_owner("name_contract_owner");
//        contractDTO.setPayment_period("payment_period");
//        contractDTO.setInsurance_type("insurance_type");
//        contractDTO.setId_main_interest(0);
//        contractDTO.setId_illustration(0);
//        contractDTO.setStart_time(new Date(0L));
//        when(mockContractDTORepository.getDetailContract(isNull())).thenReturn(contractDTO);
//
//        // Run the test
//        final ContractDTO result = contractServiceUnderTest.getDetailContract(isNull());
//
//        // Verify the results
//        Assert.assertEquals(contractDTO, result);
//=======
//        // Configure ContractRepository.getDetailContract(...).
//        final Contract contract = new Contract();
//        contract.setId(0);
//        contract.setId_customer(0);
//        contract.setName_contract_owner("name_contract_owner");
//        contract.setPayment_period_id(0);
//        contract.setInsurance_type("insurance_type");
//        contract.setId_main_interest(0);
//        contract.setId_illustration(0);
//        contract.setStart_time(Date.valueOf(LocalDate.of(2020, 1, 1)));
//        contract.setEnd_time(Date.valueOf(LocalDate.of(2020, 1, 1)));
//        contract.setCreate_time(Date.valueOf(LocalDate.of(2020, 1, 1)));
//        when(mockContractRepository.getDetailContract(0)).thenReturn(contract);
//
//        // Run the test
//        final Contract result = contractServiceUnderTest.getDetailContract(0);
//
//        // Verify the results
//    }
//
//    @Test
//    void testGetDetailContractChange() {
//        // Setup
//
//        // Configure ContractChangeHistoryRepository.findById(...).
//        final ContractChangeHistory contractChangeHistory1 = new ContractChangeHistory();
//        contractChangeHistory1.setId(0);
//        contractChangeHistory1.setId_contract(0);
//        contractChangeHistory1.setId_customer(0);
//        contractChangeHistory1.setCreate_time(Date.valueOf(LocalDate.of(2020, 1, 1)));
//        contractChangeHistory1.setId_request(0);
//        contractChangeHistory1.setName_contract_owner("name_contract_owner");
//        contractChangeHistory1.setPayment_period_id(0);
//        contractChangeHistory1.setInsurance_type("insurance_type");
//        contractChangeHistory1.setId_main_interest(0);
//        contractChangeHistory1.setId_illustration(0);
//        final Optional<ContractChangeHistory> contractChangeHistory = Optional.of(contractChangeHistory1);
//        when(mockContractChangeHistoryRepository.findById(0)).thenReturn(contractChangeHistory);
//
//        // Run the test
//        final Optional<ContractChangeHistory> result = contractServiceUnderTest.getDetailContractChange(0);
//
//        // Verify the results
//    }
//
//    @Test
//    void testGetDetailContractChange_ContractChangeHistoryRepositoryReturnsAbsent() {
//        // Setup
//        when(mockContractChangeHistoryRepository.findById(0)).thenReturn(Optional.empty());
//
//        // Run the test
//        final Optional<ContractChangeHistory> result = contractServiceUnderTest.getDetailContractChange(0);
//
//        // Verify the results
//    }
//
//    @Test
//    void testGetAllContractHistory() {
//        // Setup
//
//        // Configure ContractChangeHistoryRepository.getAllContractChange(...).
//        final ContractChangeHistory contractChangeHistory = new ContractChangeHistory();
//        contractChangeHistory.setId(0);
//        contractChangeHistory.setId_contract(0);
//        contractChangeHistory.setId_customer(0);
//        contractChangeHistory.setCreate_time(Date.valueOf(LocalDate.of(2020, 1, 1)));
//        contractChangeHistory.setId_request(0);
//        contractChangeHistory.setName_contract_owner("name_contract_owner");
//        contractChangeHistory.setPayment_period_id(0);
//        contractChangeHistory.setInsurance_type("insurance_type");
//        contractChangeHistory.setId_main_interest(0);
//        contractChangeHistory.setId_illustration(0);
//        final List<ContractChangeHistory> contractChangeHistories = Arrays.asList(contractChangeHistory);
//        when(mockContractChangeHistoryRepository.getAllContractChange(0)).thenReturn(contractChangeHistories);
//
//        // Run the test
//        final List<ContractChangeHistory> result = contractServiceUnderTest.getAllContractHistory(0);
//
//        // Verify the results
//    }
//
//    @Test
//    void testGetAllContractHistory_ContractChangeHistoryRepositoryReturnsNoItems() {
//        // Setup
//        when(mockContractChangeHistoryRepository.getAllContractChange(0)).thenReturn(Collections.emptyList());
//
//        // Run the test
//        final List<ContractChangeHistory> result = contractServiceUnderTest.getAllContractHistory(0);
//
//        // Verify the results
//    }
//
//    @Test
//    void testGetAllFeePaymentHistory() {
//        // Setup
//
//        // Configure FeePaymentHistoryRepository.getAllFeePayment(...).
//        final FeePaymentHistory feePaymentHistory = new FeePaymentHistory();
//        feePaymentHistory.setId(0);
//        feePaymentHistory.setId_contract(0);
//        feePaymentHistory.setId_invoice(0);
//        feePaymentHistory.setPayment_amount("payment_amount");
//        feePaymentHistory.setPayment_method("payment_method");
//        feePaymentHistory.setId_collecter(0);
//        feePaymentHistory.setCreated_time(new GregorianCalendar(2020, Calendar.JANUARY, 1).getTime());
//        final List<FeePaymentHistory> feePaymentHistories = Arrays.asList(feePaymentHistory);
//        when(mockFeePaymentHistoryRepository.getAllFeePayment(0)).thenReturn(feePaymentHistories);
//
//        // Run the test
//        final List<FeePaymentHistory> result = contractServiceUnderTest.getAllFeePaymentHistory(0);
//
//        // Verify the results
//    }
//
//    @Test
//    void testGetAllFeePaymentHistory_FeePaymentHistoryRepositoryReturnsNoItems() {
//        // Setup
//        when(mockFeePaymentHistoryRepository.getAllFeePayment(0)).thenReturn(Collections.emptyList());
//
//        // Run the test
//        final List<FeePaymentHistory> result = contractServiceUnderTest.getAllFeePaymentHistory(0);
//
//        // Verify the results
//    }
//
//    @Test
//    void testGetAllIntersetPaymentHistory() {
//        // Setup
//
//        // Configure IntersetPaymentHistoryRepository.getAllIntersetPayment(...).
//        final IntersetPaymentHistory intersetPaymentHistory = new IntersetPaymentHistory();
//        intersetPaymentHistory.setApprove_status("approve_status");
//        intersetPaymentHistory.setId(0);
//        intersetPaymentHistory.setId_contract(0);
//        intersetPaymentHistory.setId_main_interest(0);
//        intersetPaymentHistory.setId_bill_issuer(0);
//        intersetPaymentHistory.setId_attachment(0);
//        intersetPaymentHistory.setPayment_amount("payment_amount");
//        intersetPaymentHistory.setCreated_time(new GregorianCalendar(2020, Calendar.JANUARY, 1).getTime());
//        final List<IntersetPaymentHistory> intersetPaymentHistories = Arrays.asList(intersetPaymentHistory);
//        when(mockIntersetPaymentHistoryRepository.getAllIntersetPayment(0)).thenReturn(intersetPaymentHistories);
//
//        // Run the test
//        final List<IntersetPaymentHistory> result = contractServiceUnderTest.getAllIntersetPaymentHistory(0);
//
//        // Verify the results
//    }
//
//    @Test
//    void testGetAllIntersetPaymentHistory_IntersetPaymentHistoryRepositoryReturnsNoItems() {
//        // Setup
//        when(mockIntersetPaymentHistoryRepository.getAllIntersetPayment(0)).thenReturn(Collections.emptyList());
//
//        // Run the test
//        final List<IntersetPaymentHistory> result = contractServiceUnderTest.getAllIntersetPaymentHistory(0);
//
//        // Verify the results
//    }
//
//    @Test
//    void testSetUpdateContract() {
//        // Setup
//
//        // Configure ContractRepository.findById(...).
//        final Contract contract1 = new Contract();
//        contract1.setId(0);
//        contract1.setId_customer(0);
//        contract1.setName_contract_owner("name_contract_owner");
//        contract1.setPayment_period_id(0);
//        contract1.setInsurance_type("insurance_type");
//        contract1.setId_main_interest(0);
//        contract1.setId_illustration(0);
//        contract1.setStart_time(Date.valueOf(LocalDate.of(2020, 1, 1)));
//        contract1.setEnd_time(Date.valueOf(LocalDate.of(2020, 1, 1)));
//        contract1.setCreate_time(Date.valueOf(LocalDate.of(2020, 1, 1)));
//        final Optional<Contract> contract = Optional.of(contract1);
//        when(mockContractRepository.findById(0)).thenReturn(contract);
//
//        // Configure ContractRepository.save(...).
//        final Contract contract2 = new Contract();
//        contract2.setId(0);
//        contract2.setId_customer(0);
//        contract2.setName_contract_owner("name_contract_owner");
//        contract2.setPayment_period_id(0);
//        contract2.setInsurance_type("insurance_type");
//        contract2.setId_main_interest(0);
//        contract2.setId_illustration(0);
//        contract2.setStart_time(Date.valueOf(LocalDate.of(2020, 1, 1)));
//        contract2.setEnd_time(Date.valueOf(LocalDate.of(2020, 1, 1)));
//        contract2.setCreate_time(Date.valueOf(LocalDate.of(2020, 1, 1)));
//        when(mockContractRepository.save(any(Contract.class))).thenReturn(contract2);
//
//        // Configure RequestRepository.findById(...).
//        final Request request1 = new Request();
//        request1.setId(0);
//        request1.setName("name");
//        request1.setId_type(0);
//        request1.setDate(new GregorianCalendar(2020, Calendar.JANUARY, 1).getTime());
//        request1.setRequestcol(0);
//        request1.setCode_sender("code_sender");
//        request1.setCode_reciever("code_reciever");
//        request1.setDescription("description");
//        request1.setPriority("priority");
//        request1.setId_contract(0);
//        final Optional<Request> request = Optional.of(request1);
//        when(mockRequestRepository.findById(0)).thenReturn(request);
//
//        // Configure RequestRepository.save(...).
//        final Request request2 = new Request();
//        request2.setId(0);
//        request2.setName("name");
//        request2.setId_type(0);
//        request2.setDate(new GregorianCalendar(2020, Calendar.JANUARY, 1).getTime());
//        request2.setRequestcol(0);
//        request2.setCode_sender("code_sender");
//        request2.setCode_reciever("code_reciever");
//        request2.setDescription("description");
//        request2.setPriority("priority");
//        request2.setId_contract(0);
//        when(mockRequestRepository.save(any(Request.class))).thenReturn(request2);
//
//        // Run the test
//        contractServiceUnderTest.setUpdateContract(0, 0, "description", "approval_status");
//
//        // Verify the results
//    }
//
//    @Test
//    void testSetUpdateContract_ContractRepositoryFindByIdReturnsAbsent() {
//        // Setup
//        when(mockContractRepository.findById(0)).thenReturn(Optional.empty());
//
//        // Configure ContractRepository.save(...).
//        final Contract contract = new Contract();
//        contract.setId(0);
//        contract.setId_customer(0);
//        contract.setName_contract_owner("name_contract_owner");
//        contract.setPayment_period_id(0);
//        contract.setInsurance_type("insurance_type");
//        contract.setId_main_interest(0);
//        contract.setId_illustration(0);
//        contract.setStart_time(Date.valueOf(LocalDate.of(2020, 1, 1)));
//        contract.setEnd_time(Date.valueOf(LocalDate.of(2020, 1, 1)));
//        contract.setCreate_time(Date.valueOf(LocalDate.of(2020, 1, 1)));
//        when(mockContractRepository.save(any(Contract.class))).thenReturn(contract);
//
//        // Configure RequestRepository.findById(...).
//        final Request request1 = new Request();
//        request1.setId(0);
//        request1.setName("name");
//        request1.setId_type(0);
//        request1.setDate(new GregorianCalendar(2020, Calendar.JANUARY, 1).getTime());
//        request1.setRequestcol(0);
//        request1.setCode_sender("code_sender");
//        request1.setCode_reciever("code_reciever");
//        request1.setDescription("description");
//        request1.setPriority("priority");
//        request1.setId_contract(0);
//        final Optional<Request> request = Optional.of(request1);
//        when(mockRequestRepository.findById(0)).thenReturn(request);
//
//        // Configure RequestRepository.save(...).
//        final Request request2 = new Request();
//        request2.setId(0);
//        request2.setName("name");
//        request2.setId_type(0);
//        request2.setDate(new GregorianCalendar(2020, Calendar.JANUARY, 1).getTime());
//        request2.setRequestcol(0);
//        request2.setCode_sender("code_sender");
//        request2.setCode_reciever("code_reciever");
//        request2.setDescription("description");
//        request2.setPriority("priority");
//        request2.setId_contract(0);
//        when(mockRequestRepository.save(any(Request.class))).thenReturn(request2);
//
//        // Run the test
//        contractServiceUnderTest.setUpdateContract(0, 0, "description", "approval_status");
//
//        // Verify the results
//    }
//
//    @Test
//    void testSetUpdateContract_RequestRepositoryFindByIdReturnsAbsent() {
//        // Setup
//
//        // Configure ContractRepository.findById(...).
//        final Contract contract1 = new Contract();
//        contract1.setId(0);
//        contract1.setId_customer(0);
//        contract1.setName_contract_owner("name_contract_owner");
//        contract1.setPayment_period_id(0);
//        contract1.setInsurance_type("insurance_type");
//        contract1.setId_main_interest(0);
//        contract1.setId_illustration(0);
//        contract1.setStart_time(Date.valueOf(LocalDate.of(2020, 1, 1)));
//        contract1.setEnd_time(Date.valueOf(LocalDate.of(2020, 1, 1)));
//        contract1.setCreate_time(Date.valueOf(LocalDate.of(2020, 1, 1)));
//        final Optional<Contract> contract = Optional.of(contract1);
//        when(mockContractRepository.findById(0)).thenReturn(contract);
//
//        // Configure ContractRepository.save(...).
//        final Contract contract2 = new Contract();
//        contract2.setId(0);
//        contract2.setId_customer(0);
//        contract2.setName_contract_owner("name_contract_owner");
//        contract2.setPayment_period_id(0);
//        contract2.setInsurance_type("insurance_type");
//        contract2.setId_main_interest(0);
//        contract2.setId_illustration(0);
//        contract2.setStart_time(Date.valueOf(LocalDate.of(2020, 1, 1)));
//        contract2.setEnd_time(Date.valueOf(LocalDate.of(2020, 1, 1)));
//        contract2.setCreate_time(Date.valueOf(LocalDate.of(2020, 1, 1)));
//        when(mockContractRepository.save(any(Contract.class))).thenReturn(contract2);
//
//        when(mockRequestRepository.findById(0)).thenReturn(Optional.empty());
//
//        // Configure RequestRepository.save(...).
//        final Request request = new Request();
//        request.setId(0);
//        request.setName("name");
//        request.setId_type(0);
//        request.setDate(new GregorianCalendar(2020, Calendar.JANUARY, 1).getTime());
//        request.setRequestcol(0);
//        request.setCode_sender("code_sender");
//        request.setCode_reciever("code_reciever");
//        request.setDescription("description");
//        request.setPriority("priority");
//        request.setId_contract(0);
//        when(mockRequestRepository.save(any(Request.class))).thenReturn(request);
//
//        // Run the test
//        contractServiceUnderTest.setUpdateContract(0, 0, "description", "approval_status");
//
//        // Verify the results
//    }
//
//    @Test
//    void testUpdateContract() {
//        // Setup
//        final Contract cont = new Contract();
//        cont.setId(0);
//        cont.setId_customer(0);
//        cont.setName_contract_owner("name_contract_owner");
//        cont.setPayment_period_id(0);
//        cont.setInsurance_type("insurance_type");
//        cont.setId_main_interest(0);
//        cont.setId_illustration(0);
//        cont.setStart_time(Date.valueOf(LocalDate.of(2020, 1, 1)));
//        cont.setEnd_time(Date.valueOf(LocalDate.of(2020, 1, 1)));
//        cont.setCreate_time(Date.valueOf(LocalDate.of(2020, 1, 1)));
//
//        // Configure ContractRepository.findById(...).
//        final Contract contract1 = new Contract();
//        contract1.setId(0);
//        contract1.setId_customer(0);
//        contract1.setName_contract_owner("name_contract_owner");
//        contract1.setPayment_period_id(0);
//        contract1.setInsurance_type("insurance_type");
//        contract1.setId_main_interest(0);
//        contract1.setId_illustration(0);
//        contract1.setStart_time(Date.valueOf(LocalDate.of(2020, 1, 1)));
//        contract1.setEnd_time(Date.valueOf(LocalDate.of(2020, 1, 1)));
//        contract1.setCreate_time(Date.valueOf(LocalDate.of(2020, 1, 1)));
//        final Optional<Contract> contract = Optional.of(contract1);
//        when(mockContractRepository.findById(0)).thenReturn(contract);
//
//        // Configure ContractChangeHistoryRepository.save(...).
//        final ContractChangeHistory contractChangeHistory = new ContractChangeHistory();
//        contractChangeHistory.setId(0);
//        contractChangeHistory.setId_contract(0);
//        contractChangeHistory.setId_customer(0);
//        contractChangeHistory.setCreate_time(Date.valueOf(LocalDate.of(2020, 1, 1)));
//        contractChangeHistory.setId_request(0);
//        contractChangeHistory.setName_contract_owner("name_contract_owner");
//        contractChangeHistory.setPayment_period_id(0);
//        contractChangeHistory.setInsurance_type("insurance_type");
//        contractChangeHistory.setId_main_interest(0);
//        contractChangeHistory.setId_illustration(0);
//        when(mockContractChangeHistoryRepository.save(any(ContractChangeHistory.class))).thenReturn(contractChangeHistory);
//
//        // Run the test
//        contractServiceUnderTest.updateContract(cont);
//
//        // Verify the results
//    }
//
//    @Test
//    void testUpdateContract_ContractRepositoryReturnsAbsent() {
//        // Setup
//        final Contract cont = new Contract();
//        cont.setId(0);
//        cont.setId_customer(0);
//        cont.setName_contract_owner("name_contract_owner");
//        cont.setPayment_period_id(0);
//        cont.setInsurance_type("insurance_type");
//        cont.setId_main_interest(0);
//        cont.setId_illustration(0);
//        cont.setStart_time(Date.valueOf(LocalDate.of(2020, 1, 1)));
//        cont.setEnd_time(Date.valueOf(LocalDate.of(2020, 1, 1)));
//        cont.setCreate_time(Date.valueOf(LocalDate.of(2020, 1, 1)));
//
//        when(mockContractRepository.findById(0)).thenReturn(Optional.empty());
//
//        // Configure ContractChangeHistoryRepository.save(...).
//        final ContractChangeHistory contractChangeHistory = new ContractChangeHistory();
//        contractChangeHistory.setId(0);
//        contractChangeHistory.setId_contract(0);
//        contractChangeHistory.setId_customer(0);
//        contractChangeHistory.setCreate_time(Date.valueOf(LocalDate.of(2020, 1, 1)));
//        contractChangeHistory.setId_request(0);
//        contractChangeHistory.setName_contract_owner("name_contract_owner");
//        contractChangeHistory.setPayment_period_id(0);
//        contractChangeHistory.setInsurance_type("insurance_type");
//        contractChangeHistory.setId_main_interest(0);
//        contractChangeHistory.setId_illustration(0);
//        when(mockContractChangeHistoryRepository.save(any(ContractChangeHistory.class))).thenReturn(contractChangeHistory);
//
//        // Run the test
//        contractServiceUnderTest.updateContract(cont);
//
//        // Verify the results
//>>>>>>> hieu
//    }
//}
