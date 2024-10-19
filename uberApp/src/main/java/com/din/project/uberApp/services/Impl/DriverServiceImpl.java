package com.din.project.uberApp.services.Impl;

import com.din.project.uberApp.dto.DriverDTO;
import com.din.project.uberApp.dto.RideDTO;
import com.din.project.uberApp.services.DriverService;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class DriverServiceImpl implements DriverService {
    @Override
    public RideDTO cancelRide(Long rideId) {
        return null;
    }

    @Override
    public RideDTO startRide(Long rideId) {
        return null;
    }

    @Override
    public RideDTO endRide(Long rideId) {
        return null;
    }

    @Override
    public RideDTO rateRider(Long rideId, Integer rating) {
        return null;
    }

    @Override
    public DriverDTO getMyProfile() {
        return null;
    }

    @Override
    public List<RideDTO> getAllMyRides() {
        return null;
    }
}
