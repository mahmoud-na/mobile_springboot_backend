package com.mahmoud.springboot.v1.repository;

import com.mahmoud.springboot.v1.models.OfferModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OfferModelRepository extends JpaRepository<OfferModel, Long> {
}