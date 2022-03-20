package com.mahmoud.springboot.v1.models;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
@Table(name = "News")
public class NewsModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long newId;
    private String newTittle;
    private String newDescription;
    private Timestamp newDate;

    @ElementCollection
    @CollectionTable(
            name = "new_Image",
            joinColumns = @JoinColumn(name = "newId")
    )
    private List<String> newImages;

//    @ManyToOne
//    @JoinColumn(name = "restaurant_id",
//    referencedColumnName = "restaurantId"
//    )
//    private RestaurantModel restaurant;
}
