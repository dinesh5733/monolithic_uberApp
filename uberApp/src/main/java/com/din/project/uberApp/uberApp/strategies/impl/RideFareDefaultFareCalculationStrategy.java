package com.din.project.uberApp.uberApp.strategies.impl;

import com.din.project.uberApp.uberApp.dto.RideRequestDTO;
import com.din.project.uberApp.uberApp.strategies.RideFareCalculationStrategy;
import org.springframework.stereotype.Service;

@Service
public class RideFareDefaultFareCalculationStrategy implements RideFareCalculationStrategy {
    @Override
    public double calculateFare(RideRequestDTO rideRequestDTO) {
        return 0;
    }
}
