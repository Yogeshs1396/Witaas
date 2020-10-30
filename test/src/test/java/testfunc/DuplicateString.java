package testfunc;

import java.util.HashMap;

public class DuplicateString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int cnt = 0;
		String s = "yogeshwaran";
		char[] c = s.toCharArray();
		int l = c.length;
		for (int i = 0; i <= l - 1; i++) { 

			for (int j = i + 1; j < l; j++) {
				if (c[i] == c[j]) {
					System.out.println(c[j]);
					cnt++;
					break;
				}
			}

		}
	}
}
