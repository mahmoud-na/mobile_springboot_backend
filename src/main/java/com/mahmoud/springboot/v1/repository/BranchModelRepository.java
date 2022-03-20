package com.mahmoud.springboot.v1.repository;

import com.mahmoud.springboot.v1.models.BranchModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BranchModelRepository extends JpaRepository<BranchModel, Long> {
}