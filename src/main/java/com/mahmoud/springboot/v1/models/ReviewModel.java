package com.mahmoud.springboot.v1.models;

import lombok.*;
import org.hibernate.validator.constraints.Range;
import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.sql.Timestamp;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@ToString
@Table(name = "review")
public class ReviewModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long reviewId;

    @NotNull(message = "Review Date Can not be NULL")
    private Timestamp reviewDate;
    @Range(message = "Review Rate OUT OF 5", min = 0, max = 5)
    @Column(nullable = false)
    private int reviewRate;
    private String reviewComment;

    @NotNull(message = "Review User Can not be NULL")
    @ManyToOne(cascade = {CascadeType.MERGE})
    @JoinColumn(
            name = "user_id",
            referencedColumnName = "userId")
    private UserModel user;

    @NotNull(message = "Review Restaurant Can not be NULL")
    @ManyToOne(cascade = {CascadeType.MERGE})
    @JoinColumn(
            name = "restaurant_id",
            referencedColumnName = "restaurantId"
    )
    private RestaurantModel restaurant;
}