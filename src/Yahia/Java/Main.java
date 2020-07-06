package Yahia.Java;

import javax.swing.*;

public class Main {

    public static void main(String[] args) {

        long miles = SpeedConverter.toMilesPerHour(50);
        System.out.print("Miles= " + miles);
        SpeedConverter.printConversion(50);
    }
}
