import java.util.*;
public class Main {
    public static void main(String[] args) throws Exception  {
		Scanner in = new Scanner(System.in);
		int N = in.nextInt();

		for(int i=1; i<=N; i++){
			for(int j=0; j<i; j++){
				System.out.print("*");
			}
			System.out.println();
		}
    }
}