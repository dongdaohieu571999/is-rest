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
import com.is.issystem.repository.entity_repository.MainInterestRepository;
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
    private IllustrationMainInterestRepository illustMainInterestRepository;

    @Autowired
    private IllustrationSubInterestRepository illustSubInterestRepository;

    public List<IllustrationItemOfList> getAllIllustrationCustOwn(int id){
        return illustrationItemOfListRepository.listIllustrationCustomerOwn(id);
    }
    @Autowired
    private MainInterestRepository mainInterestRepository;

    public IllustrationDTO getIllustrationContractCreate(Integer id){
        IllustrationDTO illustrationDTO = new IllustrationDTO();

        // lấy thông tin cơ bản của bản minh họa
        Optional<Illustration> illustration = illRepository.findById(id);
        illustrationDTO.setId(illustration.get().getId());
        illustrationDTO.setId_customer_info(illustration.get().getId_customer_info());
        illustrationDTO.setCreate_time(illustration.get().getCreate_time());
        illustrationDTO.setPayment_period_id(illustration.get().getPayment_period_id());
        illustrationDTO.setTotal_fee(illustration.get().getTotal_fee());


        // lấy thông tin người hưởng quyền lợi chính
        IllustrationMainInterest illustrationMainInterest = illustMainInterestRepository.getIllustrationMainInterestByillustID(id);
        illustrationDTO.setIllustrationMainInterest(illustrationMainInterest);
        illustrationDTO.setInterest_name(mainInterestRepository.findById(illustrationMainInterest.getId_main_interest()).get().getInterest_name());

        // lấy thông tin các gói quyền lợi phụ của những người liên quan
        List<IllustrationSubInterest> illustrationSubInterests = illustSubInterestRepository.getAllIllustrationSubByIllustID(id);
        illustrationDTO.setIllustrationSubInterestList(illustrationSubInterests);

        return illustrationDTO;
    }


    public List<IllustrationItemOfList> getAllIllustration(int id){
        return illustrationItemOfListRepository.listIllustrationCustomerOwn(id);
    }

    public void saveIllustration(IllustrationDTO illustrationDTO){
        Illustration illustration= new Illustration();
        illustration.setCreate_time(illustrationDTO.getCreate_time());
        illustration.setId_customer_info(illustrationDTO.getId_customer_info());
        illustration.setPayment_period_id(illustrationDTO.getPayment_period_id());
        illustration.setTotal_fee(illustrationDTO.getTotal_fee());

        illRepository.save(illustration);

        illustrationDTO.getIllustrationMainInterest().setId_illustration(illustration.getId());

        illustMainInterestRepository.save(illustrationDTO.getIllustrationMainInterest());

        if(illustrationDTO.getIllustrationSubInterestList() != null && illustrationDTO.getIllustrationSubInterestList().size() != 0){
            for(IllustrationSubInterest illustSub : illustrationDTO.getIllustrationSubInterestList()){
                illustSub.setId_illustration(illustration.getId());
                illustSubInterestRepository.save(illustSub  );
            }
        }
    }

    public boolean checkExistIllustration(IllustrationDTO illustrationDTO){
        return illustrationDTO.getId()== null  ? false : illRepository.existsById(illustrationDTO.getId());
    }

    public void updateIllustration(IllustrationDTO illustrationDTO){
        Optional<Illustration> illustration =  illRepository.findById(illustrationDTO.getId());
        illustration.get().setCreate_time(illustrationDTO.getCreate_time());
        illustration.get().setId_customer_info(illustrationDTO.getId_customer_info());
        illustration.get().setPayment_period_id(illustrationDTO.getPayment_period_id());
        illustration.get().setTotal_fee(illustrationDTO.getTotal_fee());

        illRepository.save(illustration.get());

        Optional<IllustrationMainInterest> illustrationMainInterest = illustMainInterestRepository.findById(illustrationDTO.getIllustrationMainInterest().getId());
        illustMainInterestRepository.save(illustrationMainInterest.get());

        if(illustrationDTO.getIllustrationSubInterestList() != null && illustrationDTO.getIllustrationSubInterestList().size() != 0){
            for(IllustrationSubInterest item : illustrationDTO.getIllustrationSubInterestList()){
                if(illustSubInterestRepository.existsById(item.getId())){
                    Optional<IllustrationSubInterest> illustrationSubInterest = illustSubInterestRepository.findById(item.getId());
                    illustSubInterestRepository.save(illustrationSubInterest.get());
                } else {
                    illustSubInterestRepository.save(item);
                }
            }

        }
    }

}
