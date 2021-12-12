public class This01{
	public static void main(String[] args){
		Dog dog = new Dog("Lee",18);
		dog.info();
	}
}

class Dog{

        String name;
	int age;
        //一旦定义了构造器 那么默认构造器就被覆盖
        public Dog(String name,int age){
		//this.name 就是当前对象的属性
		this.name = name;
		//this.age 就是当前对象的属性
		this.age = age;
        }
	
	public void info(){
		System.out.println(name+" "+age);
	}
}
