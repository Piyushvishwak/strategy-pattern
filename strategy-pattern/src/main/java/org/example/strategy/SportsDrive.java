package org.example.strategy;

public class SportsDrive implements DriveStrategy {
    @Override
    public void drive() {
        System.out.println("Sports car is driving");
    }
}
