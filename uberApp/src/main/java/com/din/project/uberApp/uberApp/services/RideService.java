package com.din.project.uberApp.uberApp.services;

import com.din.project.uberApp.uberApp.dto.RideRequestDTO;
import com.din.project.uberApp.uberApp.entities.Driver;
import com.din.project.uberApp.uberApp.entities.Ride;
import com.din.project.uberApp.uberApp.entities.enums.RideStatus;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;

public interface RideService {

    Ride getRideById(Long rideId);

    void matchWithDriver(RideRequestDTO rideRequestDTO);

    Ride createNewRide(RideRequestDTO rideRequestDTO, Driver driver);

    Ride updateRideStatus(Long rideId, RideStatus rideStatus);

    Page<Ride> getAllRidesOfRider(Long rideId, PageRequest pageRequest);

}
