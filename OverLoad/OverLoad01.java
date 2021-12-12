public class OverLoad01{
	public static void main(String[] args){
		//out.print可以输出各种类型的数据
		//out是PrintStream的对象
		//运行同名方法存在,但要求形参列表不一致
		//System.out.println(100);
		//System.out.println("hello world");
		MyCalculator mc = new MyCalculator();
		System.out.println(mc.calculate(1,2));
		System.out.println(mc.calculate(1.1,2)); 
	}
}
class MyCalculator{

	//下面四个 calculate方法构成了重载
	//两个int的和
	public int calculate(int n1,int n2){
		return n1+n2;
	}
	//一个int，一个double的和
	public double calculate(int n1,double n2){
		return n1+n2;
	}
	//一个double，一个int的和
	public double calculate(double n2,int n1){
		return n1+n2;
	}
	//三个int的和
	public int calculate(int n1,int n2,int n3){
		return n1+n2+n3;
	}
}
