package main.java.com.itechart.lesson2;

import java.util.Arrays;

public class arrayRandom {
    public static void main(String[] args) {

        int n = 222;
        double[] newArray = new double[n];
        for (int i = 0; i < newArray.length; i++) {
            newArray[i] = Math.random();
        }
     System.out.println(Arrays.toString(newArray));
    }

    public static double getMaxValue(double[] newArray) {
        double maxValue = newArray[0];
        for (int i = 1; i < newArray.length; i++) {
            if (newArray[i] > maxValue) {
                maxValue = newArray[i];
            }
        }
        return maxValue;
        // System.out.println(maxValue);
    }

    public static double getMinValue(double[] newArray) {
        double minValue = newArray[0];
        for (int i = 1; i < newArray.length; i++) {
            if (newArray[i] < minValue) {
                minValue = newArray[i];
            }
        }
        return minValue;
     //   System.out.println(minValue);
    }
}