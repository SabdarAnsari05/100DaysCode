public class MaxMinArray {

    public static void maxMin(int[] arr) {
        int max = arr[0];
        int min = arr[0];

        for (int i=0; i<arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            } 
            if (arr[i] < min) {
                min = arr[i];
            }
        }

        System.out.println("Max: " + max);
        System.out.println("Min: " + min);
    }

    public static void main(String args[]) {

        int[] arr = { 3, 5, 1, 8, -2, 7 };
        maxMin(arr);
    }
}