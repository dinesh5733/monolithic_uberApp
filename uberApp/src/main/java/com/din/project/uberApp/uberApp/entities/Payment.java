package com.din.project.uberApp.uberApp.entities;

import com.din.project.uberApp.uberApp.entities.enums.PaymentMethod;
import com.din.project.uberApp.uberApp.entities.enums.PaymentStatus;
import jakarta.persistence.*;
import org.hibernate.annotations.CreationTimestamp;

import java.time.LocalDateTime;

public class Payment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Enumerated(EnumType.STRING)
    private PaymentMethod paymentMethod;
    @OneToOne(fetch = FetchType.LAZY)
    private Ride ride;
    private Double amount;
    @Enumerated(EnumType.STRING)
    private PaymentStatus paymentStatus;
    @CreationTimestamp
    private LocalDateTime paymentTime;
}
