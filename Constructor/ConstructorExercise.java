public class ConstructorExercise{
	public static void main(String[] args){
		Person p1 =new Person();
		System.out.println("p1的信息"+p1.age);
		Person p2 = new Person("Lee",18);
		System.out.println("p2的信息"+" "+p2.name+" "+p2.age);
	}
}

class Person{
	String name;
	int age;
	//第一个无参构造器
	public Person(){
		age = 18;
	}
	public Person(String pName,int pAge){
		name = pName;
		age = pAge;
	}
}
