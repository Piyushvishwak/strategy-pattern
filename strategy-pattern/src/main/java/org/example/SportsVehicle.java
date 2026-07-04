package org.example;

import org.example.strategy.SportsDrive;

public class SportsVehicle extends Vehicle {
    SportsVehicle(){
        super(new SportsDrive());
    }
}
