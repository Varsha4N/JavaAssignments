package com.targetindia.models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class Person {

    private String name;
    private String address;

    @Override
    public String toString (){
        return "Person [ name = " + name +" ,address = "+address+" ]";
    }
}
