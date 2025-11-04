import java.util.*;
import java.io.*;
public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		char[][] words = new char[5][15];
		for (int i = 0; i < 5; i++) {
			String s = br.readLine();
			for (int j = 0; j < s.length(); j++) {
				words[i][j] = s.charAt(j);
			}
		}
		for (int i = 0; i < 15; i++) {
			for (int j = 0; j < 5; j++) {
				if (words[j][i] != '\u0000') {
					bw.write(words[j][i]);
				}
			}
		}
		bw.flush();
	}
}
