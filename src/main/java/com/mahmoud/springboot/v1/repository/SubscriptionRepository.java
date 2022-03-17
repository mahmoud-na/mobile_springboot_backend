package com.mahmoud.springboot.v1.repository;

import com.mahmoud.springboot.v1.models.Subscription;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SubscriptionRepository extends JpaRepository<Subscription, Long> {
}