public class Solution {
    public int solution(int[][] sizes) {
        int maxWidth = 0;
        int maxHeight = 0;

        for (int[] size : sizes) {
            int longSize = Math.max(size[0], size[1]);
            int shortSize = Math.min(size[0], size[1]);

            maxWidth = Math.max(maxWidth, longSize);
            maxHeight = Math.max(maxHeight, shortSize);
        }

        return maxWidth * maxHeight;
    }

    public static void main(String[] args) {
        Solution sol = new Solution();

        int[][] sizes1 = {
                {60, 50}, {30, 70}, {60, 30}, {80, 40}
        };
        int[][] sizes2 = {
                {10, 7}, {12, 3}, {8, 15}, {14, 7}, {5, 15}
        };
        int[][] sizes3 = {
                {14, 4}, {19, 6}, {6, 16}, {18, 7}, {7, 11}
        };

        System.out.println(sol.solution(sizes1)); // 4000
        System.out.println(sol.solution(sizes2)); // 120
        System.out.println(sol.solution(sizes3)); // 133
    }
}
