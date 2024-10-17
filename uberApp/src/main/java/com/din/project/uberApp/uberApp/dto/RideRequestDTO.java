package com.din.project.uberApp.uberApp.dto;

import com.din.project.uberApp.uberApp.entities.Driver;
import com.din.project.uberApp.uberApp.entities.Rider;
import com.din.project.uberApp.uberApp.entities.enums.PaymentMethod;
import com.din.project.uberApp.uberApp.entities.enums.RideRequestStatus;
import jakarta.persistence.*;
import org.hibernate.annotations.CreationTimestamp;

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
