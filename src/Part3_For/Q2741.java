/*
* 자연수 N이 주어졌을 때, 1부터 N까지 한 줄에 하나씩 출력하는 프로그램을 작성*/
package Part3_For;

import java.util.Scanner;

public class Q2741 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for(int i=1; i<n+1; i++){
            System.out.println(i);
        }
    }
}
