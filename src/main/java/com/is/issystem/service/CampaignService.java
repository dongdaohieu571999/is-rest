package com.is.issystem.service;

import com.is.issystem.dto.CampaignDTO;
import com.is.issystem.repository.entity_dto_repository.CampaignDTORepository;
import com.is.issystem.repository.entity_repository.CampaignRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CampaignService {
    @Autowired
    private CampaignDTORepository campaignDTORepository;

    @Autowired
    private CampaignRepository campaignRepository;

    public List<CampaignDTO> getAllCampaign(String code_em_support){
        List<CampaignDTO> result = campaignDTORepository.listCampaign(code_em_support);
        System.out.println("getAllCampaign(String code_em_support)");
        System.out.println(result.toString());
        System.out.println("---------------");
        return result;
    }

    public List<CampaignDTO> searchAllCampaign(String code_em_support, String create_time, String end_time, String searchValue){
        List<CampaignDTO> result = campaignDTORepository.searchListCampaign(code_em_support,create_time,end_time,searchValue);
        System.out.println("searchAllCampaign(String code_em_support, String create_time, String end_time, String searchValue)");
        System.out.println(result.toString());
        System.out.println("---------------");
        return result;
    }

    public void addOneCampaign(String code, String end_time){
        campaignRepository.addOneCampaign(code,end_time);
        System.out.println("addOneCampaign(String code, String end_time)");
        System.out.println("Add successfully");
        System.out.println("---------------");
    }
}
