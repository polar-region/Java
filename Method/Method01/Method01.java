import java.util.Scanner;
public class Method01{
	public static void main(String[] args){
		Person p1 = new Person();
		p1.speak();
		p1.cal01();
		p1.cal02();
	}
}
class Person{
	String name;
	int age;
	public void speak() {
		System.out.println("我是一个好人");
	}
	public void cal01(){
		int sum = 0;
		for(int i= 1;i<=100;i++){
			sum += i;
		}
		System.out.println("最终的数值为"+sum);
	}
	public void cal02(){
		Scanner myScanner = new Scanner(System.in);
		int m = myScanner.nextInt();
		int sum = 0;
		for(int i = 1;i<=m;i++){
			sum+= i;
		}
	        System.out.println("最终的数值为"+sum);	
	}
}
