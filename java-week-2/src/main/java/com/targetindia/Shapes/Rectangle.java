package com.targetindia.Shapes;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@NoArgsConstructor
public class Rectangle extends Shape{
    private double width=1.0;
    private double length = 1.0;

    public Rectangle(double width, double length) {
        this.width = width;
        this.length=length;
    }

    public Rectangle(double width, double length,String color, boolean filled) {
        super(color, filled);
        this.width = width;
        this.length =length;
    }
    public double getArea(){

        return width * length;
    }
    public double getPerimeter(){
        return 2 * ( width + length);
    }
    @Override
    public String toString (){
        return "A Rectangle with width = "+width +
                " and length = "+length+
                "which is a subclass of "+super.toString();
    }

}
