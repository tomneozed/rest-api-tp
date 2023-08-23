package com.formation.api.persistence.entity;

import jakarta.persistence.*;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name = "point")
@Getter
@Setter
@ToString
@EqualsAndHashCode
public class POI {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", unique = true, nullable = false)
    private Long id;

    @Column (name = "nom", length=100, unique = true)
    private String name;

    @Lob
    @Column (name = "adresse")
    private String address;

    @Column (name = "latitude")
    private Double lat;

    @Column (name = "longitude")
    private Double lng;
}
