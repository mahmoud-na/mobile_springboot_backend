package com.mahmoud.springboot.v1.models;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.*;
import org.hibernate.annotations.LazyCollection;
import org.hibernate.annotations.LazyCollectionOption;
import org.hibernate.validator.constraints.URL;

import javax.persistence.*;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.PositiveOrZero;
import java.sql.Time;
import java.sql.Timestamp;
import java.time.LocalTime;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Getter
@Setter
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
    @NotBlank(message = "Restaurant Description must be not empty")
    @Lob
    private String restaurantDescription;
    @NotNull(message = "Restaurant Logo URL Not valid")
    @URL(message = "Restaurant Logo URL Not valid")
    @Lob
    private String restaurantLogoImage;
    @NotNull(message = "Restaurant Opening Time can not be NULL")
    private LocalTime restaurantOpeningTime;
    @NotNull(message = "Restaurant Closing Time can not be NULL")
    private LocalTime restaurantClosingTime;
    private String restaurantHotline;
    @PositiveOrZero(message = "Viewers must be greater than or equal ZERO")
    @Column(nullable = false)
    private int restaurantViewers;
    @NotBlank(message = "Restaurant name must be not empty")
    @Column(name = "restaurant_name", nullable = false)
    private String restaurantName;


    @NotNull(message = "Restaurant cover Image URL Not valid")
    @URL(message = "Restaurant cover Image URL Not valid")
    @Lob
    private String restaurantCoverImage;


    //================== MULTi-VALUED ATTRIBUTE restaurantImages ========
    @ElementCollection
    @CollectionTable(name = "restaurant_images", joinColumns = @JoinColumn(name = "restaurant_id"))
    private List<@URL(message = "Restaurant Image URL Not valid") String> restaurantImages = new java.util.ArrayList<>();

    //================== MULTi-VALUED ATTRIBUTE restaurantMenuImages ========
//    @NotBlank(message = "Restaurant Menu Image must be not empty")
    @ElementCollection
    @CollectionTable(name = "restaurant_menu_images", joinColumns = @JoinColumn(name = "restaurant_id"))
    private List<@URL(message = "Restaurant Menu Image URL Not valid") @NotNull(message = "Restaurant Menu Image URL Not valid") String> restaurantMenuImages = new java.util.ArrayList<>();

    //================== ONE TO MANY BRANCHES COLUMN ========
    @NotNull(message = "Restaurant branch can not be NULL")
    @OneToMany(cascade = {CascadeType.ALL})
    @JoinColumn(
            name = "restaurant_id",
            referencedColumnName = "restaurantId"
    )
    private List<BranchModel> branches = new java.util.ArrayList<>();
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
    @NotNull(message = "Restaurant Category can not be NULL")
    @ManyToMany(cascade = {CascadeType.ALL})
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
//    @JsonIgnore
    private List<CategoryModel> categories = new java.util.ArrayList<>();

//    @ManyToMany(
//            cascade = CascadeType.MERGE
//
//    )
//    @JoinTable(
//            name = "restaurant_user_favorite_map",
//            joinColumns = @JoinColumn(
//                    name = "restaurant_id",
//                    referencedColumnName = "restaurantId"
//
//            ),
//            inverseJoinColumns = @JoinColumn(
//                    name = "user_id",
//                    referencedColumnName = "userId"
//            )
//    )
//    private Set<UserModel> users;
//    @JsonIgnore
//    @OneToMany(mappedBy = "restaurant")
//    private List<SubscriptionModel> subscriptionModel = new java.util.ArrayList<>();
//@JsonIgnore
private transient List<SubscriptionModel> subscriptionModel = new java.util.ArrayList<>();

//    @JsonIgnore
//    @OneToMany(mappedBy = "restaurant")
//    private Set<ReviewModel> reviews = new HashSet<ReviewModel>();
//@JsonIgnore
    private transient List<ReviewModel> reviews = new java.util.ArrayList<>();

}