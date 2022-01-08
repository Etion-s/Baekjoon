/*Scanner 대신 BufferredWriter 사용해보기*/
package Part3_For;

import java.io.*;
import java.util.StringTokenizer;


public class Q15552 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); // 콘솔로 입력받는다 (파일은 따로있음)
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out)); //sout과 같은 효과

        int N = Integer.parseInt(br.readLine()); // br을 통해서 읽어온 문자열을 10진수Integer로 반환

        StringTokenizer st; //문자열을 우리가 지정한 구분자로 나눠주는 클래스

        for (int i=0; i<N; i++){
            st = new StringTokenizer(br.readLine()," "); // br로 읽어온 문자열을 공백으로 구분해서 나누어진 토큰들을 st에 저장
            bw.write((Integer.parseInt(st.nextToken()) + Integer.parseInt(st.nextToken()))+"\n"); // 윗줄에서 반환 되는 것이 str 임으로 parselnt을 통해 int형으로 변환

        }
        br.close();

        bw.flush(); // 남아있는 데이터 출력
        bw.close();
    }
}
/*for문 해석
* 18줄은 scanner와 다르게 한줄씩 읽고 스페이스로 구분하기위해서 1+1을 하려면 1쓰고 한칸 띄우고 1
* 을 적으면 토큰이 string타입으로 1,1이 생긴다
* 그리고 19줄에서 Integer.parseInt를 통해 가져온 것을 int형으로 변환 시키고 더해준다*/