public class Solution {
    public long solution(int price, int money, int count) {
        long total = 0;

        for (int i = 1; i <= count; i++) {
            total += (long) price * i;
        }

        if (total >= money) {
            return total - money;
        } else {
            return 0;
        }
    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        System.out.println(sol.solution(3, 20, 4));  // 10
        System.out.println(sol.solution(1, 42, 5));   // 0
    }
}
