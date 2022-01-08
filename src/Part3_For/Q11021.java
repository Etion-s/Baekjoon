// 두 정수 A와 B를 입력받은 다음, A+B를 출력하는 프로그램을 작성
package Part3_For;

import java.io.*;
import java.util.StringTokenizer;

public class Q11021 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); // 단순한 생성자
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine()); // 여기서 몇 번 반복할거지 입력
        int count = 1;

        StringTokenizer st;

        for (int i=1; i<n+1; i++){
            st = new StringTokenizer(br.readLine(), " "); //br.readLine()으로 인해서 한줄 저장가능 이때 공백으로 토큰을 구분
            bw.write("Case #" + String.valueOf(i)+": "); // write로 바로 실행시 숫자가 깨져서 String으로 변환뒤 출력
            bw.write((Integer.parseInt(st.nextToken())+Integer.parseInt(st.nextToken()))+"\n");
            count++;
        }

        br.close();

        bw.flush();
        bw.close();
    }
}
