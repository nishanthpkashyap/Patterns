package com.nishanthpkashyap.patterns;

public class _6_Reverse_Hill {
    public static void main(String[] args) {
        int n = 5;
        for(int i = 1; i <= n; i++) {

            //increasing triangle space
            for(int j = 1; j <= i; j++) {
                System.out.print("  ");
            }

            //decreasing triangle with one less column as to avoid symmetry between the 2 triangles
            for(int j = i; j <= n-1; j++) {
                System.out.print("* ");
            }

            //decreasing triangle
            for(int j = i; j <= n; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
