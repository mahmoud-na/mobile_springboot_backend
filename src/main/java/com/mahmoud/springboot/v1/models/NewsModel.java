package com.mahmoud.springboot.v1.models;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.LazyCollection;
import org.hibernate.annotations.LazyCollectionOption;
import org.hibernate.validator.constraints.URL;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
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
    @NotBlank(message = "New title must be not empty")
    private String newTittle;
    @NotBlank(message = "New description must be not empty")
    private String newDescription;
    @NotNull(message = "New Date can not be NULL")
    private Timestamp newDate;

    @ElementCollection
    @CollectionTable(name = "new_Image", joinColumns = @JoinColumn(name = "newId"))
    private List<@URL(message = "New Image URL is not valid") @NotNull(message = "New Image URL is not valid") String> newImages = new java.util.ArrayList<>();
}
