package com.formation.api.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class POIItem {
    private Long id;
    private String name;
    private String address;
    private Double lat;
    private Double lng;
}
