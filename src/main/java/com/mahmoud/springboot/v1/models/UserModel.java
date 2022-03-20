package com.mahmoud.springboot.v1.models;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Table(name = "user")
public class UserModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long userId;


    @OneToMany(fetch = FetchType.EAGER, mappedBy = "user")
    List<ReviewModel> reviews = new java.util.ArrayList<>();
}