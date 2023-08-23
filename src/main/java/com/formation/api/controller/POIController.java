package com.formation.api.controller;

import com.formation.api.dto.POIDefinition;
import com.formation.api.dto.POIItem;
import com.formation.api.dto.POIListItem;
import com.formation.api.service.IPOIService;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "/api/poi")
public class POIController {

    private final IPOIService poiService;

    public POIController(IPOIService poiService) {
        this.poiService = poiService;
    }

    @GetMapping
    List<POIListItem> findAll() {
        return poiService.findAll();
    }

    @GetMapping(path = "/{id}")
    POIItem findOne(@PathVariable long id) {
        //TODO: return the result of the lookup invocation within the service layer
        return null;
    }

    @DeleteMapping(path = "/{id}")
    @ResponseStatus(code = HttpStatus.OK)
    void delete(@PathVariable long id) {
        //TODO: invoke the deletion of the matching entity by the service layer
    }

    @PostMapping
    POIItem save(@RequestBody POIDefinition poi) {
        //TODO: invoke the persistence of the poi parameter by the service layer, and return the persisted data
        return null;
    }
}
