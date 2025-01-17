package com.swati.project.uber.uberApp.strategies.impl;

import com.swati.project.uber.uberApp.entities.Driver;
import com.swati.project.uber.uberApp.entities.RideRequest;
import com.swati.project.uber.uberApp.repositories.DriverRepository;
import com.swati.project.uber.uberApp.strategies.DriverMatchingStrategy;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class DriverMatchingHigestRatedDriverStrategy implements DriverMatchingStrategy {

    private final DriverRepository driverRepository;

    @Override
    public List<Driver> findMatchingDriver(RideRequest rideRequest) {
        return driverRepository.findTenNearbyTopRatedDrivers(rideRequest.getPickUpLocation());
    }
}
