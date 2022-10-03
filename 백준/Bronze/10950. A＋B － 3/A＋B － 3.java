import java.util.Scanner;
 
public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int T = in.nextInt();
        
        int num;
        int[] sum = new int[T];
        
        for(int i=0; i<T; i++){
            int a = in.nextInt();
            int b = in.nextInt();

            num = a+b;
            sum[i] = num;
        }

        for(int i=0; i<T; i++){
            System.out.println(sum[i]);
        }
	}
}