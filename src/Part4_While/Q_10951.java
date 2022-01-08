package Part4_While;

import java.util.Scanner;

public class Q_10951 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while(sc.hasNextInt()){ // 백준사이트에서 구동하기 위해서는 필수(설명은 밑에줄 참조)
            int a = sc.nextInt();
            int b = sc.nextInt();
            if (a==0 && b==0)
                break;
            System.out.println(a+b);
        }
        sc.close();
    }
}
/*
* 이번문제의 핵심은 입력의 종료는 더이상 읽을 수 없는 데이터(EOF)가 없을 떄 종료한다
* ======================================================================
* EOF란?
* 이번문제에서 종료를 하기 위해서는 입력에서 더이상의 읽을 수 있는 데이터가 존재하지 않을 떄 종료하는 것이다
* 이것을 우리는 EOF(End Of File)이라고 한다
* ====================================================================
* Scanner의 EOF
* 더이상 읽을 데이터가 없으면 NoSuchElementException던지게 됨
* 해결방안 1. try-catch문으로 예외 발생시 반복문 종료
*        2. Scanner의 메소드인 hasNext()를 통해 처리
*  -hasNextInt():입력값이 정수일 경우 treu반환하고, 정수가 아니면 바로 예외를 던지면서 더이상의
*   입력을 받지 않고 false를 반환한다*/
