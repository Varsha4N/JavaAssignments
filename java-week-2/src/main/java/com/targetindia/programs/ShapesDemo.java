package com.targetindia.programs;

import com.targetindia.Shapes.Circle;
import com.targetindia.Shapes.Rectangle;
import com.targetindia.Shapes.Shape;
import com.targetindia.Shapes.Square;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class ShapesDemo {
    public static void main(String[] args) {

        Shape[] shapes = {
                new Circle("Red",true,5.2),
                new Rectangle(5.0 ,6.3,"yellow",false),
                new Square("Blue",true,9),
                new Circle("Teal",false,4),
                new Rectangle(5.0 ,6.3),
                new Square(),
                new Circle(),
                new Rectangle(),
                new Square("pink",false,5),
                new Square("black",true,2)
        };
        for (Shape shape: shapes) {
            if(shape instanceof Circle){
                Circle c= (Circle) shape;
                log.trace("Circle :: Area :{} , Perimeter :{} ",c.getArea(),c.getPerimeter());
            }
            else if (shape instanceof Rectangle){
                Rectangle r = (Rectangle) shape;
                log.trace("Rectangle :: Area : {} , Perimeter : {}",r.getArea(),r.getPerimeter());
            }
            else{
                Square s =(Square) shape;
                log.trace("Square :: Area: {} , Perimeter :{}",s.getArea(),s.getPerimeter());
            }


        }

    }
}
