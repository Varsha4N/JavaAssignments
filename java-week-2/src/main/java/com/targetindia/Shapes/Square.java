package com.targetindia.Shapes;

import lombok.*;

@Setter
@Getter
@NoArgsConstructor
public class Square extends Rectangle{
    private double side=1.0;

    public Square( String color, boolean filled, double side) {
        super(side,side ,color, filled);
        this.side = side;
    }

    @Override
    public void setWidth (double side){
        super.setWidth(side);
    }

    @Override
    public void setLength (double side){
        super.setLength(side);
    }
    @Override
    public String toString(){
        return "A Square with side = "+
                side+" , which is a subclass of "+super.toString();
    }
}
