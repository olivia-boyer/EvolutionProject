import java.util.Random;

public class Farm{

    public class Farm implements Comparable<Farm> {
      public final int WIDTH = 73;
      public final int HEIGHT = 53;

      public final int EMPTY = 0;
      public final int UNPLANTABLE = -1;
      public final int POND = -2;

      private final int[][] BASE_MAP = createBaseMap();

      public int[][] layout;

      public Farm() {
        this.grid = new int[HEIGHT][WIDTH];
        for (int r = 0; r < HEIGHT; r++) {
          System.arraycopy(BASE_MAP[r], 0, this.grid[r], 0, WIDTH);
        }
      }

      private static int[][] createBaseMap() {
        int[][] map = new int[HEIGHT][WIDTH];

        // each row is {x1, x2, y1, y2}
        int[][] blocked = {
          // greenhouse
          {22, 32, 2, 9}, {22, 30, 10, 11},
          // left edge
          {1, 4, 15, 26}, {1, 3, 27, 27}, {1, 2, 28, 28}, {1, 1, 29, 29},
          // house
          {56, 73, 1, 7}, {70, 73, 8, 9}, {56, 68, 8, 8}, {56, 67, 9, 9},
          {55, 55, 1, 5}, {54, 54, 1, 4}, {53, 53, 1, 3}, {52, 52, 1, 1}
          // small pond
          
        };
        
      }

    }

    public void randomize() {}

    public double getFitness() {
        return 0.0;
    }
}
