public class Demo{
  public static void main(String[] args) {
    if (args.length > 0){
      printLoop(Integer.parseInt(args[0]));
    } else {
      printLoop(5);
    }
    // int[][] arr = create2DArrayRandomized(4,10,100);
    // System.out.println(arrayDeepToString(arr).replace("}, ", "}, \n"));
  }
  public static void printLoop(int n) {
    int i = 1;
    for (; i <= n; i++){
      for(int j = 0; j < n+1-i; j++){
         System.out.print(String.valueOf(i));
      }
      System.out.println("");
    }
  }
  public static String arrToString(int[] arr) {
    String ans = "{";
    for (int i = 0; i < arr.length; i++) {
      ans += Integer.toString(arr[i]);
      if (i < arr.length - 1) ans += ", ";
    }
    return ans + "}";
  }
  public static String arrayDeepToString(int[][] arr) {
    String ans = "{";
    for (int i = 0; i < arr.length; i++) {
      ans += arrToString(arr[i]);
      if (i < arr.length - 1) ans += ", ";
    }
    return ans + "}";
  }
  public static int[][] create2DArray(int rows, int cols, int maxValue) {
    int[][] ans = new int[rows][cols];
    for (int i = 0; i < rows; i++) {
      for (int j = 0; j < cols; j++) {
        ans[i][j] = (int)((maxValue+1)*Math.random());
      }
    }
    return ans;
  }
  public static int[][] create2DArrayRandomized(int rows, int cols, int maxValue) {
    int[][] ans = new int[rows][];
    for (int i = 0; i < rows; i++) {
      ans[i] = new int[(int)((cols+1)*Math.random())];
      for (int j = 0; j < ans[i].length; j++) {
        ans[i][j] = (int)((maxValue+1)*Math.random());
      }
    }
    return ans;
  }
}
