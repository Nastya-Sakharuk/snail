package com.epam.rd.autotasks.snail;

import java.util.Scanner;

public class Snail
{
    public static void main(String[] args)
    {
        //Write a program that reads a,b and h (line by lyne in this order) and prints
        //the number of days for which the snail reach the top of the tree.
        //a - feet that snail travels up each day, b - feet that slides down each night, h - height of the tree
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        int h = scan.nextInt();
        System.out.println(a);
        System.out.println(b);
        System.out.println(h);

        int i;
        if (a >= h) {
            System.out.println(1);
        } else if (a < b) {
            System.out.println("Impossible");
        } else if (a == b && a < h) {
            System.out.println("Impossible");
        } else {
            for ( i = 0; i <= ((h-b)/(a-b)-1); i++) {
            }
            System.out.println(i);
        }

    }
}
