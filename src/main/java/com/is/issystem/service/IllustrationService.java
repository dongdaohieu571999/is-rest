package com.is.issystem.service;

import com.is.issystem.dto.IllustrationDTO;
import com.is.issystem.dto.IllustrationItemOfList;
import com.is.issystem.entities.Illustration;
import com.is.issystem.entities.IllustrationMainInterest;
import com.is.issystem.entities.IllustrationSubInterest;
import com.is.issystem.repository.entity_dto_repository.IllustrationItemOfListRepository;
import com.is.issystem.repository.entity_repository.IllustrationMainInterestRepository;
import com.is.issystem.repository.entity_repository.IllustrationRepository;
import com.is.issystem.repository.entity_repository.IllustrationSubInterestRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
@Transactional(rollbackFor = Exception.class)
public class IllustrationService {
    @Autowired
    private IllustrationRepository illRepository;

    @Autowired
    private IllustrationItemOfListRepository illustrationItemOfListRepository;

    @Autowired
    private IllustrationMainInterestRepository mainInterestRepository;

    @Autowired
    private IllustrationSubInterestRepository subInterestRepository;

    public List<IllustrationItemOfList> getAllIllustration(int id){
        return illustrationItemOfListRepository.listIllustrationCustomerOwn(id);
    }

    public void saveIllustration(IllustrationDTO illustrationDTO){
        Illustration illustration= new Illustration();
        illustration.setCreate_time(illustrationDTO.getCreate_time());
        illustration.setId_customer_info(illustrationDTO.getId_customer_info());
        illustration.setPayment_period(illustrationDTO.getPayment_period());
        illustration.setTotal_fee(illustrationDTO.getTotal_fee());

        illRepository.save(illustration);

        illustrationDTO.getIllustrationMainInterest().setId_illustration(illustration.getId());

        mainInterestRepository.save(illustrationDTO.getIllustrationMainInterest());

        if(illustrationDTO.getIllustrationSubInterestList() != null && illustrationDTO.getIllustrationSubInterestList().size() != 0){
            subInterestRepository.saveAll(illustrationDTO.getIllustrationSubInterestList());
        }
    }

    public boolean checkExistIllustration(IllustrationDTO illustrationDTO){
        return illustrationDTO.getId()== null  ? false : illRepository.existsById(illustrationDTO.getId());
    }

    public void updateIllustration(IllustrationDTO illustrationDTO){
        Optional<Illustration> illustration =  illRepository.findById(illustrationDTO.getId());
        illustration.get().setCreate_time(illustrationDTO.getCreate_time());
        illustration.get().setId_customer_info(illustrationDTO.getId_customer_info());
        illustration.get().setPayment_period(illustrationDTO.getPayment_period());
        illustration.get().setTotal_fee(illustrationDTO.getTotal_fee());

        illRepository.save(illustration.get());

        Optional<IllustrationMainInterest> illustrationMainInterest = mainInterestRepository.findById(illustrationDTO.getIllustrationMainInterest().getId());
        mainInterestRepository.save(illustrationMainInterest.get());

        if(illustrationDTO.getIllustrationSubInterestList() != null && illustrationDTO.getIllustrationSubInterestList().size() != 0){
            for(IllustrationSubInterest item : illustrationDTO.getIllustrationSubInterestList()){
                if(subInterestRepository.existsById(item.getId())){
                    Optional<IllustrationSubInterest> illustrationSubInterest = subInterestRepository.findById(item.getId());
                    subInterestRepository.save(illustrationSubInterest.get());
                } else {
                    subInterestRepository.save(item);
                }
            }

        }
    }

}
