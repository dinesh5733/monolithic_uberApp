package com.din.project.uberApp.services;

import com.din.project.uberApp.dto.DriverDTO;
import com.din.project.uberApp.dto.RideDTO;

import java.util.List;

public interface DriverService {

    RideDTO cancelRide(Long rideId);

    RideDTO startRide(Long rideId);

    RideDTO endRide(Long rideId);

    RideDTO rateRider(Long rideId, Integer rating);

    DriverDTO getMyProfile();

    List<RideDTO> getAllMyRides();
}
