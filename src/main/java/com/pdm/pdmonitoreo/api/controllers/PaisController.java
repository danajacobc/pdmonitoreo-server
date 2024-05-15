package com.pdm.pdmonitoreo.api.controllers;

import com.pdm.pdmonitoreo.api.models.request.PaisRequest;
import com.pdm.pdmonitoreo.api.models.responses.PaisResponse;
import com.pdm.pdmonitoreo.api.models.responses.PlantasResponse;
import com.pdm.pdmonitoreo.infraestructure.abstract_service.IPaisService;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;

@RestController
@RequestMapping(path = "pais")
@AllArgsConstructor
public class PaisController {

    private final IPaisService paisService;

    @PostMapping
    public ResponseEntity<PaisResponse> post(@RequestBody PaisRequest request) {
        return ResponseEntity.ok(paisService.create(request));
    }

    @GetMapping(path = "{id}")
    public ResponseEntity<PaisResponse> get(@PathVariable UUID id) {
        return ResponseEntity.ok(paisService.read(id));
    }
}
