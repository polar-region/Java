public class ArrayCopy{
	public static void main(String[] args){
		int[] array1 = {1,2,3};
		int[] array2 = new int[array1.length];
		for(int i = 0 ; i<array1.length;i++){
			array2[i] = array1[i];}
		array1[0] = 4;
		array1[1] = 5;
		array1[2] = 6;
		for(int i = 0 ; i<array2.length;i++){
			System.out.println("第"+ (i+1)  +"个元素是" + array2[i]);
		}
		}
}
