package com.swati.project.uber.uberApp.strategies;

import com.swati.project.uber.uberApp.entities.Driver;
import com.swati.project.uber.uberApp.entities.RideRequest;

import java.util.List;

public interface DriverMatchingStrategy {

    List<Driver> findMatchingDriver(RideRequest rideRequest);
}