package com.mahmoud.springboot.v1.models;

import lombok.*;
import org.hibernate.annotations.LazyCollection;
import org.hibernate.annotations.LazyCollectionOption;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
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
    @NotBlank(message = "Branch location must be not empty")
    private String branchLocation;
    @NotBlank(message = "Branch Address must be not empty")
    private String branchAddress;
    private boolean branchStatus;

    @NotEmpty(message = "Branch phone must be not empty")
    @ElementCollection
    @CollectionTable(name = "branch_phones", joinColumns = @JoinColumn(name = "branch_id"))
    private List<@NotBlank(message = "Branch phone must be not empty") String> branchPhone = new java.util.ArrayList<>();



    @NotNull(message = "Services of branch Can not be NULL")
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
    private List<ServicesModel> services = new java.util.ArrayList<>();

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
