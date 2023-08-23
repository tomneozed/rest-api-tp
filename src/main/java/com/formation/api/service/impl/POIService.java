package com.formation.api.service.impl;

import com.formation.api.dto.POIDefinition;
import com.formation.api.dto.POIItem;
import com.formation.api.dto.POIListItem;
import com.formation.api.persistence.repository.POIRepository;
import com.formation.api.service.IPOIService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class POIService implements IPOIService {

    private final POIRepository poiRepository;

    public POIService(POIRepository poiRepository) {
        this.poiRepository = poiRepository;
    }

    @Override
    public List<POIListItem> findAll() {
        return poiRepository.findAll()
                .stream()
                .map(p -> new POIListItem(p.getId(), p.getName()))
                .toList();
    }

    @Override
    public POIItem findOne(long id) {
        //TODO: retrieve the matching entity from DB and convert to DTO if found, or throw NotFoundException if not available
        return null;
    }

    @Override
    public void delete(long id) {
        //TODO: delete the matching entity if found, or throw NotFoundException if not available
    }

    @Override
    public POIItem save(POIDefinition poi) {
        //TODO: save or update (depending on the presence of ID in the parameter) to DB and return the matching DTO
        return null;
    }
}
