import java.util.*;
public class Main {
    public static void main(String[] args) throws Exception  {
		Scanner in = new Scanner(System.in);
		int T = in.nextInt();
		int A, B;

		for(int i=1; i<=T; i++){
			A = in.nextInt();
			B = in.nextInt();
			System.out.println("Case #" + i + ": " + A + " + " + B +" = "+(A+B));
		}
    }
}