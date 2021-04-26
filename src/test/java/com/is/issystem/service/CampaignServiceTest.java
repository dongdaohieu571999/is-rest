package com.is.issystem.service;

import com.is.issystem.dto.CampaignDTO;
import com.is.issystem.repository.entity_dto_repository.CampaignDTORepository;
import com.is.issystem.repository.entity_repository.CampaignRepository;
import org.junit.Assert;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
class CampaignServiceTest {

    @Mock
    private CampaignDTORepository mockCampaignDTORepository;
    @Mock
    private CampaignRepository mockCampaignRepository;

    @InjectMocks
    private CampaignService campaignServiceUnderTest;

    //test not null
    @Test
    void testGetAllCampaign() {
        // Setup

        // Configure CampaignDTORepository.listCampaign(...).
        final CampaignDTO campaignDTO = new CampaignDTO();
        campaignDTO.setId(0);
        campaignDTO.setCode("code");
        campaignDTO.setFull_name("full_name");
        campaignDTO.setCreate_time("create_time");
        campaignDTO.setEnd_time("end_time");
        campaignDTO.setId_customer(0);
        final List<CampaignDTO> campaignDTOS = Arrays.asList(campaignDTO);
        when(mockCampaignDTORepository.listCampaign("code_em_support")).thenReturn(campaignDTOS);

        // Run the test
        final List<CampaignDTO> result = campaignServiceUnderTest.getAllCampaign("code_em_support");

        // Verify the results
        Assert.assertNotNull(result);
    }

    //test return code
    @Test
    void testGetAllCampaign001() {
        // Setup

        // Configure CampaignDTORepository.listCampaign(...).
        final CampaignDTO campaignDTO = new CampaignDTO();
        campaignDTO.setId(0);
        campaignDTO.setCode("code");
        campaignDTO.setFull_name("full_name");
        campaignDTO.setCreate_time("create_time");
        campaignDTO.setEnd_time("end_time");
        campaignDTO.setId_customer(0);
        final List<CampaignDTO> campaignDTOS = Arrays.asList(campaignDTO);
        when(mockCampaignDTORepository.listCampaign("code_em_support")).thenReturn(campaignDTOS);

        // Run the test
        final List<CampaignDTO> result = campaignServiceUnderTest.getAllCampaign("code_em_support");

        // Verify the results
        Assert.assertTrue(result.get(0).getCode().equals("code"));
    }

    //test return full name
    @Test
    void testGetAllCampaign002() {
        // Setup

        // Configure CampaignDTORepository.listCampaign(...).
        final CampaignDTO campaignDTO = new CampaignDTO();
        campaignDTO.setId(0);
        campaignDTO.setCode("code");
        campaignDTO.setFull_name("full_name");
        campaignDTO.setCreate_time("create_time");
        campaignDTO.setEnd_time("end_time");
        campaignDTO.setId_customer(0);
        final List<CampaignDTO> campaignDTOS = Arrays.asList(campaignDTO);
        when(mockCampaignDTORepository.listCampaign("code_em_support")).thenReturn(campaignDTOS);

        // Run the test
        final List<CampaignDTO> result = campaignServiceUnderTest.getAllCampaign("code_em_support");

        // Verify the results
        Assert.assertTrue(result.get(0).getFull_name().equals("full_name"));
    }

    //test return created time
    @Test
    void testGetAllCampaign003() {
        // Setup

        // Configure CampaignDTORepository.listCampaign(...).
        final CampaignDTO campaignDTO = new CampaignDTO();
        campaignDTO.setId(0);
        campaignDTO.setCode("code");
        campaignDTO.setFull_name("full_name");
        campaignDTO.setCreate_time("create_time");
        campaignDTO.setEnd_time("end_time");
        campaignDTO.setId_customer(0);
        final List<CampaignDTO> campaignDTOS = Arrays.asList(campaignDTO);
        when(mockCampaignDTORepository.listCampaign("code_em_support")).thenReturn(campaignDTOS);

        // Run the test
        final List<CampaignDTO> result = campaignServiceUnderTest.getAllCampaign("code_em_support");

        // Verify the results
        Assert.assertTrue(result.get(0).getCreate_time().equals("create_time"));
    }

