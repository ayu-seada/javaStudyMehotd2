package Yahia.Java;

import javax.swing.*;

public class Main {

    public static void main(String[] args) {
	toMilesPerHour(50);
    }
    public static long toMilesPerHour(double kilometersPerHour){
        if(kilometersPerHour <0 ) {return -1;}
       long milesPerHour = Math.round(kilometersPerHour / 1.60934);
        System.out.print(kilometersPerHour+"KM/H are " + milesPerHour+"MPH");
        return 1;



    }
}
