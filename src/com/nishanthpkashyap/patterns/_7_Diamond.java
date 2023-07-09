package com.nishanthpkashyap.patterns;

public class _7_Diamond {
    public static void main(String[] args) {
        int n = 5;

        //hill
        for(int i = 1; i <= n-1; i++) {

            //decreasing triangle space
            for(int j = i; j <= n; j++) {
                System.out.print("  ");
            }

            //increasing triangle with one less column
            for(int j = 1; j <= i-1; j++) {
                System.out.print("* ");
            }

            //increasing triangle
            for(int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        //reverse hill with one less row
        for(int i = 1; i <= n; i++) {

            //increasing triangle space
            for(int j = 1; j <= i; j++) {
                System.out.print("  ");
            }

            //decreasing triangle with one less column
            for(int j = i; j<= n-1; j++){
                System.out.print("* ");
            }

            //decreasing triangle
            for(int j = i; j<=n; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
