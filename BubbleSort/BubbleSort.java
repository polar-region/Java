public class BubbleSort{
	public static void main(String[] args){
		//冒泡排序(从小到大)
		int[] arr = {14,2,6,35,23,67,124};
		int temp;
		for(int i = 0;i<arr.length-1;i++){
			for(int j=0;j<arr.length-1-i;j++){
				if(arr[j]>arr[j+1]){
					temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
		}
		for(int i =0; i<arr.length;i++){
			System.out.print(arr[i]+"  ");
		}
		System.out.println();
	}
}
