package com.is.issystem.service;

import com.is.issystem.dto.CustomerDTO;
import com.is.issystem.entities.*;
import com.is.issystem.repository.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.Transient;
import java.util.List;
import java.util.Optional;

@Service
@Transactional(rollbackFor = Exception.class)
public class CustomerInfoService {
    @Autowired
    CustomerDTORepository customerDTORepository;

    @Autowired
    CustomerInfoRepository customerInfoRepository;

    @Autowired
    PermanentAddressRepository permanentAddressRepository;

    @Autowired
    ContactAddressRepository contactAddressRepository;

    @Autowired
    CurrentAddressRepository currentAddressRepository;

    @Autowired
    WorkplaceRepository workplaceRepository;

    public void updateCustomerInfo(CustomerDTO customerDTO){
        Optional<CustomerDTO> customerInfo = customerInfoRepository.findById(customerDTO.getId());
        customerInfo.get().setBirth_date(customerDTO.getBirth_date());
        customerInfo.get().setAge(customerDTO.getAge());
        customerInfo.get().setBirth_address(customerDTO.getBirth_address());
        customerInfo.get().setTypes_identification(customerDTO.getTypes_identification());
        customerInfo.get().setID_card(customerDTO.getID_card());
        customerInfo.get().setNationality_1(customerDTO.getNationality_1());
        customerInfo.get().setNationality_2(customerDTO.getNationality_2());
        customerInfo.get().setNation(customerDTO.getNation());
        customerInfo.get().setJob(customerDTO.getJob());
        customerInfo.get().setCareer(customerDTO.getCareer());
        customerInfo.get().setPosition(customerDTO.getPosition());
        customerInfo.get().setOccupation_group(customerDTO.getOccupation_group());
        customerInfo.get().setCompany_name(customerDTO.getCompany_name());
        customerInfo.get().setMain_business(customerDTO.getMain_business());
        customerInfo.get().setSpecific_work(customerDTO.getSpecific_work());
        customerInfo.get().setMonthly_income(customerDTO.getMonthly_income());
        customerInfo.get().setEmail(customerDTO.getEmail());
        customerInfo.get().setPhone_1(customerDTO.getPhone_1());
        customerInfo.get().setPhone_2(customerDTO.getPhone_2());
        customerInfo.get().setId_account(customerDTO.getId_account());
        customerInfo.get().setFull_name(customerDTO.getFull_name());
        customerInfo.get().setCode_em_support(customerDTO.getCode_em_support());



        Optional<ContactAddress> contactAddress = contactAddressRepository.findById(customerDTO.getId_contact_address());
        contactAddress.get().setConadd_city(customerDTO.getConadd_city());
        contactAddress.get().setConadd_district(customerDTO.getConadd_district());
        contactAddress.get().setConadd_no_street(customerDTO.getConadd_no_street());
        contactAddress.get().setConadd_wards(customerDTO.getConadd_wards());



        Optional<CurrentAddress> currentAddress = currentAddressRepository.findById(customerDTO.getId_current_address());
        currentAddress.get().setCuradd_city(customerDTO.getCuradd_city());
        currentAddress.get().setCuradd_district(customerDTO.getCuradd_district());
        currentAddress.get().setCuradd_no_street(customerDTO.getCuradd_no_street());
        currentAddress.get().setCuradd_wards(customerDTO.getCuradd_wards());



        Optional<PermanentAddress> permanentAddress = permanentAddressRepository.findById(customerDTO.getId_permanent_address());
        permanentAddress.get().setPeradd_city(customerDTO.getPeradd_city());
        permanentAddress.get().setPeradd_district(customerDTO.getPeradd_district());
        permanentAddress.get().setPeradd_no_street(customerDTO.getPeradd_no_street());
        permanentAddress.get().setPeradd_wards(customerDTO.getPeradd_wards());



        Optional<WorkplaceAddress> workplaceAddress = workplaceRepository.findById(customerDTO.getId_workplace_address());
        workplaceAddress.get().setWorkadd_city(customerDTO.getWorkadd_city());
        workplaceAddress.get().setWorkadd_district(customerDTO.getWorkadd_district());
        workplaceAddress.get().setWorkadd_no_street(customerDTO.getWorkadd_no_street());
        workplaceAddress.get().setWorkadd_wards(customerDTO.getWorkadd_wards());



        if(customerInfo != null && contactAddress != null && currentAddress != null && permanentAddress != null && workplaceAddress != null){
            customerInfoRepository.save(customerInfo.get());
            contactAddressRepository.save(contactAddress.get());
            currentAddressRepository.save(currentAddress.get());
            permanentAddressRepository.save(permanentAddress.get());
            workplaceRepository.save(workplaceAddress.get());
        }
    }

    public CustomerDTO getOneInfo(Integer id,String code){
        return customerDTORepository.getOneCustomerInfo(id,code);
    }

    public List<CustomerDTO> findAll(){
        return  customerInfoRepository.getAllCustomerInfo();
    }

    public CustomerDTO getCustomerDetail(int id){
        return customerInfoRepository.getCustomerInfobyID(id);
    }

}