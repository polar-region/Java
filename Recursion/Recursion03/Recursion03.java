public class Recursion03{
	public static void main(String[] args){
		AA a = new AA();
		int peach = a.peach(1);
		System.out.println(peach);
	}
}
class AA{
	public int peach(int date){
		if(date == 10){
			return 1;
		}
		else{
			return (peach(date+1)+1)*2;
		}
	}
}

