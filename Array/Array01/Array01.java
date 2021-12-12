public class Array01{
	public static void main(String[] args){
		//定义数组
		//1.double[] 表示 是double类型的数组
		//数组名字为hens
		//2.{3,5,1,3.4,2,50} 表示数据的值/元素
		double[] hens = {3,5,1,3.4,2,50};
		for( int i = 0 ; i<6 ; i++){
			System.out.println("第" + (i+1) + "个元素的值" + hens[i]);
		}
	}
}
