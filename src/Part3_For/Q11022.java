// Case #1: 1 + 1 = 2 으로 표현
package Part3_For;

import java.io.*;
import java.util.StringTokenizer;

public class Q11022 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        StringTokenizer st;

        for (int i = 1; i < n+1; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            String a = st.nextToken();
            String b = st.nextToken();
            int sum = Integer.parseInt(a)+Integer.parseInt(b);
            bw.write("Case #" + String.valueOf(i) + ": "+a+" + "+b+" = "+String.valueOf(sum)+"\n");
        }
        br.close();

        bw.flush();
        bw.close();
    }

}
