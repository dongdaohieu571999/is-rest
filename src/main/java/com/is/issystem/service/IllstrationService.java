package com.is.issystem.service;

import com.is.issystem.entities.Illustration;
import com.is.issystem.repository.IllustrationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional(rollbackFor = Exception.class)
public class IllstrationService {
    @Autowired
    private IllustrationRepository illRepository;

    public List<Illustration> getAllillstration(int id){
        return illRepository.listIllustrationCustomerOwn(id);
    }

}
