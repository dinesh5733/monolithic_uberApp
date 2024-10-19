package com.din.project.uberApp.dto;

import com.din.project.uberApp.entities.enums.RideStatus;
import com.din.project.uberApp.entities.enums.PaymentMethod;

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
