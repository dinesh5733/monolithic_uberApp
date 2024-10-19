package com.din.project.uberApp.strategies;

import com.din.project.uberApp.dto.RideRequestDTO;

public interface RideFareCalculationStrategy {
    double calculateFare(RideRequestDTO rideRequestDTO);
}
