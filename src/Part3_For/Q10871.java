/*정수 N개로 이루어진 수열 A와 정수 X가 주어진다.
이때, A에서 X보다 작은 수를 모두 출력하는 프로그램을 작성하시오.*/
package Part3_For;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Q10871 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int scale = sc.nextInt();
        int stand = sc.nextInt();
        int[] A = new int[scale];

        for (int i=0; i<A.length; i++){
            A[i] = sc.nextInt();
        }
        for (int i=0; i<A.length; i++){
            if (A[i]<stand){
                System.out.print(A[i] + " ");
            }
        }
        System.out.println();

    }
}
