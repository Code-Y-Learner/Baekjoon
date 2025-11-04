import java.util.*;
import java.io.*;
public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		HashMap<String, Double> study = new HashMap<>();

		study.put("A+", 4.5);
		study.put("A0", 4.0);
		study.put("B+", 3.5);
		study.put("B0", 3.0);
		study.put("C+", 2.5);
		study.put("C0", 2.0);
		study.put("D+", 1.5);
		study.put("D0", 1.0);
		study.put("F", 0.0);
		Double a = 0.0;
		Double b = 0.0;

		for (int i = 0; i < 20; i ++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			String major = st.nextToken();
			Double baesu = Double.parseDouble(st.nextToken());
			String score = st.nextToken();

			if (score.equals("P")) {
				continue;
			}
			b += baesu * study.get(score);
			a += baesu;
		}
		bw.write(String.valueOf(b / a));
		bw.flush();
	}
}
