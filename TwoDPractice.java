public class TwoDPractice
{
    public static void main(String[] args)
    {
        int[][] grid = generate2D();
        print2D(grid);
    }
    
    public static int[][] generate2D()
    {
        int[][] grid = generate2D(4);
        return grid;
    }
    
    public static int[][] generate2D(int dim)
    {
        int[][] grid = new int[dim][dim];
        int counter = 1;
        for(int[] row: grid)
        {
            for(int n = 0; n < row.length; n++)
            {
                row[n] = counter;
                ++counter;
            }
        }
        return grid;
            
    }
    
    public static void print2D(int[][] a)
    {
        for(int[] row: a)
        {
            System.out.println("---------------------------------");
            for(int n: row)
            {
                if(n < 10)
                    System.out.print(" " + n + " |");
                else
                    System.out.print(" " + n + "|");
            }
            System.out.println();
        }
    }
}