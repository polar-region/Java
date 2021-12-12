import java.util.Scanner;
public class ArrayAdd{
	public static void main(String[] args){
		Scanner myScanner = new Scanner(System.in);
		int[] arr1 = {1,2,3};
		do{
		int[] arr2 = new int[arr1.length + 1];
		for(int i =0;i<arr1.length;i++){
			arr2[i] = arr1[i];
		}
		arr2[arr2.length-1] = arr1[arr1.length-1]+1;
		arr1 = arr2;
		for(int i =0;i<arr1.length;i++){
			System.out.print(arr2[i]+" ");
		}
		System.out.println("是否需要继续(y/n)");
		char key = myScanner.next().charAt(0);
		if(key == 'n'){
			break;
		}
		}while(true);
		
	}
}
