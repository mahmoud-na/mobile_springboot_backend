package com.mahmoud.springboot.v1.models;

import lombok.*;
import org.hibernate.annotations.LazyCollection;
import org.hibernate.annotations.LazyCollectionOption;
import org.hibernate.validator.constraints.URL;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

@Entity
@Data
@Builder
@Table(name = "offer")
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class OfferModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long offerId;
    @NotBlank(message = "Offer title must be not empty")
    private String offerTitle;
    @NotBlank(message = "Offer description must be not empty")
    private String offerDescription;
    @NotNull(message = "Offer Start Date can not be NULL")
    private Timestamp offerStart;
    @NotNull(message = "Offer End Date can not be NULL")
    private Timestamp offerEnd;

    @Basic(fetch = FetchType.LAZY)
    @ElementCollection
    @CollectionTable(name = "offer_images", joinColumns = @JoinColumn(name = "offer_id"))
    @ToString.Exclude
List<@URL(message = "Offer Image URL is not valid") @NotNull(message = "Offer Image URL is not valid") String> offerImages = new ArrayList<>();
}