package com.formation.api.service;

import com.formation.api.dto.POIDefinition;
import com.formation.api.dto.POIItem;
import com.formation.api.dto.POIListItem;

import java.util.List;

public interface IPOIService {

    List<POIListItem> findAll();

    POIItem findOne(long id);

    void delete(long id);

    POIItem save(POIDefinition poi);
}
