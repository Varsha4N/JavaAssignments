package com.targetindia.Shapes;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class Shape {
    private String color="red";
    private boolean filled=true;

    @Override
    public String toString (){
        return "A Shape with color "+color+" and "+(filled ? "filled":"not filled");
    }
}
