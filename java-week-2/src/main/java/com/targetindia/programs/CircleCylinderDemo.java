package com.targetindia.programs;

import com.targetindia.models.Circle;
import com.targetindia.models.Cylinder;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class CircleCylinderDemo {
    public static void main(String[] args) {

        Circle[] circles = {
                new Cylinder(12.34),
                new Cylinder(12.34,10.0),
                new Cylinder(12.34,10.0,"blue")

        };

        for (Circle circle: circles ) {
            log.trace("Area of the circular region of the cylinder : {} units",circle.getArea());

            if(circle instanceof Cylinder){
                Cylinder c1 = (Cylinder) circle;
                log.trace("Volume of cylinder is {} sq. units",c1.getVolume());
            }

        }

    }
}
