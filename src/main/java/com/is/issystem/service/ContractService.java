package com.is.issystem.service;

import com.is.issystem.dto.ContractDTO;
import com.is.issystem.entities.*;
import com.is.issystem.repository.entity_dto_repository.ContractDTORepository;
import com.is.issystem.repository.entity_repository.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
@Transactional(rollbackFor = Exception.class)
public class ContractService {
    @Autowired
    private ContractRepository contractRepository;
    @Autowired
    private ContractDTORepository contractDTORepository;
    @Autowired
    private ContractChangeHistoryRepository contractChangeHistoryRepository;
    @Autowired
    private FeePaymentHistoryRepository feePaymentHistoryRepository;
    @Autowired
    private BenifitPaymentHistoryRepository benifitPaymentHistoryRepository;
    @Autowired
    private RequestRepository requestRepository;

    public List<ContractDTO> getAllContract(String code_em_support){
        List<ContractDTO> result = contractDTORepository.getAllContractDTO(code_em_support);
        System.out.println("getAllContract(String code_em_support)");
        System.out.println(result.toString());
        System.out.println("---------------");
        return result;
    }

    public List<ContractDTO> getAllContractForCustomer(Integer id_cust_info){
        List<ContractDTO> result = contractDTORepository.getAllContractDTOForCustomer(id_cust_info);
        System.out.println("getAllContractForCustomer(Integer id_cust_info)");
        System.out.println(result.toString());
        System.out.println("---------------");
        return  result;
    }

    public List<ContractDTO> searchAllContractForCustomer(int id,String dateFrom,String dateTo,String searchValue){
        List<ContractDTO> result = contractDTORepository.searchAllContractDTOForCustomer(id,dateFrom,dateTo,searchValue);
        System.out.println("searchAllContractForCustomer(int id,String dateFrom,String dateTo,String searchValue)");
        System.out.println(result.toString());
        System.out.println("---------------");
        return  result;
    }

    public List<ContractDTO> searchAllContract(String code_em_support,String dateFrom,String dateTo,String searchValue){
        List<ContractDTO> result = contractDTORepository.searchAllContractDTO(code_em_support,dateFrom,dateTo,searchValue);
        System.out.println("contractDTORepository.searchAllContractDTO(code_em_support,dateFrom,dateTo,searchValue)");
        System.out.println(result.toString());
        System.out.println("---------------");
        return result;
    }

    public Integer getCountNewContract(String code_em_support,Integer monthDate){
        Integer result = contractRepository.getAllContractCount(code_em_support,monthDate);
        System.out.println("getCountNewContract(String code_em_support,Integer monthDate)");
        System.out.println(result.toString());
        System.out.println("---------------");
        return result;
    }

    public ContractDTO getDetailContractForSaler(String code_em_support, Integer id){
        ContractDTO result = contractDTORepository.getDetailContractForSaler(code_em_support,id);
        System.out.println("getDetailContractForSaler(String code_em_support, Integer id)");
        System.out.println(result.toString());
        System.out.println("---------------");
        return result;
    }

    // lấy detail contract cho 1 khách hàng ở trang website của customer
    public ContractDTO getDetailContractForCustomer(Integer id){
        ContractDTO result = contractDTORepository.getDetailContractForCustomer(id);
        System.out.println("contractDTORepository.getDetailContractForCustomer(id)");
        System.out.println(result.toString());
        System.out.println("---------------");
        return result;
    }

    public Optional<ContractChangeHistory> getDetailContractChange(int id){
        Optional<ContractChangeHistory> result = contractChangeHistoryRepository.findById(id);
        System.out.println("getDetailContractChange(int id)");
        System.out.println(result.toString());
        System.out.println("---------------");
        return result;
    }

    public List<ContractChangeHistory> getAllContractHistory(int id){
        List<ContractChangeHistory> result = contractChangeHistoryRepository.getAllContractChange(id);
        System.out.println("getAllContractHistory(int id)");
        System.out.println(result.toString());
        System.out.println("---------------");
        return result;
    }

    public List<FeePaymentHistory> getAllFeePaymentHistory(int id){
        List<FeePaymentHistory> result = feePaymentHistoryRepository.getAllFeePayment(id);
        System.out.println("getAllFeePaymentHistory(int id)");
        System.out.println(result.toString());
        System.out.println("---------------");
        return result;
    }

    public List<BenifitPaymentHistory> getAllIntersetPaymentHistory(int id){
        List<BenifitPaymentHistory> result = benifitPaymentHistoryRepository.getAllIntersetPayment(id);
        System.out.println("getAllIntersetPaymentHistory(int id)");
        System.out.println(result.toString());
        System.out.println("---------------");
        return result;
    }
    public void setUpdateContract(int id_contract,Integer id_request,String description,String approval_status){
        System.out.println("setUpdateContract(int id_contract,Integer id_request,String description,String approval_status)");
        Optional<Contract> contract = contractRepository.findById(id_contract);
        contract.get().setApproval_status(approval_status);
        contract.get().setStatus(approval_status.equals("DD")?true:false);
        contractRepository.save(contract.get());
        System.out.println("save successfully id = 1");
        if(id_request != -1){
            Optional<Request> request = requestRepository.findById(id_request);
            request.get().setDescription(description);
            request.get().setStatus(approval_status);
            requestRepository.save(request.get());
            System.out.println("save successfully id != 1");
        }
        System.out.println("---------------");

    }


    public void updateContract(Contract cont){
        System.out.println("updateContract(Contract cont)");
        Optional<Contract> oldContract = contractRepository.findById(cont.getId());

        ContractChangeHistory HistoryContract = new ContractChangeHistory();
        HistoryContract.setId_contract(oldContract.get().getId());
        HistoryContract.setCreate_time(oldContract.get().getStart_time());
        HistoryContract.setId_request(1);
        HistoryContract.setApproval_status(oldContract.get().getApproval_status());
        HistoryContract.setId_customer(oldContract.get().getId_customer());
        HistoryContract.setName_contract_owner(oldContract.get().getName_contract_owner());
        HistoryContract.setPayment_period_id(oldContract.get().getPayment_period_id());
        HistoryContract.setInsurance_type(oldContract.get().getInsurance_type());
        HistoryContract.setId_main_benifitt(oldContract.get().getId_main_benifit());
        HistoryContract.setId_illustration(oldContract.get().getId_illustration());
        HistoryContract.setStart_time(oldContract.get().getStart_time());
        HistoryContract.setEnd_time(oldContract.get().getEnd_time());
        HistoryContract.setStatus(oldContract.get().getStatus());
        HistoryContract.setContract_total_value(oldContract.get().getContract_total_value());
        HistoryContract.setCreate_time(oldContract.get().getCreate_time());
        HistoryContract.setCode_em_support(oldContract.get().getCode_em_support());
        contractChangeHistoryRepository.save(HistoryContract);
        System.out.println("save history successfully");

        System.out.println("---------------");
        oldContract.get().setContract_total_value(cont.getContract_total_value());
        oldContract.get().setName_contract_owner(cont.getName_contract_owner());
        oldContract.get().setCreate_time(cont.getCreate_time());
        oldContract.get().setEnd_time(cont.getEnd_time());
        oldContract.get().setPayment_period_id(cont.getPayment_period_id());
        oldContract.get().setId_illustration(cont.getId_illustration());
        oldContract.get().setInsurance_type(cont.getInsurance_type());
        oldContract.get().setId_main_benifit(cont.getId_illustration());

    }
}
