package Week2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class RightLeftCipher {
	public static void main(String[] args) throws IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		char[] string= in.readLine().toCharArray();
		StringBuilder sb = new StringBuilder();		
		for (int i = 0; i < Math.floor(string.length/2); i++) {
			if(string.length%2==0) {
			sb.insert(0, string[string.length-1-i]);
			sb.insert(0, string[i]);
			}
			else {
				sb.insert(0, string[i]);
				sb.insert(0, string[string.length-1-i]);				
			}
		}
		if(string.length%2==1) {
			sb.insert(0, string[string.length/2]);
		}
		System.out.println(sb);
	}
}

