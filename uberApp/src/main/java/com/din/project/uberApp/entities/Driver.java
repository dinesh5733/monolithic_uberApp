package com.din.project.uberApp.entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.awt.*;

@Entity
@Getter
@Setter
@Table(name = "driver")
public class Driver {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToOne
    @JoinColumn(name = "user_id")
    private User user;
    private Double rating;
    private Boolean available;
    private String vehicleId;
    @Column(columnDefinition = "Geometry(Point,4326)")
    Point currentLocation;
}
