public class Demo{
  public static void main(String[] args) {
    if (args.length > 0){
      printLoop(Integer.parseInt(args[0]));
    } else {
      printLoop(5);
    }
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
}
