package ThiGiuaKyD4;

import java.util.StringTokenizer;

public class cau2 {
	public static String sumIntergerInString(String s) {
		String result = "";
		s = s.toLowerCase();
		StringTokenizer token = new StringTokenizer(s);
		while (token.hasMoreTokens()) {
			String t = token.nextToken();
			char[] charArr = t.toCharArray();
			for (int i = 0; i < t.length(); i++) {
				boolean check = charArr[i] < '0' || charArr[i] > '9';
				if (i == 0 && check) {
					String r = String.valueOf(charArr[i]).toUpperCase();
					i++;
					result += r;
				}
				result += charArr[i];
			}
			result += " ";
		}

		return result.trim();
	}

	public static void main(String[] args) {
		String s = "hah 6 hah4 shd8h 8";
		System.out.println(sumIntergerInString(s));
	}
}
