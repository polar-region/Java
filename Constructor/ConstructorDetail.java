public class ConstructorDetail{
	public static void main(String[] args){
		Person p1 = new Person("Lucy",19);//第一个构造器
		System.out.println("p1对象name="+p1.name);
		System.out.println("p1对象age="+p1.age);
		Person p2 = new Person("Lee");//第二个构造器
		System.out.println("p2对象name="+p2.name);

		Dog dog1 = new Dog();//使用的是默认无参构造器

	}
}

class Dog{
	//如果没有定义构造器
	//系统也会自动给类生成一个默认无参构造器
	//也叫做默认构造器  
	/*
	 * 默认构造器
	 * Dog(){
	 *
	 * }
	 */

	//一旦定义了构造器 那么默认构造器就被覆盖
	public Dog(String dName){

	}
	//也可以通过这种办法定义一个默认构造器
	Dog(){

	}
}

class Person{
	String name;
	int age;
	//一旦定义了构造器 那么默认构造器就被覆盖
	//第一个构造器
	public Person(String pName,int pAge){
		name = pName;
		age = pAge;
	}
	//第二个构造器
	public Person(String pName){
		name = pName;
	}
}