    //test return end time
    @Test
    void testGetAllCampaign004() {
        // Setup

        // Configure CampaignDTORepository.listCampaign(...).
        final CampaignDTO campaignDTO = new CampaignDTO();
        campaignDTO.setId(0);
        campaignDTO.setCode("code");
        campaignDTO.setFull_name("full_name");
        campaignDTO.setCreate_time("create_time");
        campaignDTO.setEnd_time("end_time");
        campaignDTO.setId_customer(0);
        final List<CampaignDTO> campaignDTOS = Arrays.asList(campaignDTO);
        when(mockCampaignDTORepository.listCampaign("code_em_support")).thenReturn(campaignDTOS);

        // Run the test
        final List<CampaignDTO> result = campaignServiceUnderTest.getAllCampaign("code_em_support");

        // Verify the results
        Assert.assertTrue(result.get(0).getEnd_time().equals("end_time"));
    }

    //test return id_customer
    @Test
    void testGetAllCampaign005() {
        // Setup

        // Configure CampaignDTORepository.listCampaign(...).
        final CampaignDTO campaignDTO = new CampaignDTO();
        campaignDTO.setId(0);
        campaignDTO.setCode("code");
        campaignDTO.setFull_name("full_name");
        campaignDTO.setCreate_time("create_time");
        campaignDTO.setEnd_time("end_time");
        campaignDTO.setId_customer(0);
        final List<CampaignDTO> campaignDTOS = Arrays.asList(campaignDTO);
        when(mockCampaignDTORepository.listCampaign("code_em_support")).thenReturn(campaignDTOS);

        // Run the test
        final List<CampaignDTO> result = campaignServiceUnderTest.getAllCampaign("code_em_support");

        // Verify the results
        Assert.assertTrue(result.get(0).getId_customer() == 0);
    }

    //test return campain id
    @Test
    void testGetAllCampaign006() {
        // Setup

        // Configure CampaignDTORepository.listCampaign(...).
        final CampaignDTO campaignDTO = new CampaignDTO();
        campaignDTO.setId(0);
        campaignDTO.setCode("code");
        campaignDTO.setFull_name("full_name");
        campaignDTO.setCreate_time("create_time");
        campaignDTO.setEnd_time("end_time");
        campaignDTO.setId_customer(0);
        final List<CampaignDTO> campaignDTOS = Arrays.asList(campaignDTO);
        when(mockCampaignDTORepository.listCampaign("code_em_support")).thenReturn(campaignDTOS);

        // Run the test
        final List<CampaignDTO> result = campaignServiceUnderTest.getAllCampaign("code_em_support");

        // Verify the results
        Assert.assertTrue(result.get(0).getId() == 0);
    }

    //test not null
    @Test
    void testGetAllCampaign007() {
        // Setup

        // Configure CampaignDTORepository.listCampaign(...)
        final List<CampaignDTO> campaignDTOS = Arrays.asList(null);
        when(mockCampaignDTORepository.listCampaign("code_em_support")).thenReturn(campaignDTOS);

        // Run the test
        final List<CampaignDTO> result = campaignServiceUnderTest.getAllCampaign("code_em_support");

        // Verify the results
        Assert.assertNull(result);
    }

    //test not null
    @Test
    void testGetAllCampaign008() {
        // Setup

        // Configure CampaignDTORepository.listCampaign(...)
        final List<CampaignDTO> campaignDTOS = Arrays.asList(null);
        when(mockCampaignDTORepository.listCampaign("code_em_support")).thenReturn(campaignDTOS);

        // Run the test
        final List<CampaignDTO> result = campaignServiceUnderTest.getAllCampaign("code_em_support");

        // Verify the results
        Assert.assertNotNull(result);
    }

    @Test
    void testGetAllCampaign_CampaignDTORepositoryReturnsNoItems() {
        // Setup
        when(mockCampaignDTORepository.listCampaign("code_em_support")).thenReturn(Collections.emptyList());

        // Run the test
        final List<CampaignDTO> result = campaignServiceUnderTest.getAllCampaign("code_em_support");

        // Verify the results
        Assert.assertNull(result);
    }

    @Test
    void testGetAllCampaign_CampaignDTORepositoryReturnsNoItems001() {
        // Setup
        when(mockCampaignDTORepository.listCampaign("code_em_support")).thenReturn(Collections.emptyList());

        // Run the test
        final List<CampaignDTO> result = campaignServiceUnderTest.getAllCampaign("code_em_support");

        // Verify the results
        Assert.assertNotNull(result);
    }

