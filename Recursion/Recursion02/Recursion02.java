import java.util.Scanner;
public class Recursion02{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		AA a = new AA();
		int m =a.fibonacci(n);
		if(m != -1){
		System.out.println("当n="+n+"fibonacci的值为"+m);
	}
	}
}

class AA{
	public int fibonacci(int n){
		if(n >= 1){
			if(n == 1||n == 2){
				return 1;
			}
			else{
				return (fibonacci(n-1)+fibonacci(n-2));
			}
		}
		else{
			System.out.println("您的输入不符合规范");
			return -1;
		}
	}
}
