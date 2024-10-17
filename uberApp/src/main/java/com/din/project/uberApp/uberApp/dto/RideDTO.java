package com.din.project.uberApp.uberApp.dto;

import com.din.project.uberApp.uberApp.entities.enums.PaymentMethod;
import com.din.project.uberApp.uberApp.entities.enums.RideStatus;

import java.awt.*;
import java.time.LocalDateTime;

public class RideDTO {
    private Long id;
    private Point pickupLocation;
    private Point dropoffLocation;
    private LocalDateTime createdTime;
    private RideRequestDTO rider;
    private DriverDTO driver;
    private PaymentMethod paymentMethod;
    private RideStatus rideStatus;
    private Double fare;
    private LocalDateTime startedAt;
    private LocalDateTime endedAt;
}
