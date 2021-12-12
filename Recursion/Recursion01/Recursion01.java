public class Recursion01{
	public static void main(String[] args){
		AA a = new AA();
		//a.test(4);
		BB b =new BB();
		int n = b.factorial(4);
		System.out.println(n);
	}
}
//当栈结束后会回到原来的栈
//所以会先从n=4到n=2
//但是n=3和n=4的时候，栈并没有结束，所以还会运行
class AA{
	public void test(int n){
		if(n>2){
			test(n-1);
		}
		System.out.println("n = "+ n);
	}
}
class BB{
	public int factorial(int n ){
		if(n==1){
			return 1;
		} else{
			return factorial(n-1)*n;
		}
	}
}
