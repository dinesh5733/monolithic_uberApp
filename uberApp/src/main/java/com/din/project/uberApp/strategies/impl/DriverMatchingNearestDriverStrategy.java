package com.din.project.uberApp.strategies.impl;

import com.din.project.uberApp.dto.RideRequestDTO;
import com.din.project.uberApp.entities.Driver;
import com.din.project.uberApp.strategies.DriverMatchingStrategy;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class DriverMatchingNearestDriverStrategy implements DriverMatchingStrategy {
    @Override
    public List<Driver> findMatchingDriver(RideRequestDTO rideRequestDTO) {
        return List.of();
    }
}
