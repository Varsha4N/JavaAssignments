package com.targetindia.programs;

import java.util.Scanner;

public class NumToWords {

    public static String inWords ( char[] num ) {

        int len = num.length ;

        if (len == 0){
            System.out.println("Invalid number ");
            return "";
        }
        


        return "";
    }

    public static void main(String[] args) {

        Scanner sc =new Scanner( System.in );
        String num ;

        System.out.print("Enter a number : ");
        num = sc.next();

        System.out.println(num + " in words : " + inWords(num.toCharArray()));


    }

}
