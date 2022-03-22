package com.mahmoud.springboot.v1.models;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.*;
import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;

import javax.persistence.*;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Entity
@Setter
@Getter

@NoArgsConstructor
@AllArgsConstructor
@Builder
@Table(name = "user")
public class UserModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long userId;







////    @JsonIgnore
//    @OneToMany(mappedBy = "user")
//    private Set<ReviewModel> reviews =new HashSet<ReviewModel>();
    @JsonIgnore
    private transient List<ReviewModel> reviews = new java.util.ArrayList<>();


    @ManyToMany(
            cascade = CascadeType.MERGE
    )
    @JoinTable(
            name = "restaurant_user_favorite_map",
            joinColumns = @JoinColumn(
                    name = "user_id",
                    referencedColumnName = "userId"
            ),
            inverseJoinColumns = @JoinColumn(
                    name = "restaurant_id",
                    referencedColumnName = "restaurantId"
            )

    )
    private Set<RestaurantModel> restaurants =new HashSet<RestaurantModel>();

}