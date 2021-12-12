public class ScopeDetail{
	public static void main(String[] args){
		Person p1 = new Person();
		//当执行say方法时，say方法的局部变量name会创建
		//当say执行完毕后，name局部变量将销毁，但是属性仍然可用
		p1.say();

		T t1 = new T();
		t1.print();
		t1.test(p1);
	}
}

class T{
	public void print(){
		//直接创建新的空间Person
		Person p1 = new Person();
		System.out.println(p1.name);
	}
	public void test(Person p){
		//直接指向Person
		System.out.println(p.name);
	}
}

class Person{
	//作用域:本person类 或者其他类(对象调用)
	//可以加修饰符
	String name = "Lucy";

	public void say() {
		//属性和局部变量可以重名
		//访问满足就近原则
		String name = "Lee";
		//就近原则 输出lee
		System.out.println("say() name" + name);
	}
	public void hello() {
		System.out.println("hello() name = "+ name);
	}
}
