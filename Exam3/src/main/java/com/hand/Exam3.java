package com.hand;


public class Exam3 {
    public static void main(String[] args) {
        int[] list = new int[50];
        for (int i = 0; i < list.length; i++) {
            int num = (int) (Math.random()*100);
            list[i] = num;
            if (list[i]%10 == 1 ) {

            }
        }
    }
}