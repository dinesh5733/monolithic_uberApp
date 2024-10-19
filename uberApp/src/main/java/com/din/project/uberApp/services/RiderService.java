package com.din.project.uberApp.services;

import com.din.project.uberApp.dto.RideRequestDTO;
import com.din.project.uberApp.dto.RiderDTO;
import com.din.project.uberApp.dto.RideDTO;

import java.util.List;

public interface RiderService {

    RideRequestDTO requestRide(RideRequestDTO rideRequestDTO);

    RideDTO rateRider(Long rideId, Integer rating);

    RiderDTO getMyProfile();

    List<RideDTO> getAllMyRides();
}
