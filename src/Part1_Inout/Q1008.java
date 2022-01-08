package Part1_Inout;

import java.util.Scanner;

public class Q1008 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a,b;

        a = sc.nextDouble();
        b = sc.nextDouble();
        sc.close();
        System.out.println(a/b);

    }
}
/*
* close()라는 명령어는 System.in에 대한 오류를 막기 휘해서 사용한다
* 키보드를 사용 할떄는 상관 없지만, 파일들을 받을 때는 반드시 사용하는 습관을 키우자
* 백준 문제에서는 키보드로 받지만 정석으로 하기위해서 close를 안쓰면 컴파일 에러가 나온다
* */