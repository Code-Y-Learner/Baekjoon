import java.util.*;
import java.io.*;
public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine());
		String a = st.nextToken();
		String b = "1";

		for(int i = 0; i < a.length()/2; i++) {
			if (a.charAt(i)  != a.charAt(a.length()-i-1)) {
				b = "0";
				break;
			}
		}
		bw.write(b);
		bw.flush();
	}
}
