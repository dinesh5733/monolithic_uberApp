package com.din.project.uberApp.uberApp.repositories;

import com.din.project.uberApp.uberApp.entities.RideRequest;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RideRequestRepository extends JpaRepository<RideRequest, Long> {
}
