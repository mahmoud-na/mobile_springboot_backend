package com.mahmoud.springboot.v1.repository;

import com.mahmoud.springboot.v1.models.OfferModel;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
@SpringBootTest
class OfferModelRepositoryTest {

    @Autowired
    private OfferModelRepository offerModelRepository;

    @Test
    public void getOffers(){
//        List<OfferModel> offers= offerModelRepository.findAll();
        List<OfferModel> offers= offerModelRepository.findAll();
        System.out.println(offers);
    }
}