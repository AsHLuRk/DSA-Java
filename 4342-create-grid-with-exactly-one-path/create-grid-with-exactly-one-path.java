class Solution {
    public String[] createGrid(int m, int n) {
        String[] grid = new String[m];

        // Every row except the last: free cell in column 0, blocked elsewhere
        StringBuilder normalRow = new StringBuilder(".");
        for (int j = 1; j < n; j++) {
            normalRow.append('#');
        }
        String top = normalRow.toString();

        // Last row: all free
        StringBuilder bottom = new StringBuilder();
        for (int j = 0; j < n; j++) {
            bottom.append('.');
        }

        for (int i = 0; i < m - 1; i++) {
            grid[i] = top;
        }
        grid[m - 1] = bottom.toString();

        return grid;
    }
}