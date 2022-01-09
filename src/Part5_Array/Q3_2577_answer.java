/*세 개의 자연수 A, B, C가 주어질 때 A × B × C를 계산한 결과에 0부터 9까지 각각의 숫자가
몇 번씩 쓰였는지를 구하는 프로그램을 작성하시오.
예를 들어 A = 150, B = 266, C = 427 이라면 A × B × C = 150 × 266 × 427 = 17037300 이
되고, 계산한 결과 17037300 에는 0이 3번, 1이 1번, 3이 2번, 7이 2번 쓰였다.
*/
package Part5_Array;

import java.util.Scanner;

public class Q3_2577_answer {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int value = (in.nextInt() * in.nextInt() * in.nextInt()); // 곱한 값담기
        String str = Integer.toString(value); // int->string by toString()
        in.close();

        for (int i = 0; i < 10; i++) { // 0~9까지의 수를 검사할 반복문
            int count = 0; // 개수 카운팅용
            for (int j = 0; j < str.length(); j++) { //
                if ((str.charAt(j) - '0') == i) { // 배열안의 해당문자열(j)와 0~9까지의 숫자
                    count++; //i가 같은지 반복한다. -0을 하는 이유는 char문자로 인한 아스키코드
                } // 값이 계산되므로 반드시 해준다
            }
            System.out.println(count);
        }

    }
}/*
이번 문장의 핵심은 이중 for문 안에서 조건을 주는 것이다.
==========================================================
나는 알고리즘을 사용 할 때 switch를 사용하였다
그이유는 0~9까지의 값을 저장하는곳을 배열로 선언하였기 때문에 하나하나 비교를 했지만
답지는 그곳을 for문의 i값으로 주고 count를 통해서 그 때 그때 출력했다
*/

