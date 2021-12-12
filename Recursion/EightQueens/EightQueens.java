public class EightQueens{
	//解决八王后问题
	//递归回溯的方法
	//先设定个一维数组arr来表示放置棋子的位置
	//arr[m]=n表示棋子所在位置为(m,n)
	public int[] arr = new int[8];
	//一共有多少种解法
	public int count = 0;
	//需要遍历的次数
	public int loopCount = 0;
	//main函数使用solve方法来求解
	public static void main(String[] args){
		EightQueens queue = new EightQueens();
		queue.put(0);
		System.out.println("一共有<"+ queue.count + ">种解法, 并且要循环<" + queue.loopCount + ">次");
	}
	//solve方法进行递归回溯
	//int m表示正在放第m行的棋子(为第n+1个棋子)
	public void put(int m){
		//当m==8的时候就表示八个棋子已经全部放置完毕
		//所以count++
		//并且print()函数来打印
		if(m == 8){
			count++;
			print();
			return;
		}else{
			//如果没有放置完毕 那么继续假设放入i
			//check函数来检测是否满足要求
			for(int i =0;i<arr.length;i++){
				arr[m] = i;
				if(check(m)){
					//如果发现了满足要求的
					//那么开始放下一颗棋子
					put(m+1);
				}
			}
		}
	}
	//check函数来检测是否满足
	public boolean check(int m){
		//一旦检测表明循环次数多一次
		loopCount++;
		for(int i =0;i<m;i++){
			//直线/斜线都不行
			if(arr[i] == arr[m]||Math.abs(arr[i] - arr[m])==Math.abs(i-m)){
				return false;
			}
		}
		return true;
	}
	//print函数来打印结果
	public void print(){
		System.out.println("第"+count+"种情况如下:");
		for(int i =0;i<arr.length;i++){
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		System.out.println();
		for(int m = 0;m<arr.length;m++){
			for(int n =0;n<arr.length;n++){
				if(n == arr[m]){
					System.out.print("* ");
				}else{
					System.out.print("- ");
				}
			}
			System.out.println();
		}
		System.out.println();
	}
}

