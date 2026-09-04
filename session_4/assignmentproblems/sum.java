import java.util.Arrays;
class sum {
    static int[][] threeSum(int[] nums) {
        Arrays.sort(nums);
        int[][] result = new int[nums.length][3];
        int count = 0;
        for (int i = 0; i < nums.length - 2; i++) {
            int left = i + 1;
            int right = nums.length - 1;
            while (left < right) {
                int sum = nums[i] + nums[left] + nums[right];
                if (sum == 0) {
                    result[count][0] = nums[i];
                    result[count][1] = nums[left];
                    result[count][2] = nums[right];
                    count++;
                    left++;
                    right--;
                }
                else if (sum < 0)
                    left++;
                else
                    right--;
            }
        }
        return Arrays.copyOf(result, count);
    }
    public static void main(String[] args) {
        int[] nums = {-1, 0, 1, 2, -1, -4};
        int[][] result = threeSum(nums);
        for (int i = 0; i < result.length; i++)
            System.out.println(result[i][0] + " " + result[i][1] + " " + result[i][2]);
    }
}