package com.mahmoud.springboot.v1.repository;

import com.mahmoud.springboot.v1.models.OfferModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface OfferModelRepository extends JpaRepository<OfferModel, Long> {


}