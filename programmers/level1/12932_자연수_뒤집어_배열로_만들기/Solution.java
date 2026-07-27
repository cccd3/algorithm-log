public class Solution {
    public int[] solution(long n) {

        long temp = n;
        int length = 0;
        while (temp > 0) {
            temp /= 10;
            length++;
        }

        int[] arr = new int[length];

        for (int i = 0; i < length; i++) {
            int num = (int) (n % 10);
            arr[i] = num;
            n /= 10;
        }

        return arr;
    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        System.out.println(java.util.Arrays.toString(sol.solution(12345))); // [5, 4, 3, 2, 1]
        System.out.println(java.util.Arrays.toString(sol.solution(100)));   // [0, 0, 1]
    }
}
