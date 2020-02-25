package com.pacakage.PrimeNumber;

import java.util.ArrayList;

public class PrimeNumber {

    public static void main (String[] args) {
        System.out.println (findPrime (1,100));

    }

    public static ArrayList<Integer> findPrime (int first, int last){
        ArrayList<Integer> primes = new ArrayList<Integer> ();

        for(int x = first; x < last; x++){

            boolean isPrime = true;
            int y = 2;
            while( y <= x/2){
                if ( x % y == 0){
                    isPrime = false;
                    break;
                }
                y++;
            }
            if (isPrime){
                primes.add (x);
            }

        }
        return primes;
    }

}