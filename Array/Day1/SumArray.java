public class SumArray {
    public static int sumArray(int[] arr) {
        int sum = 0;
        for (int num : arr) {
            sum += num;
        }
        return sum;
    }

    public static void main(String[] args) {
        int[] arr = {3, 1, 5, 2, 4};
        int total = sumArray(arr);
        System.out.println("Sum = " + total);
    }
}
