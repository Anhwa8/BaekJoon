import java.util.*;
public class Main {
    public static void main(String[] args) throws Exception  {
		Scanner in = new Scanner(System.in);
		int a,b;
    while(in.hasNextInt()){
      a = in.nextInt();
      b = in.nextInt();
      System.out.println(a+b);
      }
      in.close();
    }
}