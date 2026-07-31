public class Solution {
    public int solution(int n) {
        StringBuilder sb = new StringBuilder();
        int result = 0;

        while (n > 0) {
            sb.append(n % 3);
            n /= 3;
        }

        for (int i = 0; i < sb.length(); i++) {
            int digit = sb.charAt(i) - '0';
            result = result * 3 + digit;
        }
        return result;
    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        System.out.println(sol.solution(45)); // 7
        System.out.println(sol.solution(125)); // 229
    }
}
