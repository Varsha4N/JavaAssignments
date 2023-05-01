package com.targetindia.programs;

import java.util.Scanner;

public class ReverseSentence {

    public static String reverseByWords ( String sentence ){

        String[] stringArray = sentence.split(" ");

       StringBuffer sb = new StringBuffer() ;

        for(int i= stringArray.length-1  ; i>=0 ; i--){

            sb.append(stringArray[i]).append(' ');

        }

        return new String(sb);
    }

    public static void main(String[] args) {

        String sentence;
        Scanner sc = new Scanner( System.in );

        System.out.print(" Enter : ");

        sentence = sc.nextLine();

        System.out.println("Result : " + reverseByWords(sentence));


    }

}
