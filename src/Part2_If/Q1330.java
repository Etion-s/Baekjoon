/*
* 두 정수 A와 B가 주어졌을 때, A와 B를 비교하는 프로그램*/
package Part2_If;

import java.util.Scanner;

public class Q1330 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        sc.close();

        if(a>b)
            System.out.println(">");
        if(a<b)
            System.out.println("<");
        if(a==b)
            System.out.println("==");
    }
}
