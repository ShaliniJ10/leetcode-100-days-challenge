class Solution {
    public int oddCells(int n, int m, int[][] indices) {
        boolean[] rows = new boolean[n], cols = new boolean[m];
        for (int[] indice : indices) {
            rows[indice[0]] ^= true;
            cols[indice[1]] ^= true;
        }
        
        int rowOdds = 0, colOdds = 0;
        for (int i = 0; i < n; i++) {
            rowOdds += rows[i] ? 1 : 0;
        }
        for (int i = 0; i < m; i++) {
            colOdds += cols[i] ? 1 : 0;
        }
        return rowOdds * (m - colOdds) + colOdds * (n - rowOdds);
        
    }
}
