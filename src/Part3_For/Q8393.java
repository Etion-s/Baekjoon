/*
* 문제 : n이 주어졌을 때, 1부터 n까지 합을 구하는 프로그램
* 입력 : 첫째 줄에 n (1 ≤ n ≤ 10,000)이 주어진다
* 출력 : 1부터 n까지 합을 출력
* */
package Part3_For;

import java.util.Scanner;

public class Q8393 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int sum = 0;
        for(int i=1; i<num+1; i++){
            sum += i;
        }
        System.out.println(sum);
    }
}