    @Test
    void testSearchAllCampaign() {
        // Setup

        // Configure CampaignDTORepository.searchListCampaign(...).
        final CampaignDTO campaignDTO = new CampaignDTO();
        campaignDTO.setId(0);
        campaignDTO.setCode("code");
        campaignDTO.setFull_name("full_name");
        campaignDTO.setCreate_time("create_time");
        campaignDTO.setEnd_time("end_time");
        campaignDTO.setId_customer(0);
        final List<CampaignDTO> campaignDTOS = Arrays.asList(campaignDTO);
        when(mockCampaignDTORepository.searchListCampaign("code_em_support", "create_time", "end_time", "searchValue")).thenReturn(campaignDTOS);

        // Run the test
        final List<CampaignDTO> result = campaignServiceUnderTest.searchAllCampaign("code_em_support", "create_time", "end_time", "searchValue");

        // Verify the results
        Assert.assertEquals(result.get(0).getId(), campaignDTOS.get(0).getId());
    }

    @Test
    void testSearchAllCampaign001() {
        // Setup

        // Configure CampaignDTORepository.searchListCampaign(...).
        final CampaignDTO campaignDTO = new CampaignDTO();
        campaignDTO.setId(0);
        campaignDTO.setCode("code");
        campaignDTO.setFull_name("full_name");
        campaignDTO.setCreate_time("create_time");
        campaignDTO.setEnd_time("end_time");
        campaignDTO.setId_customer(0);
        final List<CampaignDTO> campaignDTOS = Arrays.asList(campaignDTO);
        when(mockCampaignDTORepository.searchListCampaign("code_em_support", "create_time", "end_time", "searchValue")).thenReturn(campaignDTOS);

        // Run the test
        final List<CampaignDTO> result = campaignServiceUnderTest.searchAllCampaign("code_em_support", "create_time", "end_time", "searchValue");

        // Verify the results
        Assert.assertEquals(result.get(0).getCode(), campaignDTOS.get(0).getCode());
    }

    @Test
    void testSearchAllCampaign002() {
        // Setup

        // Configure CampaignDTORepository.searchListCampaign(...).
        final CampaignDTO campaignDTO = new CampaignDTO();
        campaignDTO.setId(0);
        campaignDTO.setCode("code");
        campaignDTO.setFull_name("full_name");
        campaignDTO.setCreate_time("create_time");
        campaignDTO.setEnd_time("end_time");
        campaignDTO.setId_customer(0);
        final List<CampaignDTO> campaignDTOS = Arrays.asList(campaignDTO);
        when(mockCampaignDTORepository.searchListCampaign("code_em_support", "create_time", "end_time", "searchValue")).thenReturn(campaignDTOS);

        // Run the test
        final List<CampaignDTO> result = campaignServiceUnderTest.searchAllCampaign("code_em_support", "create_time", "end_time", "searchValue");

        // Verify the results
        Assert.assertEquals(result.get(0).getFull_name(), campaignDTOS.get(0).getFull_name());
    }

    @Test
    void testSearchAllCampaign003() {
        // Setup

        // Configure CampaignDTORepository.searchListCampaign(...).
        final CampaignDTO campaignDTO = new CampaignDTO();
        campaignDTO.setId(0);
        campaignDTO.setCode("code");
        campaignDTO.setFull_name("full_name");
        campaignDTO.setCreate_time("create_time");
        campaignDTO.setEnd_time("end_time");
        campaignDTO.setId_customer(0);
        final List<CampaignDTO> campaignDTOS = Arrays.asList(campaignDTO);
        when(mockCampaignDTORepository.searchListCampaign("code_em_support", "create_time", "end_time", "searchValue")).thenReturn(campaignDTOS);

        // Run the test
        final List<CampaignDTO> result = campaignServiceUnderTest.searchAllCampaign("code_em_support", "create_time", "end_time", "searchValue");

        // Verify the results
        Assert.assertEquals(result.get(0).getCreate_time(), campaignDTOS.get(0).getCreate_time());
    }

    @Test
    void testSearchAllCampaign004() {
        // Setup

        // Configure CampaignDTORepository.searchListCampaign(...).
        final CampaignDTO campaignDTO = new CampaignDTO();
        campaignDTO.setId(0);
        campaignDTO.setCode("code");
        campaignDTO.setFull_name("full_name");
        campaignDTO.setCreate_time("create_time");
        campaignDTO.setEnd_time("end_time");
        campaignDTO.setId_customer(0);
        final List<CampaignDTO> campaignDTOS = Arrays.asList(campaignDTO);
        when(mockCampaignDTORepository.searchListCampaign("code_em_support", "create_time", "end_time", "searchValue")).thenReturn(campaignDTOS);

        // Run the test
        final List<CampaignDTO> result = campaignServiceUnderTest.searchAllCampaign("code_em_support", "create_time", "end_time", "searchValue");

        // Verify the results
        Assert.assertEquals(result.get(0).getEnd_time(), campaignDTOS.get(0).getEnd_time());
    }

