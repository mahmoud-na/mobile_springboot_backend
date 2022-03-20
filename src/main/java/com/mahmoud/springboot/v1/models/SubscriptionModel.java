package com.mahmoud.springboot.v1.models;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
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
    private Timestamp subscriptionStart;
    private Timestamp subscriptionEnd;
    //private subscription status;


    @ManyToOne(cascade = {CascadeType.MERGE})
    @JoinColumn(
            name = "restaurant_id",
            referencedColumnName = "restaurantId"
    )
    private RestaurantModel restaurant;



    @ManyToOne(cascade = CascadeType.MERGE)
    @JoinColumn(
            name = "package_id",
            referencedColumnName = "packageId"
    )
    private PackageModel packageModel;

}
