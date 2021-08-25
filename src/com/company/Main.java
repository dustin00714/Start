package com.company;

import java.util.Scanner;
import  java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);


       String carHonda = "HONDA";
       String carToyota = "TOYOTA";
       String name;
       String address;
       String carBrand;
       double carPrice;
       double carPriceHonda = 850000;
       double carPriceToyota = 125000;
       int  paymentMode;
       int carOption;


        System.out.println("BULACAN CAR SHOP");

        System.out.println("Enter your name: ");
        name = in.next();

        System.out.println("Enter your address: ");
        address = in.next();

        System.out.println("Enter the car you choose: ");
        carOption= in.nextInt();

       if (carOption == 1 ){
           carBrand = carHonda;
           carPrice = carPriceHonda;

       }
       else if (carOption == 2){
           carBrand = carToyota;
           carPrice = carPriceToyota;

       }
       else {

           System.out.println("Invalid Input");
       }


        System.out.print("The price of the car you choose is: " );


        System.out.println("What mode do you want to use in payment? ");

        System.out.println("[1] FULL PAYMENT(10% Discount)" );
        System.out.println("[2] SEMI ANNUAL(5% Interest)");
        System.out.println("[3] QUARTERLY(10% Interest)");

        System.out.println("Enter the Discount you want");
        paymentMode = in.nextInt();

        switch (paymentMode){

            case 1:

                System.out.print("FullPayment");
                break;
            case 2:

                System.out.print("Annual Payment" );
                break;
            case 3:

                System.out.print("Quarterly Payment" );
                break;

        }

        name = "Name";
        address = "Address";
        carBrand = "CarBrand";


    }
}
