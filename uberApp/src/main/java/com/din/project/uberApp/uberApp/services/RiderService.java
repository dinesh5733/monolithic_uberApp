package com.din.project.uberApp.uberApp.services;

import com.din.project.uberApp.uberApp.dto.DriverDTO;
import com.din.project.uberApp.uberApp.dto.RideDTO;
import com.din.project.uberApp.uberApp.dto.RideRequestDTO;

import java.util.List;

public interface RiderService {

    RideRequestDTO requestRide(Long rideId);

    RideDTO startRide(Long rideId);

    RideDTO endRide(Long rideId);

    RideDTO rateRider(Long rideId, Integer rating);

    DriverDTO getMyProfile();

    List<RideDTO> getAllMyRides();
}
