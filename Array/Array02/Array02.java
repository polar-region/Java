import java.util.Scanner;
public class Array02{
	public static void main(String[] args) {
		//演示 数据类型 数组名[] = new
		//循环输入5个成绩，保存到double数组，并输出
		//第一种动态分配方式
		//double scores[] = new double[5];
		//第二种动态分配方式
		double scores[];
		scores = new double[5];
		Scanner myScanner = new Scanner(System.in);
		for(int i = 0;i<scores.length;i++){
			System.out.println("请输入第"+(i+1)+"个元素");
			scores[i] = myScanner.nextDouble();
		}
		//输出，遍历数组
		System.out.println("==数组的元素/值的情况如下:==");
		for(int i =0;i<scores.length;i++){
			System.out.println("第"+(i+1)+"个元素的值为"+scores[i]);
		}
	}
}
