public class Solution {
    public int solution(int num) {
        long n = num;
        int count = 0;

        while (n != 1) {
            if (n % 2 == 0) {
                n = n / 2;
            } else {
                n = n * 3 + 1;
            }

            count++;

            if (count == 500 && n != 1) {
                return -1;
            }
        }

        return count;
    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        System.out.println(sol.solution(6));   // 8
        System.out.println(sol.solution(16));  // 4
        System.out.println(sol.solution(626331)); // -1
    }
}
