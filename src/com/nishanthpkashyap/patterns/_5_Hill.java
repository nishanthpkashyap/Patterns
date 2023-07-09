package com.nishanthpkashyap.patterns;

public class _5_Hill {
    public static void main(String[] args) {
        int n = 5;
        for(int i = 1; i <= n; i++) {

            //decreasing triangle space
            for(int j = i; j <= n; j++) {
                System.out.print("  ");
            }

            //increasing triangle without apex
            for(int j = 1; j <= i-1; j++) {
                System.out.print("* ");
            }

            //increasing triangle with apex
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
