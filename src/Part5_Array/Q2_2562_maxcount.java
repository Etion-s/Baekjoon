package Part5_Array;

import java.util.Arrays;
import java.util.Scanner;

public class Q2_2562_maxcount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //int N = sc.nextInt();

        int[] array = new int[9]; // 문제 배열을 담는곳
        int[] arr1 = new int[9];
        int[] arr2 = new int[9];


        for (int i=0; i<9; i++){
            array[i] = sc.nextInt();
        }

        System.arraycopy(array, 0, arr1, 0, array.length);
        System.arraycopy(array, 0, arr2, 0, array.length);

        Arrays.sort(arr1); // 복사된 arr1을 오름차순으로정리
        System.out.println(arr1[8]); // 가장큰값 85 출력

        int check = 1;
        int k=0;
        while(arr2[k] != arr1[8]){ // 좌항은 정렬안된 처음 배열 = 우항은 정렬된배열(가장큰값)
            k++;
            check++;
        } // 정렬 안된 배열을 계속해서 가장큰 수와 비교하는데 인덱스 순서와 동일한 변수를 선언해주고, 그것을 같이 증가시키면서 정렬전 값과 정렬후 최댓값이 같을떄 까지 계속 증가해주다가 맞으면 탈출한다
        System.out.println(check);
    }
}
