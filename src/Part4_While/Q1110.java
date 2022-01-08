package Part4_While;

import java.util.Scanner;

public class Q1110 {
    public static void main(String[] args) {
        int count=0, check=0;
        int first=0;
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        // a와b를 계속 num로 받고있다 처음에는 받고 나중에는 check를 기준으로 바꾸어야 한다 > while의 조건을 바꾸어 보자
        while(true){
            if(check==0 & num==0)
                count=1;
            if(check == num)
                break;
            if(first==0){
                int a = num/10;
                int b = num%10;
                check = b*10 + ((a+b)%10);
                count++;
                first++;
            } else{
                int x = check/10;
                int y = check%10;
                check = y*10 + ((x+y)%10);
                count++;
            }

        }

        System.out.println(count);
    }
}
