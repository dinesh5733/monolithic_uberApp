package com.din.project.uberApp.strategies.impl;

import com.din.project.uberApp.dto.RideRequestDTO;
import com.din.project.uberApp.entities.Driver;
import com.din.project.uberApp.entities.RideRequest;
import com.din.project.uberApp.strategies.DriverMatchingStrategy;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DriverMatchingHighestRatedDriverStrategy implements DriverMatchingStrategy {

    @Override
    public List<Driver> findMatchingDriver(RideRequest rideRequest) {
        return List.of();
    }
}
