public class Solution {
    public int solution(String t, String p) {
        int count = 0;
        long target = Long.parseLong(p);

        for (int i = 0; i <= t.length() - p.length(); i++) {
            long number = Long.parseLong(t.substring(i, i + p.length()));

            if (number <= target) {
                count++;
            }
        }

        return count;
    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        System.out.println(sol.solution("3141592", "271"));       // 2
        System.out.println(sol.solution("500220839878", "7"));    // 8
        System.out.println(sol.solution("10203", "15"));          // 3
    }
}
