// 첫째 줄에는 별 1개, 둘째 줄에는 별 2개, N번째 줄에는 별 N개를 찍는 문제
package Part3_For;


import java.util.Scanner;

public class Q2438 {
    public static void main(String[] args)  {
        Scanner sc = new Scanner(System.in);
        String star = "*";
        int number = sc.nextInt();

        for (int i=1; i<number+1; i++){
            for (int j=0; j<i; j++){
                System.out.print(star);
            }
            System.out.println();
        }
    }
}
