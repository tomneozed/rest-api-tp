package com.formation.api.service.impl;

import com.formation.api.dto.POIDefinition;
import com.formation.api.dto.POIItem;
import com.formation.api.dto.POIListItem;
import com.formation.api.exception.NotFoundException;
import com.formation.api.persistence.entity.POI;
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
        return poiRepository.findById(id).map(p -> new POIItem(
                p.getId(),
                p.getName(),
                p.getAddress(),
                p.getLat(),
                p.getLng()
        )).orElseThrow(() -> new NotFoundException("L'item d'id " + id + " n'existe pas."));
    }

    @Override
    public void delete(long id) {
        POI p = poiRepository.findById(id)
                .orElseThrow(() -> new NotFoundException("L'item d'id " + id + " n'existe pas."));
        poiRepository.delete(p);
    }

    @Override
    public POIItem save(POIDefinition poi) {
        POI p = new POI();
        p.setId(poi.getId());
        p.setName(poi.getName());
        p.setAddress(poi.getAddress());

        p = poiRepository.save(p);
        return new POIItem(p.getId(), p.getName(), p.getAddress(), p.getLat(), p.getLng());
    }
}
