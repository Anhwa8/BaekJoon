 import java.util.Scanner;
 public class Main {
	public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        int num=0;
        if(1<=n && n<=10000){
            for(int i=1; i<=n; i++){
                num+=i;
            }
        }
        System.out.println(num);
	}
}