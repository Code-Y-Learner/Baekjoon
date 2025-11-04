import java.util.*;
import java.io.*;
public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine());
		String s = st.nextToken();
		int n = Integer.parseInt(st.nextToken());
		long m = 0;
		int len = s.length();
		for (int i = 0; i < len; i++) {
			if (s.charAt(len - i - 1) <= 'Z' && s.charAt(len - i - 1) >= 'A') {
				m = (long) (m + (s.charAt(len - i - 1) - 55) * Math.pow(n, i));
			}
			else {
				m = (long) (m + (s.charAt(len - i - 1) - '0') * Math.pow(n, i));
			}
//			bw.write(String.valueOf(m) + "\n");
		}
		bw.write(String.valueOf(m));
		bw.flush();
	}
}
