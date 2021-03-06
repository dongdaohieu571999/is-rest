package com.is.issystem.service;

import com.is.issystem.dto.EmployeeAccDTO;
import com.is.issystem.dto.EmployeeInfoDTO;
import com.is.issystem.entities.*;
import com.is.issystem.dto.EmployeeDTO;
import com.is.issystem.repository.*;
import com.is.issystem.repository.entity_repository.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
@Transactional(rollbackFor = Exception.class)
public class EmployeeInfoService {
    @Autowired
    EmployeeInfoRepository employeeInfoRepository;
    @Autowired
    EmployeeInfoAccRepository employeeInfoAccRepository;
    @Autowired
    EmployeeDTORepository employeeDTORepository;
    @Autowired
    EmployeeAccRepository employeeAccRepository;
    @Autowired
    PermanentAddressRepository permanentAddressRepository;
    @Autowired
    ContactAddressRepository contactAddressRepository;
    @Autowired
    CurrentAddressRepository currentAddressRepository;

    public List<EmployeeDTO> getAllEmployee(){
        return employeeDTORepository.getEmployeeInfo();
    }
    public EmployeeInfoDTO getDetailEmployeebyID(int id){
        return employeeInfoAccRepository.getDetailEmployeeInfobyID(id);
    }

    public void addEmployeeInfo(EmployeeInfoDTO employeeInfoDTO){
        EmployeeInfo employeeInfo = new EmployeeInfo();
        employeeInfo.setName(employeeInfoDTO.getName());
        employeeInfo.setAddress(employeeInfoDTO.getAddress());
        employeeInfo.setDate_of_birth(employeeInfoDTO.getDate_of_birth());
        employeeInfo.setEmail(employeeInfoDTO.getEmail());
        employeeInfo.setPhone(employeeInfoDTO.getPhone());
        employeeInfo.setId_card(employeeInfoDTO.getId_card());
        employeeInfo.setId_certificate(employeeInfoDTO.getId_certificate());
        employeeInfo.setStart_time(employeeInfoDTO.getStart_time());
        employeeInfo.setEnd_time(employeeInfoDTO.getEnd_time());
        employeeInfo.setGender(employeeInfoDTO.isGender());
        employeeInfo.setDept_id(employeeInfoDTO.getDept_id());
        employeeInfo.setId_labour_contract(employeeInfoDTO.getId_labour_contract());
        employeeInfo.setMarital_status(employeeInfoDTO.isMarital_status());
        employeeInfo.setNational(employeeInfoDTO.getNational());
        employeeInfo.setAge(employeeInfoDTO.getAge());

        //add term add count for employee
        EmployeeAcc employeeAcc = new EmployeeAcc();
        employeeAcc.setStatus(false);
        employeeAccRepository.save(employeeAcc);
        employeeInfo.setId(employeeAcc.getId());


        ContactAddress contactAddress = new ContactAddress();
        contactAddress.setConadd_city(employeeInfoDTO.getConadd_city());
        contactAddress.setConadd_district(employeeInfoDTO.getConadd_district());
        contactAddress.setConadd_no_street(employeeInfoDTO.getConadd_no_street());
        contactAddress.setConadd_wards(employeeInfoDTO.getConadd_wards());



        CurrentAddress currentAddress = new CurrentAddress();
        currentAddress.setCuradd_city(employeeInfoDTO.getCuradd_city());
        currentAddress.setCuradd_district(employeeInfoDTO.getCuradd_district());
        currentAddress.setCuradd_no_street(employeeInfoDTO.getCuradd_no_street());
        currentAddress.setCuradd_wards(employeeInfoDTO.getCuradd_wards());



        PermanentAddress permanentAddress = new PermanentAddress();
        permanentAddress.setPeradd_city(employeeInfoDTO.getPeradd_city());
        permanentAddress.setPeradd_district(employeeInfoDTO.getPeradd_district());
        permanentAddress.setPeradd_no_street(employeeInfoDTO.getPeradd_no_street());
        permanentAddress.setPeradd_wards(employeeInfoDTO.getPeradd_wards());


        if(employeeInfo != null && contactAddress != null && currentAddress != null && permanentAddress != null){
            contactAddressRepository.save(contactAddress);
            employeeInfo.setId_contact_address(contactAddress.getConadd_id());
            currentAddressRepository.save(currentAddress);
            employeeInfo.setId_current_address(currentAddress.getCuradd_id());
            permanentAddressRepository.save(permanentAddress);
            employeeInfo.setId_permanent_address(permanentAddress.getPeradd_id());

            employeeInfoRepository.save(employeeInfo);
        }
    }

