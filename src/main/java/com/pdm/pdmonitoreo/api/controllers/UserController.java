package com.pdm.pdmonitoreo.api.controllers;

import com.pdm.pdmonitoreo.api.models.request.PaisRequest;
import com.pdm.pdmonitoreo.api.models.request.UserRequest;
import com.pdm.pdmonitoreo.api.models.responses.PaisResponse;
import com.pdm.pdmonitoreo.api.models.responses.UserResponse;
import com.pdm.pdmonitoreo.infraestructure.abstract_service.IUserService;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;

@RestController
@RequestMapping(path = "user")
@AllArgsConstructor
public class UserController {

    private final IUserService userService;

    @PostMapping
    public ResponseEntity<UserResponse> post(@RequestBody UserRequest request) {
        return ResponseEntity.ok(userService.create(request));
    }

    @GetMapping(path = "{id}")
    public ResponseEntity<UserResponse> get(@PathVariable UUID id) {
        return ResponseEntity.ok(userService.read(id));
    }
}
