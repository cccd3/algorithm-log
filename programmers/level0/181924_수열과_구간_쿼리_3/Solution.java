public class Solution {
    public int[] solution(int[] arr, int[][] queries) {
        for (int i = 0; i < queries.length; i++) {
            int temp = arr[queries[i][0]];
            arr[queries[i][0]] = arr[queries[i][1]];
            arr[queries[i][1]] = temp;
        }
        return arr;
    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        int[] result = sol.solution(
                new int[]{1, 2, 3, 4},
                new int[][]{{0, 1}, {1, 2}, {2, 3}}
        );
        System.out.println(java.util.Arrays.toString(result)); // [2, 3, 1, 4]
    }
}
