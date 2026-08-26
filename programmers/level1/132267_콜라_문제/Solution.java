public class Solution {
    public int solution(int a, int b, int n) {
        int answer = 0;

        while (n >= a) {
            int received = (n / a) * b;

            answer += received;
            n = (n % a) + received;
        }

        return answer;
    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        System.out.println(sol.solution(2, 1, 20)); // 19
        System.out.println(sol.solution(3, 1, 20)); // 9
    }
}
