import acm.program.ConsoleProgram;
import core.Striper;

public class Test extends ConsoleProgram{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public void run(){
		
//		ArrayList<String> ps = new ArrayList<String>();
//		ps.add("2");
//		ps.add("+");
//		ps.add("3");
//		ps.add("*");
//		ps.add("5");
//		Postfix post = new Postfix(ps);
//		post.parse();
//		println(post.toString());
//		
//		
//		println(post.calculateExp());
//		
		Striper st = new Striper("(2+(4*6))+4");
		//println(st.checkParenthesis());
		println(st.stripExpression());
		
		println(Striper.extractArrray("2 + 23.0"));
	
}

}
