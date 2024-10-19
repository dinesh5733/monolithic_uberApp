package com.din.project.uberApp.uberApp.strategies.impl;

import com.din.project.uberApp.uberApp.dto.RideRequestDTO;
import com.din.project.uberApp.uberApp.entities.Driver;
import com.din.project.uberApp.uberApp.strategies.DriverMatchingStrategy;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DriverMatchingHighestRatedDriverStrategy implements DriverMatchingStrategy {
    @Override
    public List<Driver> findMatchingDriver(RideRequestDTO rideRequestDTO) {
        return null;
    }
}
