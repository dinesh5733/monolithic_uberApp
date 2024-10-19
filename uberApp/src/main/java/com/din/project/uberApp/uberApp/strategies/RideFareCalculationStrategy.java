package com.din.project.uberApp.uberApp.strategies;

import com.din.project.uberApp.uberApp.dto.RideRequestDTO;

public interface RideFareCalculationStrategy {
    double calculateFare(RideRequestDTO rideRequestDTO);
}
