package com.mahmoud.springboot.v1.models;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "packages")
@Builder
public class PackageModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long packageId;
    @NotBlank(message = "Package name must be not empty")
    private String packageName;

    @OneToMany(mappedBy = "packageModel")
    private List<SubscriptionModel> subscriptionModel = new java.util.ArrayList<>();
}
