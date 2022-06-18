package ThiGiuaKyD3;

import java.util.StringTokenizer;

public class cau2 {
	public static int sumIntergerInString(String s) {
		int result = 0;
		StringTokenizer Token = new StringTokenizer(s);
		while (Token.hasMoreTokens()) {
			String t = Token.nextToken();
			char[] charArr = t.toCharArray();
			boolean check = true;
			for (int i = 0; i < charArr.length; i++) {
				if (charArr[i] < '0' || charArr[i] > '9') {
					check = false;
				}
			}
			if (check)
				result += Integer.valueOf(t);
		}

		return result;
	}

	public static void main(String[] args) {
		String s = "hah 6 hah4 shdh 8";
		System.out.println(sumIntergerInString(s));
	}
}
