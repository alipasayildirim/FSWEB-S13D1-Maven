package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("**************SHOULD WAKE UP*******************");
        System.out.println(shouldWakeUp(true,1));
        System.out.println("****************HAS TEEN****************");
        System.out.println(hasTeen(15,22,33));
        System.out.println("***************IS CAT PLAYING*************");
        System.out.println(isCatPlaying(true,26));
        System.out.println("****************AREA*************");

        Scanner scanner = new Scanner(System.in);
        System.out.print("Genişliği giriniz: ");
        double w = scanner.nextDouble();
        System.out.print("Yüksekliği giriniz: ");
        double h = scanner.nextDouble();
        System.out.println(area(w,h));

        System.out.println("****************RADIUS*************");
        System.out.println("Çap'ı giriniz:");
        double r = scanner.nextDouble();
        System.out.println(area(r));

    }
    public static boolean shouldWakeUp(boolean isBarking, int clock) {
        if(clock < 0 || clock >23){
            return false;
        }
        if(isBarking && (clock < 8 || clock>=20)){
            return true;
        }
        return false;

    }

    public static boolean hasTeen(int firstAge, int secondAge, int thirdAge) {
        if((firstAge >= 13 && firstAge <= 19) || (secondAge >= 13 && secondAge <= 19) || (thirdAge >= 13 && thirdAge <= 19)) {
            return true;
        }
        return false;
    }

    public static boolean isCatPlaying(boolean isSummer, int temp) {
        if(isSummer && (temp >= 25 && temp <= 45)){
            return true;
        }
        if (!isSummer && (temp >= 25 && temp <= 35)){
            return true;
        }
        return false;
    }

    public static double area(double width, double height) {
        if(width < 0 || height < 0){
            return -1;
        }
        return width * height;
    }

    public static double area(double radius) {
        if(radius < 0 ){
            return -1;
        }
        return radius * radius * Math.PI;
    }

}
