public class Solution {
    public int solution(String s) {
        String[] words = {
            "zero", "one", "two", "three", "four",
            "five", "six", "seven", "eight", "nine"
        };

        String str = s;

        for (int i = 0; i < words.length; i++) {
            str = str.replace(words[i], String.valueOf(i));
        }

        return Integer.parseInt(str);
    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        System.out.println(sol.solution("one4seveneight"));   // 1478
        System.out.println(sol.solution("23four5six7"));      // 234567
        System.out.println(sol.solution("2three45sixseven")); // 234567
        System.out.println(sol.solution("123"));              // 123
    }
}
