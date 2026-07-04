package org.example;

import org.example.strategy.DriveStrategy;

public class Vehicle {
    DriveStrategy driveObject;

    //constructor injection
    public Vehicle(DriveStrategy driveObj){
        this.driveObject = driveObj;
    }

    public void drive(){
        driveObject.drive();
    }
}
