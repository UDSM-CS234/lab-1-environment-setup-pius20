package com.company;

public class Main {

    public static void main(String[] args) {
        double a = -9.81; // Acceleration in m/s^2
        double t = 10;
        double v = 0;
        double x = 0.0;
        double f = (0.5*a)*(t*t)+(v*t)+x;
        System.out.println(f);
    }
}
