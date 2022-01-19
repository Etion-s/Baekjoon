package Part7_String;

import java.util.Scanner;

public class Q3_10809_findABC {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("단어 입력: ");
        String stringAbc = sc.next();

        // 받은 단어를 char[]로 저장
        char[] arrAbc = stringAbc.toCharArray();

        // 출력시킬 int[] 선언 및 전부 -1로 생성
        int[] ABC = new int[26];
        for (int i=0; i<ABC.length; i++){
            ABC[i] = -1;
        }

        // 받은 단어를 알파벳 위치에 맞게 변환하는 작업 필요 b ->2 / a->1
        // 실제로 구동할 때는 -1을 해줘서 인덱스 값에 맞게 한다
        
    }
}
