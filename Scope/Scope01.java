public class Scope01{
	public static void main(String[] args){
	}
}

class Cat{
	//全局变量 作用域为Cat类
	int age = 10;
	double weight; //默认值是0.0

	public void hi(){
		//局部变量必须赋值后才能使用，因为没有默认值
		int num;
		//System.out.println(num);
		int sum = 1;
		System.out.println(sum);

		//全局变量可以不赋值，因为有默认值
		System.out.println(weight);
	}

	public void cry() {
		//局部变量
		//n,name的作用域只在cry中
		int n =1;

		String name = "Lucy";
	}

	public void eat(){
		System.out.println("在eat中使用age"+age);
	}
}
