package com.din.project.uberApp.uberApp.strategies;

import com.din.project.uberApp.uberApp.dto.RideRequestDTO;
import com.din.project.uberApp.uberApp.entities.Driver;

import java.util.List;

public interface DriverMatchingStrategy {
    List<Driver> findMatchingDriver(RideRequestDTO rideRequestDTO);
}
