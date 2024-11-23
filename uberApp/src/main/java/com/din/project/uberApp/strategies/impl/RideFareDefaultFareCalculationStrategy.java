package com.din.project.uberApp.strategies.impl;

import com.din.project.uberApp.entities.RideRequest;
import com.din.project.uberApp.services.DistanceService;
import com.din.project.uberApp.strategies.RideFareCalculationStrategy;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class RideFareDefaultFareCalculationStrategy implements RideFareCalculationStrategy {

    private final DistanceService distanceService;

    @Override
    public double calculateFare(RideRequest rideRequest) {

        Double distance = distanceService.calculateDistance(rideRequest.getPickupLocation(),
                            rideRequest.getDropoffLocation());


    }
}
