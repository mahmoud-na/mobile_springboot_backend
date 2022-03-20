package com.mahmoud.springboot.v1.models;

import lombok.*;

import javax.persistence.*;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "branches")
@Builder
public class BranchModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int branchId;
    private String branchPhone;
    private String branchLocation;
}
