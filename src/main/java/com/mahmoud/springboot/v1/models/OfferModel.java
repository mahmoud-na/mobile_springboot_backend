package com.mahmoud.springboot.v1.models;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.List;

@Entity
@Data
@Builder
@Table(name = "offer")
@NoArgsConstructor
@AllArgsConstructor
public class OfferModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long offerId;
    private String offerTitle;
    private String offerDescription;
    private Timestamp offerStart;
    private Timestamp offerEnd;

    @ElementCollection
    @CollectionTable(
            name = "offer_images",
            joinColumns = @JoinColumn(
                    name = "offer_id",
                    referencedColumnName = "offerId"
            )

    )
    List<String> offerImages;
}