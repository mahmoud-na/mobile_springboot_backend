package com.mahmoud.springboot.v1.models;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.sql.Timestamp;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Builder
public class SubscriptionModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long subscriptionId;
    @NotNull(message = "Subscription Start Date can not be NULL")
    private Timestamp subscriptionStart;
    @NotNull(message = "Subscription Start Date can not be NULL")
    private Timestamp subscriptionEnd;
    //private subscription status;


    @NotNull(message = "Restaurant subscription Can not be NULL")
    @ManyToOne(cascade = {CascadeType.MERGE})
    @JoinColumn(
            name = "restaurant_id",
            referencedColumnName = "restaurantId"
    )
    private RestaurantModel restaurant;



    @NotNull(message = "Restaurant subscription Package Can not be NULL")
    @ManyToOne(cascade = {CascadeType.MERGE})
    @JoinColumn(
            name = "package_id",
            referencedColumnName = "packageId"
    )
    private PackageModel packageModel;

}
