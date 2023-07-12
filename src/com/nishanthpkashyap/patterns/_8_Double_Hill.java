package com.nishanthpkashyap.patterns;

public class _8_Double_Hill {
    public static void main(String[] args) {
        int n = 5;

        for(int i = 1; i <= n; i++) {

            // hill no: 1

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

            //hill no: 2

            //decreasing triangle space
            for(int j = i; j <= n-2; j++){
                System.out.print("  ");
            }

            //decreasing triangle space with one less column
            for (int j = i; j <= n-1; j++) {
                System.out.print("  ");
            }

            //increasing triangle with one less column
            for (int j = 1; j <= i-1; j++){
                System.out.print("* ");
            }

            //increasing triangle
            for (int j = 1; j <= i; j++){
                //dont print the last star, skip it...
                if(j==n)
                    continue;
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println();
    }
}
