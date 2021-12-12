public class ArrayAssign{
	public static void main(String[] args){
		int[] array1 = {1,2,3};
		int[] array2 = array1;
		array2[0] = 5;
		for(int i =0;i<array1.length;i++){
			System.out.println("array1的第" + (i+1) + "元素为" + array1[i] );
		}
	}
}
