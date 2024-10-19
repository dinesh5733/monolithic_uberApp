package com.din.project.uberApp.dto;

import com.din.project.uberApp.entities.Driver;
import com.din.project.uberApp.entities.Rider;
import com.din.project.uberApp.entities.enums.PaymentMethod;
import com.din.project.uberApp.entities.enums.RideRequestStatus;

import java.awt.*;
import java.time.LocalDateTime;

public class RideRequestDTO {
    private Long id;
    private Point pickupLocation;
    private Point dropoffLocation;
    private LocalDateTime createdTime;
    private Rider rider;
    private Driver driver;
    private PaymentMethod paymentMethod;
    private RideRequestStatus rideRequestStatus;
}
