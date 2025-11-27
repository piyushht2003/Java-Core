package Basics;

import java.util.Scanner;

public class VolumeOfSphere {
    public static void main(String[] args) {
        double pi = 3.141592;
        Scanner sc = new Scanner(System.in);
        double r = sc.nextDouble();

        double volume =  (double) 4 /3 * pi * r * r * r;
        System.out.println(volume);
    }
}
