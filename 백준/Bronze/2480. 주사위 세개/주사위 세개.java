import java.util.*;
public class Main {
    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner(System.in);
 
		int a, b, c;
		a = in.nextInt();
		b = in.nextInt();
		c = in.nextInt();
 
		if (a != b && b != c && a != c) { // 만약 모든 변수가 다른 경우
			int max;
			
			if (a > b) { // 만약 a > b 라면
				
				if (c > a) { // c > a > b 라면 
					max = c;
				} 
				
				else { // a > (b, c)
					max = a;
				}
			} else { // b > a 라면	
				if (c > b) { // c > b > a 라면
					max = c;
				}else { // b > (a, c)
					max = b;
				}
			}
			System.out.println(max * 100);
		}else { // 적어도 한 쌍 이상의 서로 같은 변수가 존재할 경우
            if (a == b && a == c) { // 3개의 변수가 모두 같은 경우
				System.out.println(10000 + a * 1000);
			}else {
                if(a == b || a == c) { // a가 b혹은 c랑만 같은 경우
					System.out.println(1000 + a * 100);
				} else { // b가 c랑 같은 경우
					System.out.println(1000 + b * 100);
				}
			}
		}
    }
}