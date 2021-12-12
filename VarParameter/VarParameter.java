public class VarParameter{
	public static void main(String[] args){
		Method method = new Method();
		int Sum = method.sum(1,3,8,35);
		System.out.println(Sum);
	}
}

class Method{
	//可以计算2个数的和，3个数的和，4，5
	//使用可变参数优化
	//1.int...表示接受的是可变参数 类型是int
	//2.使用可变参数时，可以当做数组来使用，即nums当作数组
	//3.遍历nums求和即可
	public int sum(int... nums){
		//System.out.println("接受的参数个数"+ nums.length);
		int res = 0;
		for(int i=0;i<nums.length;i++){
			res += nums[i];
		}
		return res;
	}
}

