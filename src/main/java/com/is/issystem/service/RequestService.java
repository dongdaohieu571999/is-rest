package com.is.issystem.service;

import com.is.issystem.entities.Request;
import com.is.issystem.repository.entity_repository.ContractRequestRepository;
import com.is.issystem.repository.entity_repository.RequestRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class RequestService {
    @Autowired
    private ContractRequestRepository contractRequestRepository;

    @Autowired
    private RequestRepository requestRepository;

    public List<Request> getAllContractRequestApproval() {
        return requestRepository.getAllCheckReq();
    }

    public List<Request> getAllUncheckReq(){
        return requestRepository.getAllUncheckReq();
    }

    public Optional<Request> getDetailRequest(int id){
        return requestRepository.findById(id);
    }

    public Request addOneReq(Request request){
        return requestRepository.save(request);
    }
}
