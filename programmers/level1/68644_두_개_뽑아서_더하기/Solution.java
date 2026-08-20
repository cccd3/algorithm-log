import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Solution {
    public int[] solution(int[] numbers) {
        Set<Integer> sums = new HashSet<>();

        for (int i = 0; i < numbers.length; i++) {
            for (int j = i + 1; j < numbers.length; j++) {
                sums.add(numbers[i] + numbers[j]);
            }
        }

        int[] answer = new int[sums.size()];
        int index = 0;

        for (int sum : sums) {
            answer[index++] = sum;
        }

        Arrays.sort(answer);
        return answer;
    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        System.out.println(Arrays.toString(sol.solution(new int[] {2, 1, 3, 4, 1})));
        System.out.println(Arrays.toString(sol.solution(new int[] {5, 0, 2, 7})));
    }
}
