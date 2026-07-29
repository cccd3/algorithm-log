public class Solution {
    public int[][] solution(int[][] arr1, int[][] arr2) {
        int[][] result = new int[arr1.length][arr1[0].length];

        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr1[0].length; j++) {
                result[i][j] = arr1[i][j] + arr2[i][j];
            }
        }
        return result;
    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        int[][] arr1 = {{1, 2}, {2, 3}};
        int[][] arr2 = {{3, 4}, {5, 6}};
        for (int[] row : sol.solution(arr1, arr2)) {
            System.out.println(java.util.Arrays.toString(row));
        }
        // [[4, 6], [7, 9]]
    }
}