    public void updateEmployeeInfo(EmployeeInfoDTO employeeInfoDTO){
        Optional<EmployeeInfo> employeeInfo = employeeInfoRepository.findById(employeeInfoDTO.getId());
        employeeInfo.get().setName(employeeInfoDTO.getName());
        employeeInfo.get().setAddress(employeeInfoDTO.getAddress());
        employeeInfo.get().setDate_of_birth(employeeInfoDTO.getDate_of_birth());
        employeeInfo.get().setEmail(employeeInfoDTO.getEmail());
        employeeInfo.get().setPhone(employeeInfoDTO.getPhone());
        employeeInfo.get().setId_card(employeeInfoDTO.getId_card());
        employeeInfo.get().setId_certificate(employeeInfoDTO.getId_certificate());
        employeeInfo.get().setStart_time(employeeInfoDTO.getStart_time());
        employeeInfo.get().setEnd_time(employeeInfoDTO.getEnd_time());
        employeeInfo.get().setGender(employeeInfoDTO.isGender());
        employeeInfo.get().setDept_id(employeeInfoDTO.getDept_id());
        employeeInfo.get().setId_labour_contract(employeeInfoDTO.getId_labour_contract());
        employeeInfo.get().setMarital_status(employeeInfoDTO.isMarital_status());
        employeeInfo.get().setNational(employeeInfoDTO.getNational());
        employeeInfo.get().setAge(employeeInfoDTO.getAge());
        employeeInfo.get().setId_acc(employeeInfoDTO.getId_acc());

        Optional<ContactAddress> contactAddress = contactAddressRepository.findById(employeeInfoDTO.getId_contact_address());
        contactAddress.get().setConadd_city(employeeInfoDTO.getConadd_city());
        contactAddress.get().setConadd_district(employeeInfoDTO.getConadd_district());
        contactAddress.get().setConadd_no_street(employeeInfoDTO.getConadd_no_street());
        contactAddress.get().setConadd_wards(employeeInfoDTO.getConadd_wards());



        Optional<CurrentAddress> currentAddress = currentAddressRepository.findById(employeeInfoDTO.getId_current_address());
        currentAddress.get().setCuradd_city(employeeInfoDTO.getCuradd_city());
        currentAddress.get().setCuradd_district(employeeInfoDTO.getCuradd_district());
        currentAddress.get().setCuradd_no_street(employeeInfoDTO.getCuradd_no_street());
        currentAddress.get().setCuradd_wards(employeeInfoDTO.getCuradd_wards());



        Optional<PermanentAddress> permanentAddress = permanentAddressRepository.findById(employeeInfoDTO.getId_permanent_address());
        permanentAddress.get().setPeradd_city(employeeInfoDTO.getPeradd_city());
        permanentAddress.get().setPeradd_district(employeeInfoDTO.getPeradd_district());
        permanentAddress.get().setPeradd_no_street(employeeInfoDTO.getPeradd_no_street());
        permanentAddress.get().setPeradd_wards(employeeInfoDTO.getPeradd_wards());

//        if(employeeInfo != null && contactAddress != null && currentAddress != null && permanentAddress != null ){
//            employeeInfoRepository.save(employeeInfo.get());
//            contactAddressRepository.save(contactAddress.get());
//            currentAddressRepository.save(currentAddress.get());
//            permanentAddressRepository.save(permanentAddress.get());
//        }


    }
}
