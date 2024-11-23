package com.din.project.uberApp.strategies;

import com.din.project.uberApp.dto.RideRequestDTO;
import com.din.project.uberApp.entities.Driver;
import com.din.project.uberApp.entities.RideRequest;

import java.util.List;

public interface DriverMatchingStrategy {

    List<Driver> findMatchingDriver(RideRequest rideRequest);
}
