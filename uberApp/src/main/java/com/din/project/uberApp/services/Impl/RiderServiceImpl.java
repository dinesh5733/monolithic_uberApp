package com.din.project.uberApp.services.Impl;

import com.din.project.uberApp.dto.RideRequestDTO;
import com.din.project.uberApp.dto.RiderDTO;
import com.din.project.uberApp.dto.RideDTO;
import com.din.project.uberApp.services.RiderService;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class RiderServiceImpl implements RiderService {
    @Override
    public RideRequestDTO requestRide(RideRequestDTO rideRequestDTO) {
        return null;
    }

    @Override
    public RideDTO rateRider(Long rideId, Integer rating) {
        return null;
    }

    @Override
    public RiderDTO getMyProfile() {
        return null;
    }

    @Override
    public List<RideDTO> getAllMyRides() {
        return null;
    }
}
