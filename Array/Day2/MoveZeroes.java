public class MoveZeroes {

    public static void moveZeroes(int[] nums) {
        int insertPos = 0;

        for (int num : nums) {
            if (num != 0) {
                nums[insertPos] = num;
                insertPos++;
            }
        }

        while (insertPos < nums.length) {
            nums[insertPos] = 0;
            insertPos++;
        }
    }

    public static void main(String args[]) {

        int[] nums = {0,1,0,3,12};
        moveZeroes(nums);

        for(int num : nums) {
            System.out.print(num + " ");
        }
    }
}