package ex;
import java.util.StringTokenizer;

public class ReplaceWord {
	public ReplaceWord() {
		// TODO Auto-generated constructor stub
	}
	static public String replaceWord(String word, String Replace, String sentences) throws Throwable {
		String res="";
		StringTokenizer tk = new StringTokenizer(sentences);
		String element;
		boolean isExist=false;
		while(tk.hasMoreTokens()) {
			element = tk.nextToken();
			if(element.equals(word)) {
				element=Replace;
				isExist=true;
			}
			res+=element+" ";
		}
		if(!isExist) {
			throw new Exception("word does not exist!");
		}
		return res.trim();
	}
	public static void main(String[] args) {
		String sentences="i will pass exam";
		String replace="you";
		String word ="i";
		System.out.println("you will pass exam");
		try {
			System.out.println(replaceWord(word, replace, sentences));
		} catch (Throwable e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	System.out.println();
		replace = "you";
		word = "you";
		try {
			System.out.println(replaceWord(word, replace, sentences));
		System.out.println();
		}catch(Throwable e){
			e.printStackTrace();
		}
		
	}
}
