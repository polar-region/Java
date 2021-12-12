import java.util.Scanner;
public class ArrayReduce{
	public static void main(String[] args){
		int[] arr = {1,2,3,4,5};
                Scanner myScanner = new Scanner(System.in);
		for(int i =0 ; i<arr.length;i++){
			System.out.print(arr[i] + " ");
		}
		System.out.println();
		while(arr.length > 1){
		       	System.out.println("输入y/n确定是否需要删除最后一项");
			char key = myScanner.next().charAt(0);
			if(key == 'n'){
				break;
			}
			else if(key == 'y'){
				int[] arrNew;
				arrNew = new int[arr.length-1];
				for(int i = 0;i<arrNew.length;i++){
					arrNew[i] = arr[i];
				}
				arr = arrNew;
			}
			for(int i =0 ; i<arr.length;i++){
                        System.out.print(arr[i] + " ");
		}
		}
	}
}
