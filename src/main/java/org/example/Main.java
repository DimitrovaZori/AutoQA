package org.example;

public class Main {
    public static void main(String[] args) {

        int [] numbers = new int[] {-5, 6, -7, 8, -9, 10, -11};
        int sum = 0;
        int count = 0;
        for (int num : numbers){
            if (num < 0){
                sum = sum + num;
                count++;
            }
        }
        double average = sum/count;

        System.out.println("Sum of negative nums is " + average);



    }
}