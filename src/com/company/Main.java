package com.company;

import java.util.Arrays;

public class Main{

    public static void main(String[] args) {
      int[] a = {9, 8, 7, 6, 5, 6, 78, 12, 89, 76 };
      method(a);

    }
    public static <T> void  method(int[] massiv){
        for (int i = 0; i < massiv.length; i++) {


            System.out.print(massiv[i] + " ");


        }
        int firstIndex = massiv[0];
        int lastIndex = massiv[massiv.length-1];
        System.out.println("\nBirinchi index: " + firstIndex);
        System.out.println("Akyrky index: " + lastIndex);
    }
}
