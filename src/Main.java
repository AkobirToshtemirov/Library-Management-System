import java.math.BigInteger;

public class Main {

    public static void main(String[] args) {
        Main main = new Main();

//        int[][] points = {{1, 3}, {3, 3}, {5, 3}, {2, 2}};
//
//        int[][] queries = {{2, 3, 1}, {4, 3, 1}, {1, 1, 2}};
//
//        System.out.println(Arrays.toString(main.countPoints(points, queries)));

        int[] nums = {2, 5, 6, 9, 10};
        System.out.println(main.findGCD(nums));

    }

    public int findGCD(int[] nums) {
        int min = nums[0];
        int max = nums[0];

        for (int i = 1; i < nums.length; i++) {
            min = Math.min(nums[i], min);
            max = Math.max(nums[i], max);
        }

        return findGCD(max, min);
    }

    public int findGCD(int n1, int n2) {
        return n1 == 0 ? n2 : findGCD(n2 % n1, n1);
    }

}