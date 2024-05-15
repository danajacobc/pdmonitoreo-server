package com.pdm.pdmonitoreo.api.controllers;

import com.pdm.pdmonitoreo.api.models.request.PlantasRequest;
import com.pdm.pdmonitoreo.api.models.responses.PlantasResponse;
import com.pdm.pdmonitoreo.infraestructure.abstract_service.IPlantasService;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "plantas")
@AllArgsConstructor
public class PlantasController {

    private final IPlantasService plantasService;

    @PostMapping
    public ResponseEntity<PlantasResponse> post(@RequestBody PlantasRequest request) {
        return ResponseEntity.ok(plantasService.create(request));
    }

}
