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
    private ContractDTORepository contractDTORepository;
    @Autowired
    private ContractRepository contractRepository;
    @Autowired
    private ContractChangeHistoryRepository contractChangeHistoryRepository;
    @Autowired
    private FeePaymentHistoryRepository feePaymentHistoryRepository;
    @Autowired
    private IntersetPaymentHistoryRepository intersetPaymentHistoryRepository;
    @Autowired
    private RequestRepository requestRepository;

    public List<Contract> getAllContract(String code_em_support){
        return contractRepository.getAllContract(code_em_support);
    }

    public Contract getDetailContract(int id){
         return contractRepository.getDetailContract(id);
    }
    public Optional<ContractChangeHistory> getDetailContractChange(int id){
        return contractChangeHistoryRepository.findById(id);
    }

    public List<ContractChangeHistory> getAllContractHistory(int id){
       return contractChangeHistoryRepository.getAllContractChange(id);
    }

    public List<FeePaymentHistory> getAllFeePaymentHistory(int id){
        return feePaymentHistoryRepository.getAllFeePayment(id);
    }

    public List<IntersetPaymentHistory> getAllIntersetPaymentHistory(int id){
        return intersetPaymentHistoryRepository.getAllIntersetPayment(id);
    }
    public void setUpdateContract(int id_contract,int id_request,String description){
        Optional<Contract> contract = contractRepository.findById(id_contract);
        contract.get().setApproval_status("DXD");
        contract.get().setStatus(true);

        Optional<Request> request = requestRepository.findById(id_request);

        request.get().setDescription(description);
        request.get().setStatus("DXD");

    }

    public void setUpdateContractDecline(int id_contract,int id_request,String description){

        Optional<Contract> contract = contractRepository.findById(id_contract);
        contract.get().setApproval_status("TC");
        contract.get().setStatus(false);

        Optional<Request> request = requestRepository.findById(id_request);
        request.get().setDescription(description);
        request.get().setStatus("TC");
    }


    public void updateContract(Contract cont){
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
        HistoryContract.setId_main_interest(oldContract.get().getId_main_interest());
        HistoryContract.setId_illustration(oldContract.get().getId_illustration());
        HistoryContract.setStart_time(oldContract.get().getStart_time());
        HistoryContract.setEnd_time(oldContract.get().getEnd_time());
        HistoryContract.setStatus(oldContract.get().getStatus());
        HistoryContract.setContract_total_value(oldContract.get().getContract_total_value());
        HistoryContract.setCreate_time(oldContract.get().getCreate_time());
        HistoryContract.setCode_em_support(oldContract.get().getCode_em_support());
        contractChangeHistoryRepository.save(HistoryContract);


        oldContract.get().setContract_total_value(cont.getContract_total_value());
        oldContract.get().setName_contract_owner(cont.getName_contract_owner());
        oldContract.get().setCreate_time(cont.getCreate_time());
        oldContract.get().setEnd_time(cont.getEnd_time());
        oldContract.get().setPayment_period_id(cont.getPayment_period_id());
        oldContract.get().setId_illustration(cont.getId_illustration());
        oldContract.get().setInsurance_type(cont.getInsurance_type());
        oldContract.get().setId_main_interest(cont.getId_illustration());

    }
}
