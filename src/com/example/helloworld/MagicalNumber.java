package com.example.helloworld;

/**
 * Created by Oussama on 12/05/2016.
 */
public class MagicalNumber {

    public static void displayMagicalNumber(int pIMin, int pIMax) {
        if(pIMin>pIMax ){
            System.out.println("check your params");
        }
        else{
            for (int i=pIMin;i<=pIMax;i++){

                if( i != 0 && ( i % 3 == 0 ) )
                {
                    System.out.println("H");
                }
                else if( i != 0 && ( i % 5 == 0 ) )
                {
                    System.out.println("S");
                }
                else System.out.println(i);
            }
        }

    }
}
