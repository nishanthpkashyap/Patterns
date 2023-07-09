package com.nishanthpkashyap.patterns;

public class _3_RightSidedTriangle1 {
    public static void main(String[] args) {
        int n = 5;
        for(int i = 1; i <= n; i++) {

            //decreasing triangle space
            for(int j = i; j <= n; j++) {
                System.out.print("  ");
            }

            //increasing triangle
            for(int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
