package Part4_While;


import java.io.*;
import java.util.StringTokenizer;

public class ex1 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;

        int T = Integer.parseInt(br.readLine());

        for (int i=1; i<=T; i++){
            st = new StringTokenizer(br.readLine());
            String a = st.nextToken();
            String b = st.nextToken();
            bw.write("Case #"+String.valueOf(i)+": ");
            bw.write(String.valueOf(Integer.parseInt(a)+Integer.parseInt(b)) + "\n");
        }
        br.close();
        bw.flush();
        bw.close();
    }
}
