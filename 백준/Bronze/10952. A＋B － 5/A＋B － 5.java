import java.util.*;
public class Main {
    public static void main(String[] args) throws Exception  {
		Scanner in = new Scanner(System.in);
		int a,b;
    while(true){
      a = in.nextInt();
      b = in.nextInt();

      if(a==0 && b==0){
        in.close();
        break;
      }
      System.out.println(a+b);
      }
    }
}