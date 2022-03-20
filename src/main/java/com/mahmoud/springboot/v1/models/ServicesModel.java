package com.mahmoud.springboot.v1.models;


import lombok.*;
import org.hibernate.validator.constraints.URL;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Builder
@Table(name = "services")
public class ServicesModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long serviceId;
    @NotBlank(message = "Service name must be not empty")
    private String serviceName;
    @NotNull(message = "Service Logo URL Not valid")
    @URL(message = "Service Logo URL Not valid")
    private String serviceLogo;
}
