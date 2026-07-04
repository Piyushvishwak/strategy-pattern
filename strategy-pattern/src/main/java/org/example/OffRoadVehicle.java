package org.example;

import org.example.strategy.SportsDrive;

public class OffRoadVehicle extends Vehicle {
    OffRoadVehicle(){
        super(new SportsDrive());
    };
}
