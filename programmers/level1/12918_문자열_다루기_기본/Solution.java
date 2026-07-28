public class Solution {
    public boolean solution(String s) {
        if (!(s.length() == 4 || s.length() == 6)) {
            return false;
        }

        for (char ch : s.toCharArray()) {
            if (!(ch >= '0' && ch <= '9')) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        System.out.println(sol.solution("a234")); // false
        System.out.println(sol.solution("1234"));  // true
    }
}
