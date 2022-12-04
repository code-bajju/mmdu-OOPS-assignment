public class assignment_8a1{
    public static int[][] nextGeneration(int inputGrid[][]) {
        int row = 4, col = 3;
        int[][] future = new int[row][col];
        // Repeat over each row
        for (int x = 0; x < row; x++) {
            // Repeat over each column
            for (int y = 0; y < col; y++) {
                int aliveNeighbours = 0;
                int rowAbove = Math.max(x - 1, 0);// the row above is x-1 but never less than 0 because that row
                // doesn't exist
                int rowBelow = Math.min(x + 1, row - 1); // the row below is never greater than the last row in the
                                                         // array (row - 1)
                int colLeft = Math.max(y - 1, 0); // go to the left one column, unless we are at the edge, then don't go
                                                  // past 0
                int colRight = Math.min(y + 1, col - 1);
                // ... continuing the same logic as above
                for (int rowToCheck = rowAbove; rowToCheck <= rowBelow; rowToCheck++)
                    for (int colToCheck = colLeft; colToCheck <= colRight; colToCheck++)
                        aliveNeighbours += inputGrid[rowToCheck][colToCheck];

                // remove the cell being evaluated from the neighbors count
                aliveNeighbours -= inputGrid[x][y];
                // simplified logic to remove unnecessary conditions
                // any cell with three neighbors is alive (past value doesn't matter)
                if (aliveNeighbours == 3)
                    future[x][y] = 1;
                // any cell with fewer than two live neighbors is dead (past value doesn't
                // matter)
                else if (aliveNeighbours < 2)
                    future[x][y] = 0;
                // any cell with more than three neighbors is dead (past value doesn't matter)
                else if (aliveNeighbours >= 4)
                    future[x][y] = 0;
                // any cell with two neighbors remains in its present state (regardless of what
                // the past value was)
                else if (aliveNeighbours == 2)
                    future[x][y] = inputGrid[x][y];
                else
                    throw new RuntimeException("Unhandled neighbor condition");// codition if throw an exception
            }
        }
        return future;
    }
    public static void main(String[] args) {
        //taking the input in which 0 shows Dead and 1 shows alive;
        int[][] game = { { 0, 1, 0 },
                { 0, 0, 1 },
                { 1, 1, 1 },
                { 0, 0, 0 }
        };
        var nextGen = nextGeneration(game);

        for (var row : nextGen) {
            for (var cell : row) {
                System.out.print(cell);
            }
            System.out.println();
        }
    }

}
