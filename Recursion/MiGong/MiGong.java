public class MiGong{
	public static void main(String[] args){
		//绘制地图
		int[][] map = new int[8][7];
		for(int i =0;i<7;i++){
			map[0][i] = 1;
			map[7][i] = 1;
		}
		for(int i = 0;i<8;i++){
			map[i][0] = 1;
			map[i][6] = 1;
		}
		map[3][1] = 1;
		map[3][2] = 1;
		//输出地图
		System.out.println("-----地图-----");
		for(int i =0;i<map.length;i++){
			for(int j =0;j<map[i].length;j++){
				System.out.print(map[i][j]+" ");
			}
			System.out.println();
		}
		//寻找解决方案
		Solve s1 = new Solve();
		s1.findway(map,1,1);

		System.out.println("\n==找路的情况如下==");
		for(int i =0;i<map.length;i++){
                        for(int j =0;j<map[i].length;j++){
                                System.out.print(map[i][j]+" ");
                        }
                        System.out.println();
                }

	}
}
class Solve{
	//使用递归回溯来解决
	//boolen值表示是否找到了解决值
	//找到返回true 否则返回false
	//i，j 就是老鼠的位置
	//map各个值的含义
	//0 表示可以走 1 表示障碍物
	//2 表示走通了的路
	//3 表示走不通的路
	//当(6，5)变成2的时候 表示走完了迷宫
	//先确定老鼠的找路策略 下->右->上->左
	public boolean findway(int[][] map,int i,int j){
		if(map[6][5] == 2){//说明已经找到
			return true;
		}
		else{
			if(map[i][j] == 0){//当前位置为0，说明可以走
				map[i][j] = 2;
				//使用找路策略，来确定是否真的走通
				if(findway(map,i+1,j)){//先走下
					return true;
				}else if(findway(map,i,j+1)){//右
					return true;
				}else if(findway(map,i-1,j)){//上
					return true;
				}else if(findway(map,i,j-1)){//左
					return true;
				}else{
					map[i][j] = 3;
					return false;
				}
			}else{ //map[i][j] = 1,2,3
				return false;
			}
		}
	}
}
