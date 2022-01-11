package Part7_String;

import java.util.Scanner;

public class Q2_11720_NumAdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt(); // 받는 숫자 갯수
        String str = sc.next(); // 숫자를 받음
        char[] arr_char = new char[N]; // char배열 선언 및 생성
        int sum =0;

        for (int i=0; i< arr_char.length; i++){ // String의 charAt을 이용해서 문자열인텍스번호를 기준으로 char배열에 담기
            arr_char[i] = str.charAt(i);
        }

        for (int i=0; i< arr_char.length; i++) { // char배열에 담긴 데이터를 int형으로 바꿔주는 메소드를 활용하여 값더하기
            sum += Character.getNumericValue(arr_char[i]);
        }

        System.out.println(sum);
    }
}
