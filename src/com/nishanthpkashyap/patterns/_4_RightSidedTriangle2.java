package com.nishanthpkashyap.patterns;

public class _4_RightSidedTriangle2 {
    public static void main(String[] args) {
        int n = 5;
        for(int i = 1; i <= n; i++) {

            //increasing triangle space
            for(int j = 1; j <= i; j++) {
                System.out.print("  ");
            }

            //decreasing triangle
            for(int j = i; j <= n; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
