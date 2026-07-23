public class Solution {
    public long solution(long n) {
        for (long i = 1; i * i <= n; i++) {
            if (i * i == n) {
                return (i + 1) * (i + 1);
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        System.out.println(sol.solution(121)); // 144
        System.out.println(sol.solution(3));    // -1
    }
}
