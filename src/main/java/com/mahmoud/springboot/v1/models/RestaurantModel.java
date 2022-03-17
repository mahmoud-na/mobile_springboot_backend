package com.mahmoud.springboot.v1.models;

import lombok.*;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@ToString
@Table(name = "restaurants")
@Builder
public class RestaurantModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long restaurantId;
    @Lob
    private String restaurantDescription;
    @Lob
    private String restaurantLogoImage;
    @Column(nullable = false)
    private Timestamp restaurantOpeningTime;
    @Column(nullable = false)
    private Timestamp restaurantClosingTime;
    private String restaurantHotline;
    @Column(nullable = false)
    private int restaurantViewers;
    @Column(name = "restaurant_name", nullable = false)
    private String restaurantName;


    //================== MULTi-VALUED ATTRIBUTE restaurantImages ========
    @ElementCollection
    @CollectionTable(
            name = "restaurant_images",
            joinColumns = @JoinColumn(
                    name = "restaurant_id",
                    referencedColumnName = "restaurantId"
            )
    )
    private List<String> restaurantImages;

    //================== MULTi-VALUED ATTRIBUTE restaurantMenuImages ========
    @ElementCollection
    @CollectionTable(
            name = "restaurant_menu_images",
            joinColumns = @JoinColumn(
                    name = "restaurant_id",
                    referencedColumnName = "restaurantId"
            )

    )
    private List<String> restaurantMenuImages;

    //================== ONE TO MANY BRANCHES COLUMN ========
    @OneToMany(
            cascade = CascadeType.ALL
    )
    @JoinColumn(
            name = "restaurant_id",
            referencedColumnName = "restaurantId"
    )
    private List<BranchModel> branches;

    //================== ONE TO MANY NEWS COLUMN ========
    @OneToMany(
            cascade = CascadeType.ALL
    )
    @JoinColumn(
            name = "restaurant_id",
            referencedColumnName = "restaurantId"
    )
    private List<NewsModel> news;

    //================== Many TO MANY BRANCHES COLUMN ========
    @ManyToMany(
            cascade = CascadeType.ALL
    )
    @JoinTable(
            name = "restaurant_category_map",
            joinColumns = @JoinColumn(
                    name = "restaurant_id",
                    referencedColumnName = "restaurantId"
            ),
            inverseJoinColumns = @JoinColumn(
                    name = "category_id",
                    referencedColumnName = "categoryId"
            )
    )
    private List<CategoryModel> categories;



    @OneToMany(fetch = FetchType.EAGER, mappedBy = "restaurant")
    private List<Subscription> subscription = new java.util.ArrayList<>();
}