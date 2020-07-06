package Yahia.Java;

public class SpeedConverter {

        public static long toMilesPerHour(double kilometersPerHour){
            if(kilometersPerHour <0 ) {return -1;}

            return Math.round(kilometersPerHour / 1.60934);

        }




        public static void printConversion(double kilometersPerHour){
            if (kilometersPerHour<0){ System.out.print("Invalid Value");
            }


            long milesPerHour = toMilesPerHour(kilometersPerHour);
            System.out.print(" // "+kilometersPerHour +"KM/H are " + milesPerHour+"MPH");}
}



