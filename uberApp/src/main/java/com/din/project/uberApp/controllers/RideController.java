package com.din.project.uberApp.controllers;

import com.din.project.uberApp.dto.RideRequestDTO;
import com.din.project.uberApp.services.RiderService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/rider")
@RequiredArgsConstructor
public class RideController {

    private final RiderService riderService;
    @PostMapping("/requestRide")
    public RideRequestDTO requestRide(@RequestBody RideRequestDTO rideRequestDTO) {
        return riderService.requestRide(rideRequestDTO);
    }
}
