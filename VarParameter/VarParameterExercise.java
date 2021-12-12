public class VarParameterExercise{
	public static void main(String[] args){
		Method methods = new Method();
		System.out.println(methods.showscores("Lucy",0,0,0,0,0));
	}
}
class Method{
	public String showscores(String name,double... scores){
		double TotalScores = 0;
		for(int i =0;i<scores.length;i++){
			TotalScores += scores[i];
		}
		return name+"有"+scores.length+"门课的成绩总分为"+TotalScores;
	}
}
