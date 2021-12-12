import java.util.Scanner;
public class Object01{
	public static void main(String[] args){
		//使用OOP面对对象解决
		Cat cat1 = new Cat();
		cat1.name = "小白";
		cat1.age = 3;
		cat1.color = "白色";
		//创建了第二只猫
		Cat cat2 = new Cat();
		cat2.name = "小花";
		cat2.age = 100;
		cat2.color = "花色";

		//怎么访问对象的属性呢
		System.out.println("第一只猫的信息"+" "+cat1.name+" "+ cat1.age+" "+cat1.color );
		System.out.println("第二只猫的信息"+" "+cat2.name+" "+ cat2.age+" "+cat2.color );
	}
}
class Cat{
	//属性/成员变量
	String name; //名字
	int age; //年龄
	String color; //颜色
}
