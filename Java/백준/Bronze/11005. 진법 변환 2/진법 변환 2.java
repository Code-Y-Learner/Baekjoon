import java.util.*;
import java.io.*;
public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine());

		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		StringBuilder sb = new StringBuilder();
		while (N > 0) {
			if (N % M >= 10) {
				sb.append((char) (N % M + 55));
			}
			else {
				sb.append((char) (N % M + '0'));
			}
			N /= M;
		}
		bw.write(sb.reverse().toString());
		bw.flush();
	}
}
