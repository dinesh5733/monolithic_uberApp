package com.din.project.uberApp.strategies;

import com.din.project.uberApp.entities.RideRequest;

public interface RideFareCalculationStrategy {

    double RIDE_FLARE_MULTIPLIER = 10;

    double calculateFare(RideRequest rideRequest);
}
