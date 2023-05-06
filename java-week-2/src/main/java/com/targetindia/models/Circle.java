package com.targetindia.models;

import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Circle {
    private Double radius =1.0;
    private String color = "red";

    public Circle(Double radius) {
        this.radius = radius;
    }

    public double getArea (){
        return 2* Math.PI* radius ;

    }

    @Override
    public String toString (){

        return "Circle [ " +
                "radius = " + radius +
                " ,color = "+ color + " ]";

    }

}
