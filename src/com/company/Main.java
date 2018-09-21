package com.company;

public class Main {

    public static void main(String[] args) {


                int max = 10;

                for (int i = 1; i <= max; i++) {

                    boolean isPrimeNumber = true;
                    for (int j = 2; j < i; j++) {
                        if (i % j == 0){
                            isPrimeNumber = false;
                            break;

                        }
                    } if (i!= 1 && isPrimeNumber) {
                        System.out.println(i + " is a prime number");

                    }else {
                        System.out.println(i + " is not a prime number");
                    }

                }
            }
        }
	// write your code here


