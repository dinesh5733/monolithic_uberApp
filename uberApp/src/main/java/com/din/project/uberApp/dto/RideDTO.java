package com.din.project.uberApp.dto;

import com.din.project.uberApp.entities.enums.RideStatus;
import com.din.project.uberApp.entities.enums.PaymentMethod;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.awt.*;
import java.time.LocalDateTime;
@Data
@NoArgsConstructor
@AllArgsConstructor
public class RideDTO {
    private Long id;
    private Point pickupLocation;
    private Point dropoffLocation;
    private LocalDateTime createdTime;
    private RideRequestDTO rider;
    private DriverDTO driver;
    private PaymentMethod paymentMethod;
    private RideStatus rideStatus;
    private String otp;
    private Double fare;
    private LocalDateTime startedAt;
    private LocalDateTime endedAt;
}
