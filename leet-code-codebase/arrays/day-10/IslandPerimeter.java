public class IslandPerimeter {
    public int islandPerimeter(int[][] grid) {
        int perimeter = 0;
        int rows = grid.length, cols = grid[0].length;

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (grid[i][j] == 1) {
                    perimeter += 4;
                    if (i > 0 && grid[i-1][j] == 1) perimeter -= 2; // shared top
                    if (j > 0 && grid[i][j-1] == 1) perimeter -= 2; // shared left
                }
            }
        }
        return perimeter;
    }

}
