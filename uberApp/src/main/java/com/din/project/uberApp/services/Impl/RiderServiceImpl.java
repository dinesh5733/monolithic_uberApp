package com.din.project.uberApp.services.Impl;

import com.din.project.uberApp.dto.RideDTO;
import com.din.project.uberApp.dto.RideRequestDTO;
import com.din.project.uberApp.dto.RiderDTO;
import com.din.project.uberApp.entities.RideRequest;
import com.din.project.uberApp.entities.enums.RideRequestStatus;
import com.din.project.uberApp.repositories.RideRequestRepository;
import com.din.project.uberApp.services.RiderService;
import com.din.project.uberApp.strategies.DriverMatchingStrategy;
import com.din.project.uberApp.strategies.RideFareCalculationStrategy;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
@Slf4j
public class RiderServiceImpl implements RiderService {

    private final ModelMapper modelMapper;
    private final RideFareCalculationStrategy rideFareCalculationStrategy;
    private final DriverMatchingStrategy driverMatchingStrategy;
    private final RideRequestRepository rideRequestRepository;

    @Override
    public RideRequestDTO requestRide(RideRequestDTO rideRequestDTO) {

        RideRequest rideRequest = modelMapper.map(rideRequestDTO, RideRequest.class);
        rideRequest.setRideRequestStatus(RideRequestStatus.PENDING);

        Double fare = rideFareCalculationStrategy.calculateFare(rideRequest);
        rideRequest.setFare(fare);

        RideRequest savedRideRequest = rideRequestRepository.save(rideRequest);
        driverMatchingStrategy.findMatchingDriver(rideRequest);

        return modelMapper.map(savedRideRequest, RideRequestDTO.class);
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
