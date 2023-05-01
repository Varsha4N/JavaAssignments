package com.targetindia.programs;

import java.util.Scanner;

public class PrimeCheck {

    static boolean isPrimeNumber ( int number ) {

        int n = 2 ;

        while ( n <= number/2 ){

            if( number % n == 0){
                return false;
            }
            n++;
        }

        return true;
    }

    public static void main(String[] args) {

        int number;
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number : ");
        number = sc.nextInt();

        if ( isPrimeNumber ( number )){

            System.out.println(number + " is a prime");

        }

        else {

            System.out.println( number + " is not a prime ");

        }


    }
}
