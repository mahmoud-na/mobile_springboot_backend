package com.mahmoud.springboot.v1.repository;

import com.mahmoud.springboot.v1.models.PackageModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PackageRepository extends JpaRepository<PackageModel, Long> {
}