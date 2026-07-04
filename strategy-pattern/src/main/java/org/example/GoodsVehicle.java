package org.example;

import org.example.strategy.NormalDrive;

public class GoodsVehicle extends Vehicle {
    GoodsVehicle(){
        super(new NormalDrive());
    }
}
