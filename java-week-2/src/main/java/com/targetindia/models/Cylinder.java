package com.targetindia.models;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@NoArgsConstructor
public class Cylinder extends  Circle{
    private double height = 1.0;
    public Cylinder (double radius){
        super(radius);
    }

    public Cylinder(Double radius, double height) {
        super(radius);
        this.height = height;
    }

    public Cylinder(Double radius, double height, String color) {
        super(radius, color);
        this.height = height;
    }

    public double getVolume (){
        return getArea()*height;
    }

}