    @Test
    void testSearchAllCampaign005() {
        // Setup

        // Configure CampaignDTORepository.searchListCampaign(...).
        final CampaignDTO campaignDTO = new CampaignDTO();
        campaignDTO.setId(0);
        campaignDTO.setCode("code");
        campaignDTO.setFull_name("full_name");
        campaignDTO.setCreate_time("create_time");
        campaignDTO.setEnd_time("end_time");
        campaignDTO.setId_customer(0);
        final List<CampaignDTO> campaignDTOS = Arrays.asList(campaignDTO);
        when(mockCampaignDTORepository.searchListCampaign("code_em_support", "create_time", "end_time", "searchValue")).thenReturn(campaignDTOS);

        // Run the test
        final List<CampaignDTO> result = campaignServiceUnderTest.searchAllCampaign("code_em_support", "create_time", "end_time", "searchValue");

        // Verify the results
        Assert.assertEquals(result.get(0).getId_customer(), campaignDTOS.get(0).getId_customer());
    }

    @Test
    void testSearchAllCampaign006() {
        // Setup

        // Configure CampaignDTORepository.searchListCampaign(...).
        final CampaignDTO campaignDTO = new CampaignDTO();
        campaignDTO.setId(0);
        campaignDTO.setCode("code");
        campaignDTO.setFull_name("full_name");
        campaignDTO.setCreate_time("create_time");
        campaignDTO.setEnd_time("end_time");
        campaignDTO.setId_customer(0);
        final List<CampaignDTO> campaignDTOS = Arrays.asList(campaignDTO);
        when(mockCampaignDTORepository.searchListCampaign("code_em_support", "create_time", "end_time", "searchValue")).thenReturn(campaignDTOS);

        // Run the test
        final List<CampaignDTO> result = campaignServiceUnderTest.searchAllCampaign("code_em_support", "create_time", "end_time", "searchValue");

        // Verify the results
        Assert.assertNotNull(result);
    }

    @Test
    void testSearchAllCampaign007() {
        // Setup

        // Configure CampaignDTORepository.searchListCampaign(...).
        final CampaignDTO campaignDTO = new CampaignDTO();
        campaignDTO.setId(0);
        campaignDTO.setCode("code");
        campaignDTO.setFull_name("full_name");
        campaignDTO.setCreate_time("create_time");
        campaignDTO.setEnd_time("end_time");
        campaignDTO.setId_customer(0);
        final List<CampaignDTO> campaignDTOS = Arrays.asList(campaignDTO);
        when(mockCampaignDTORepository.searchListCampaign("code_em_support", "create_time", "end_time", "searchValue")).thenReturn(campaignDTOS);

        // Run the test
        final List<CampaignDTO> result = campaignServiceUnderTest.searchAllCampaign("code_em_support", "create_time", "end_time", "searchValue");

        // Verify the results
        Assert.assertNull(result);
    }

    @Test
    void testSearchAllCampaign_CampaignDTORepositoryReturnsNoItems() {
        // Setup
        when(mockCampaignDTORepository.searchListCampaign("code_em_support", "create_time", "end_time", "searchValue")).thenReturn(Collections.emptyList());

        // Run the test
        final List<CampaignDTO> result = campaignServiceUnderTest.searchAllCampaign("code_em_support", "create_time", "end_time", "searchValue");

        // Verify the results
        Assert.assertNull(result);
    }

    @Test
    void testSearchAllCampaign_CampaignDTORepositoryReturnsNoItems001() {
        // Setup
        when(mockCampaignDTORepository.searchListCampaign("code_em_support", "create_time", "end_time", "searchValue")).thenReturn(Collections.emptyList());

        // Run the test
        final List<CampaignDTO> result = campaignServiceUnderTest.searchAllCampaign("code_em_support", "create_time", "end_time", "searchValue");

        // Verify the results
        Assert.assertNotNull(result);
    }

    @Test
    void testAddOneCampaign() {
        // Setup

        // Run the test
        campaignServiceUnderTest.addOneCampaign("code", "end_time");

        // Verify the results
        verify(mockCampaignRepository).addOneCampaign("code", "end_time");
    }
}
