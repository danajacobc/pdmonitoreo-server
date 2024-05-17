package com.pdm.pdmonitoreo.api.controllers;

import com.pdm.pdmonitoreo.api.models.request.PlantasRequest;
import com.pdm.pdmonitoreo.api.models.responses.PlantasResponse;
import com.pdm.pdmonitoreo.infraestructure.abstract_service.IPlantasService;
import lombok.AllArgsConstructor;
import lombok.Builder;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping(path = "plantas")
@AllArgsConstructor
public class PlantasController {

    private final IPlantasService plantasService;

    @PostMapping
    public ResponseEntity<PlantasResponse> post(@RequestBody PlantasRequest request) {
        return ResponseEntity.ok(plantasService.create(request));
    }

    @GetMapping(path = "{id}")
    public ResponseEntity<PlantasResponse> get(@PathVariable UUID id) {
        return ResponseEntity.ok(plantasService.read(id));
    }

    @GetMapping
    public ResponseEntity<List<PlantasResponse>> getAll() {
        return ResponseEntity.ok(plantasService.getAll());
    }

    @PutMapping(path = "{id}")
    public ResponseEntity<PlantasResponse> put(@PathVariable UUID id, @RequestBody PlantasRequest request) {
        return ResponseEntity.ok(this.plantasService.update(request, id));
    }

    @DeleteMapping(path = "{id}")
    public Boolean delete(@PathVariable UUID id) {
        this.plantasService.delete(id);
        return true;
    }
}
