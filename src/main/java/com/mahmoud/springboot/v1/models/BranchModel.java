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
    private Long branchId;
    private String branchLocation;
    private boolean branchStatus;

    @ElementCollection
    @CollectionTable(
            name = "branch_phones",
            joinColumns = @JoinColumn(
                    name = "branch_id",
                    referencedColumnName = "branchId"
            )

    )
    private List<String> branchPhone;

    @ManyToMany(
            cascade = {CascadeType.ALL}
    )
    @JoinTable(
            name = "branch_services_map",
            joinColumns = @JoinColumn(
                    name = "branch_id",
                    referencedColumnName = "branchId"
            ),
            inverseJoinColumns = @JoinColumn(
                    name = "service_id",
                    referencedColumnName = "serviceId"
            )
    )
    private List<ServicesModel> services;


    @ManyToMany(cascade = {CascadeType.ALL})
    @JoinTable(
            name = "branches_offers",
            joinColumns = @JoinColumn(
                    name = "branch_id",
                    referencedColumnName = "branchId"
            ),
            inverseJoinColumns = @JoinColumn(
                    name = "offer_id",
                    referencedColumnName = "offerId"
            )
    )
    private List<OfferModel> offers = new java.util.ArrayList<>();
}
