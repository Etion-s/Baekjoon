package Part5_Array;

import java.util.Scanner;

public class Q3_2577_countNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a =sc.nextInt();
        int b =sc.nextInt();
        int c =sc.nextInt();

        String result_string = Integer.toString(a*b*c); // 세곱을 문자열로 변환
        char[] arr = result_string.toCharArray(); // 세곱문자열을 char배열로 변환
        int[] arr_int = new int[10]; // 각 자리숫자를 카운팅 해줄 배열 생성

        for (int i=0; i<arr.length; i++){
            switch(arr[i]) {
                case '0':
                    arr_int[0] += 1;
                    break;
                case '1':
                    arr_int[1] += 1;
                    break;
                case '2':
                    arr_int[2] += 1;
                    break;
                case '3':
                    arr_int[3] += 1;
                    break;
                case '4':
                    arr_int[4] += 1;
                    break;
                case '5':
                    arr_int[5] += 1;
                    break;
                case '6':
                    arr_int[6] += 1;
                    break;
                case '7':
                    arr_int[7] += 1;
                    break;
                case '8':
                    arr_int[8] += 1;
                    break;
                case '9':
                    arr_int[9] += 1;
                    break;
                default:
                    break;
            } //switch문을 통해서 카운팅배열의 값을 알맞게 증가
        }

        System.out.println(arr_int[0]); // 0 갯수출력

        for (int i=1;i<=arr_int.length-1;i++){ // 0을 제외해야 되기때문에 총 반복수는 전체-1
            System.out.println(arr_int[i]);
        }
    }
}
