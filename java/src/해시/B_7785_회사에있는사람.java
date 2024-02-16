package 해시;
import java.util.*;
import java.io.*;

public class B_7785_회사에있는사람 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int num = Integer.parseInt(br.readLine());
        HashMap<String, Boolean> people = new HashMap<>();
        for (int i = 0; i < num; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            String person = st.nextToken();
            Boolean type = st.nextToken().equals("enter");
            if (type)
                people.put(person, true);
            else
                people.put(person, false);
        }

        String[] peopleKey = people.keySet().toArray(new String[people.size()]);
        Arrays.sort(peopleKey, Collections.reverseOrder());
        for (String str : peopleKey) {
            if (people.get(str)) {
                bw.write(str + "\n");
                bw.flush();
            }
        }
        br.close();
        bw.close();
    }
}
