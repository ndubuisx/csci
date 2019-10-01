class Main
{
  public static void main(String[] args)
  {
    int[][] matrix = {{ 3, 7, 11, 23, 45 }, { 5, 9, 13, 25, 50 }, { 7, 14, 15, 30, 55 },
                      { 10, 18, 22, 34, 62 }, { 16, 24, 29, 38, 88 }};

    for (int j = 0; j < matrix.length; j++)
    {
      for (int k = 0; k < matrix.length; k++)
      {
        Search2D(matrix, matrix[j][k]);
      }
    }
  }

  public static void Search2D(int[][] arr, int key)
  {
    boolean found = false;
    int count = 0;
    int pointer = arr.length-1;

    outerloop:
    for (int i = 0; i < arr.length; i++)
    {
      int[] row = arr[i];

      while (pointer >= 0)
      {
        System.out.printf("Searching (%s, %s) \n", i, pointer);

        if (key == row[pointer])
        {
          count++;
          found = true;
          System.out.printf("The key %s was found @ (%s, %s) \n", key, i, pointer);
          pointer--;
        }
        else if (row[pointer] > key)
        {
          count++;
          pointer--;
        }
        else
        {
          continue outerloop;
        }
      }
    }

    if (!found)
    {
      System.out.printf("The key %s was not found in the array \n", key);
    }

    System.out.printf("The number of comparisons was: %s \n", count);
    System.out.println("---------------------------------");
  }
}