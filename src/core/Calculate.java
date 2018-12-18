package core;

public class Calculate {

	private static Striper str;
	private static String ans = "";
	
	public static boolean  calc(String expression) {
		boolean return_value = true;
		try {
			str = new Striper(expression);
			ans = str.stripExpression();
			
		}catch(Exception e){
			return_value = false;
		}
		
		return return_value;
	}
	
	public static String getAnswer() {
		return ans;
	}
}
