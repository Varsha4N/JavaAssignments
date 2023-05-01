package com.targetindia.programs;

import java.util.Scanner;

public class FibonacciNumber {

    public static int fibonacci ( int num ) {

        int n1 = 0 , n2 =1 , n3=0 ;
        int counter=3;

        if( num == 1 ) {
            return n1;
        }
        if( num == 2 ) {
            return n2;
        }

        while ( counter <= num ) {

            n3 = n1 + n2;
            n1 = n2;
            n2 = n3;
            counter++;


        }


        return n3 ;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int index ;

        System.out.print("Enter fibonacci index : ");
        index = sc.nextInt();

        System.out.println("Fibonacci number at "+index+ " position is "+ fibonacci(index));
    }

}
