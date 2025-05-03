// src/main/java/com/example/dongli/controller/ServiceController.java
package com.example.dongli.controller;

import com.example.dongli.model.TourismService;
import com.example.dongli.repository.TourismServiceRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/admin/services")
@RequiredArgsConstructor
public class ServiceController {

    private final TourismServiceRepository serviceRepository;

    @GetMapping
    @PreAuthorize("hasRole('ADMIN')")
    public List<TourismService> getAllServices() {
        return serviceRepository.findAll();
    }

    @PostMapping
    @PreAuthorize("hasRole('ADMIN')")
    public TourismService createService(@RequestBody TourismService service) {
        return serviceRepository.save(service);
    }
}